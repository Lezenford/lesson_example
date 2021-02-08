package com.lezenford.lesson5.mediator;

import lombok.AccessLevel;
import lombok.Getter;

public class CustomComponent extends Component{
    @Getter(value = AccessLevel.PROTECTED)
    private final String name = "custom";

    public CustomComponent(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doSomething() {
        System.out.println("Custom invoke simple");
        mediator.findComponent("simple").doSomething();
    }
}
