package com.lezenford.lesson4.decorator;

public class PushNotify extends AbstractNotifyDecorator{
    public PushNotify(Notify notify) {
        super(notify);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("send push");
    }
}
