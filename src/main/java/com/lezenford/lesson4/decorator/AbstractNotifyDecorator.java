package com.lezenford.lesson4.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractNotifyDecorator implements Notify{
    private final Notify notify;

    @Override
    public void send() {
        notify.send();
    }
}
