package com.lezenford.lesson4.bridge;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractSensor {
    protected final SensorImpl implementor;
}