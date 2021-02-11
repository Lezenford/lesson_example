package com.lezenford.lesson6.data_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonMapper {
    public static List<Person> map(ResultSet rs) throws SQLException {
        List<Person> result = new ArrayList<>();
        while (rs.next()) {
            Person person = new Person();
            person.setName(rs.getString("name"));
            person.setSecondName(rs.getString("second_name"));
            person.setAge(rs.getInt("age"));
            result.add(person);
        }
        return result;
    }
}
