package com.lezenford.lesson5.state;

public interface State {
    void play(Player player);
    void stop(Player player);
    void next(Player player);
    void prev(Player player);
}
