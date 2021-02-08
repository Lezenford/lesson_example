package com.lezenford.lesson5.command;

import lombok.RequiredArgsConstructor;

import java.awt.*;

@RequiredArgsConstructor
public class CopyCommand extends Command{
    private final TextField textField;

    @Override
    public void execute() {
        System.out.println("Copy to clickboard");
    }
}
