package com.lezenford.lesson5.observer;

import lombok.Getter;

public class Sensor extends Subject {
    @Getter
    private int t;

    public void setT(int t) {
        this.t = t;
        notify(t);
    }
}

