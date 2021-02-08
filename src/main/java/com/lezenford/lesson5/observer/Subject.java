package com.lezenford.lesson5.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    // подключить Наблюдателя
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // отключить Наблюдателя
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // проинформировать подписантов об изменениях
    protected void notify(Object arg){
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}

