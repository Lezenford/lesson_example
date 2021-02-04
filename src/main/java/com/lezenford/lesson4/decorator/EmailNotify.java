package com.lezenford.lesson4.decorator;

public class EmailNotify implements Notify{
    @Override
    public void send() {
        System.out.println("send email");
    }
}
