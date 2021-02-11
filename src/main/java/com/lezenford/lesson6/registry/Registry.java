package com.lezenford.lesson6.registry;

import lombok.Getter;

@Getter
public class Registry {
    private final static Registry instance = new Registry();

    private OrderFinder orderFinder = new OrderFinder();
    private InstrumentFinder instrumentFinder = new InstrumentFinder();
    private UserFinder userFinder = new UserFinder();

    private Registry() {
    }

    public static Registry getInstance() {
        return instance;
    }
}
