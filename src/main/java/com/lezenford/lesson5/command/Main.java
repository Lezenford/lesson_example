package com.lezenford.lesson5.command;

import java.awt.*;

public class Main {
    private static final TextField textField = new TextField();
    public static void main(String[] args) {
       CommandExecutor executor = new CommandExecutor();
       executor.executeCommand(new CopyCommand(textField));
       executor.executeCommand(new PasteCommand(textField));
    }
}
