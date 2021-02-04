package com.lezenford.lesson4.composite;

public class Main {
    public static void main(String[] args) {
        // инициализация операций
        Operation drill6 = new MachiningOperation("hole 6 mm");
        Operation drill5 = new MachiningOperation("hole 5 mm");
        Operation screw6 = new MachiningOperation("cut the M6 thread");
        Operation chamfer10 = new MachiningOperation("remove the 10mm chamfer");
        Operation m6composite = new CompositeOperation().add(drill5,screw6,chamfer10);

        // использование разных по структуре операций идентично
        drill6.perform();
        System.out.println("---------------------");
        m6composite.perform();
    }
}
