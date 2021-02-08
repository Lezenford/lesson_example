package com.lezenford.lesson5.mediator;

import lombok.AccessLevel;
import lombok.Getter;

public class SimpleComponent extends Component {
    @Getter(value = AccessLevel.PROTECTED)
    private final String name = "simple";

    public SimpleComponent(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doSomething() {
        System.out.println("Simple do something");
    }
}
