package com.lezenford.lesson3.singleton;

public class Manager {
    private Manager() {
    }

    private static Manager manager;

    public static Manager getInstance() {
        if (manager == null) {
            synchronized (Manager.class) {
                if (manager == null) {
                    manager = new Manager();
                }
                return manager;
            }
        } else {
            return manager;
        }
    }
}
