package com.lezenford.lesson5.chain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Operator extends Handler {
    private final String name;
    @Override
    public void handle(Request request) {
        if(isBusy()) {
            System.out.printf("Operator %s is busy\n", name);
            super.handle(request);
        }
        else {
            System.out.printf("Operator %s is processing Request %s\n",
                              name, request.getData());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }

    // вероятность занятости оператора
    private final double probability = 0.9;

    // ...
}
