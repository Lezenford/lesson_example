package com.lezenford.lesson5.state;

public class StopMusic implements State{
    @Override
    public void play(Player player) {
        System.out.println("Start music");
        player.setState(new PlayingMusic());
    }

    @Override
    public void stop(Player player) {
        //do nothing
    }

    @Override
    public void next(Player player) {
        System.out.println("Next sing");
        player.setState(new PlayingMusic());
    }

    @Override
    public void prev(Player player) {
        System.out.println("Prev sing");
        player.setState(new PlayingMusic());
    }
}
