package com.lezenford.lesson6.identity_map;

public class Main {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();

        final Person person = personDao.findById(1);
    }
}
