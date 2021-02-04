package com.lezenford.lesson4.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperation implements Operation {

    private final List<Operation> operations = new ArrayList<>();

    @Override
    public void perform() {
        System.out.printf("performing %s \n{\n",this.getClass().getSimpleName());
        for (Operation operation : operations) {
            operation.perform();
        }
        System.out.print("}");
    }

    @Override
    public String getExplanation() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Operation operation : operations) {
            builder.append(operation.getExplanation()).append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(",")).append("]");
        return builder.toString();
    }

    public Operation add(Operation... operations) {
        this.operations.addAll(Arrays.asList(operations));
        return this;
    }
}

