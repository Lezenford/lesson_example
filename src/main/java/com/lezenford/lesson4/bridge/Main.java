package com.lezenford.lesson4.bridge;

import com.lezenford.lesson4.bridge.type_info.Accelerometer;
import com.lezenford.lesson4.bridge.type_info.Speedometer;
import com.lezenford.lesson4.bridge.type_measurement.AverageSensor;
import com.lezenford.lesson4.bridge.type_measurement.BaseSensor;

public class Main {
    public static void main(String[] args) {
        // создаем физические датчики
        Speedometer speedometer = new Speedometer();
        Accelerometer accelerometer = new Accelerometer();

        measure(speedometer);
        System.out.println("--------------------------");
        measure(accelerometer);

    }

    private static void measure(SensorImpl sensor) {
        System.out.println(sensor.getClass().getSimpleName());

        // датчик мгновенного значения
        BaseSensor baseSensor = new BaseSensor(sensor);
        // датчик усредненного значения по 5 последним измерениям
        AverageSensor averageSensor = new AverageSensor(sensor, 5);

        // серия измерений
        for (int i = 0; i < 10; i++) {
            System.out.printf("instant value : %f, average value: %f \n",
                              baseSensor.getValue(), averageSensor.getAverageValue()
                             );
        }
    }

}
