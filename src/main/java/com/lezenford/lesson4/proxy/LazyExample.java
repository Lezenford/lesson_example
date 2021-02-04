package com.lezenford.lesson4.proxy;

public class LazyExample {
    private Example example;

    public void test() {
        System.out.println("proxy call before lazy init");
        if (example == null) {
            example = new Example();
        }
        example.test();
    }
}
