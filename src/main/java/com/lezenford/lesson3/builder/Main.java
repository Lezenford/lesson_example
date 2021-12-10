package com.lezenford.lesson3.builder;

public class Main {
    public static void main(String[] args) {
        final User user = User.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .build();
        System.out.println(user);
    }
}
