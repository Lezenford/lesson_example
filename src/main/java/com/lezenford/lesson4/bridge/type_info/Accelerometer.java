package com.lezenford.lesson4.bridge.type_info;

import com.lezenford.lesson4.bridge.SensorImpl;

public class Accelerometer implements SensorImpl {
    @Override
    public double getValue() {
        return 1/Math.random();
    }
}
