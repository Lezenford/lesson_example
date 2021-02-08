package com.lezenford.lesson5.mediator;

import java.util.HashMap;
import java.util.Map;

public class CustomMediator implements Mediator{
    private final Map<String, Component> components = new HashMap<>();
    @Override
    public void registerComponent(Component component, String name) {
        components.put(name, component);
    }

    @Override
    public Component findComponent(String name) {
        return components.get(name);
    }
}
