package com.lezenford.lesson5.mediator;

public class Main {
    public static void main(String[] args) {
        final CustomMediator mediator = new CustomMediator();

        final SimpleComponent simpleComponent = new SimpleComponent(mediator);
        final CustomComponent customComponent = new CustomComponent(mediator);

        simpleComponent.doSomething();
        customComponent.doSomething();
    }
}
