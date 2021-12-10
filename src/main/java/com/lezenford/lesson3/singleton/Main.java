package com.lezenford.lesson3.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Equals links for two instances");
        System.out.println(Manager.getInstance() == Manager.getInstance());
    }
}
