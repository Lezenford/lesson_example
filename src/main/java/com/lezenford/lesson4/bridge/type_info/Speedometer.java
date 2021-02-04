package com.lezenford.lesson4.bridge.type_info;

import com.lezenford.lesson4.bridge.SensorImpl;

public class Speedometer implements SensorImpl {
    @Override
    public double getValue() {
        return Math.random();
    }
}

