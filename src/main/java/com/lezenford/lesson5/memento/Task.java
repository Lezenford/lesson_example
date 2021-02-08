package com.lezenford.lesson5.memento;

public class Task {
    private int step;
    private String state;

    public void doSomething() {
        step = (int) (Math.random()*100.0);
        state = "step "+ step;
    }

    public Memento createSnapshot() {
        Memento memento = new Memento();
        memento.setState(state);
        memento.setStep(step);
        return memento;
    }

    public void restoreSnapshot(Memento snapshot) {
        step = snapshot.getStep();
        state = snapshot.getState();
    }

    @Override
    public String toString() {
        return "Task{" +
                "step=" + step +
                ", state='" + state + '\'' +
                '}';
    }
}
