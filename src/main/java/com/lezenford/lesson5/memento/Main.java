package com.lezenford.lesson5.memento;

public class Main {
    public static void main(String[] args) {
        final Task task = new Task();

        task.doSomething();
        task.doSomething();

        System.out.println(task);

        Memento snapshot = task.createSnapshot();
        task.doSomething();
        System.out.println(task);

        task.restoreSnapshot(snapshot);
        System.out.println(task);
    }
}
