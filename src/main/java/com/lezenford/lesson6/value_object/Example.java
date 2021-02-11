package com.lezenford.lesson6.value_object;

import java.util.Objects;

public class Example {
    private final String name;
    private final String value;

    public Example(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Example example = (Example) o;
        return Objects.equals(name, example.name) && Objects.equals(value, example.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
