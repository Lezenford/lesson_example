package com.lezenford.lesson4.decorator;

public class SmsNotify extends AbstractNotifyDecorator{
    public SmsNotify(Notify notify) {
        super(notify);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("send sms");
    }
}
