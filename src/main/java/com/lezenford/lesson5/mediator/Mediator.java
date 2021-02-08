package com.lezenford.lesson5.mediator;

public interface Mediator {
    void registerComponent(Component component, String name);

    Component findComponent(String name);
}
