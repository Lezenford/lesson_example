package com.lezenford.lesson4.bridge.type_measurement;

import com.lezenford.lesson4.bridge.AbstractSensor;
import com.lezenford.lesson4.bridge.SensorImpl;

import java.util.LinkedList;
import java.util.Queue;

public class AverageSensor extends AbstractSensor {
    // очередь последних измерений
    private final Queue<Double> queue = new LinkedList<>();
    private final int n;

    // расширяем конструктор
    public AverageSensor(SensorImpl implementor, int n) {
        super(implementor);
        this.n = n;
    }

    // среднее по последним N измерениям
    public double getAverageValue() {
        queue.add(implementor.getValue());
        if(queue.size()>n)
            queue.remove();

        return queue.stream().mapToDouble(a -> a).average().orElse(0);
    }
}
