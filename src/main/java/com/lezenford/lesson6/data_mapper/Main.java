package com.lezenford.lesson6.data_mapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    //fake connection
    private final static Connection CONNECTION = (Connection) new Object();

    public static void main(String[] args) throws SQLException {
        ResultSet resultSet = CONNECTION.prepareStatement("SELECT * FROM Person").getResultSet();
        final List<Person> persons = PersonMapper.map(resultSet);
    }
}
