package com.lezenford.lesson4.proxy;

public class ExtendedProxyExample extends Example {
    @Override
    public void test() {
        System.out.println("proxy call");
        super.test();
    }
}
