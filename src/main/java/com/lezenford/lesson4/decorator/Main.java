package com.lezenford.lesson4.decorator;

public class Main {
    public static void main(String[] args) {
        Notify notify = new EmailNotify();
        notify = new PushNotify(notify);
        notify = new SmsNotify(notify);
        notify.send();
    }
}
