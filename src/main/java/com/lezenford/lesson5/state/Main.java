package com.lezenford.lesson5.state;

public class Main {
    public static void main(String[] args) {
        final Player player = new Player();

        player.start();
        player.stop();
        System.out.println("--------------");
        player.start();
        player.start();
        System.out.println("--------------");
        player.stop();
        player.stop();
    }
}
