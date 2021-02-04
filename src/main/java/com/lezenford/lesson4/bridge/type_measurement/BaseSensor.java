package com.lezenford.lesson4.bridge.type_measurement;

import com.lezenford.lesson4.bridge.AbstractSensor;
import com.lezenford.lesson4.bridge.SensorImpl;

public class BaseSensor extends AbstractSensor {
    public BaseSensor(SensorImpl implementor) {
        super(implementor);
    }

    public double getValue() {
        return implementor.getValue();
    }
}

