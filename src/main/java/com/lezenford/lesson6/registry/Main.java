package com.lezenford.lesson6.registry;

public class Main {
    public static void main(String[] args) {
        final Registry instance = Registry.getInstance();

        final InstrumentFinder instrumentFinder = instance.getInstrumentFinder();
        final UserFinder userFinder = instance.getUserFinder();
        final OrderFinder orderFinder = instance.getOrderFinder();
    }
}
