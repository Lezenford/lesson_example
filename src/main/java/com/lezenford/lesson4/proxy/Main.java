package com.lezenford.lesson4.proxy;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        example.test();

        Example exampleProExample = new ExtendedProxyExample();
        exampleProExample.test();

        new LazyExample().test();

        new WrapProxyExample(example).test();
    }
}
