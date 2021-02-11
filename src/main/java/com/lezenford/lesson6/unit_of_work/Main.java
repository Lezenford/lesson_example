package com.lezenford.lesson6.unit_of_work;

public class Main {
    public static void main(String[] args) {
        try {
            UnitOfWork.newCurrent();
            System.out.println("Do something");
            UnitOfWork.getCurrent().commit();
        } finally {
            UnitOfWork.setCurrent(null);
        }
    }
}
