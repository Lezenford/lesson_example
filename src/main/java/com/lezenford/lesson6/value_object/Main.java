package com.lezenford.lesson6.value_object;

public class Main {
    public static void main(String[] args) {
        Example example1 = new Example("Test", "simple");
        Example example2 = new Example("Test", "simple");

        System.out.println("link equality: " + (example1 == example2));
        System.out.println("equality: " + example1.equals(example2));
    }
}
