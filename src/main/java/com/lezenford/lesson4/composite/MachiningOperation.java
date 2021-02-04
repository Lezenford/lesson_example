package com.lezenford.lesson4.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MachiningOperation implements Operation {
    private final String name;

    @Override
    public void perform() {
        System.out.println(name);
    }

    @Override
    public String getExplanation() {
        return name;
    }
}

