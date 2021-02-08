package com.lezenford.lesson5.chain;

public class BusyHandler extends Handler {
    private Request request;

    @Override
    public void handle(Request request) {
        if(this.request == request)
            System.out.println("All operators are busy, please wait");
        else
            this.request = request;

        super.handle(request);
    }
}
