package com.lezenford.lesson5.template;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        notifier.notify("test", "test", "test");
    }
}
