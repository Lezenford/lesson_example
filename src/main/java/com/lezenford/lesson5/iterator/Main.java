package com.lezenford.lesson5.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");

        final Iterator<String> stringIterator = stringList.iterator();

        stringIterator.hasNext();
        stringIterator.next();
        stringIterator.remove();
    }
}
