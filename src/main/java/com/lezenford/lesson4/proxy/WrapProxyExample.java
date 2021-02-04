package com.lezenford.lesson4.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WrapProxyExample {
    private final Example example;

    public void test() {
        System.out.println("proxy call");
        example.test();
    }
}
