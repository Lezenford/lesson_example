package com.lezenford.lesson5.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Sensor sensor = new Sensor();

        // подключаем наблюдателей за сенсором
        sensor.attach(new DisplayObserver());
        sensor.attach(new HeaterObserver(40, 100, 25));

        // начальное значение
        sensor.setT(20);

        // цикл энтропии – естественное охлаждение сенсора
        while (true){
            int random = (int) (Math.random() * 10);
            sensor.setT(sensor.getT() - random);

            Thread.sleep(500);
        }
    }
}
