package com.lezenford.lesson5.state;

public class PlayingMusic implements State{
    @Override
    public void play(Player player) {
        System.out.println("Stop music");
        player.setState(new StopMusic());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stop music");
        player.setState(new StopMusic());
    }

    @Override
    public void next(Player player) {
        System.out.println("Next sing");
    }

    @Override
    public void prev(Player player) {
        System.out.println("Prev sing");
    }
}
