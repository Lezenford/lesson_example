package com.lezenford.lesson5.state;

import lombok.Setter;

public class Player {
    @Setter
    private State state = new StopMusic();

    public void start(){
        state.play(this);
    }
    public void stop(){
        state.stop(this);
    }
    public void next(){
        state.next(this);
    }
    public void prev(){
        state.prev(this);
    }
}
