package com.lezenford.lesson5.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandExecutor {
    private final Deque<Command> history = new ArrayDeque<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }
}
