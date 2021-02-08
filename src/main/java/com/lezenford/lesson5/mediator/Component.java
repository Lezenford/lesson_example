package com.lezenford.lesson5.mediator;

public abstract class Component {
    protected final Mediator mediator;

    protected Component(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerComponent(this, getName());
    }

    protected abstract String getName();

    public abstract void doSomething();
}
