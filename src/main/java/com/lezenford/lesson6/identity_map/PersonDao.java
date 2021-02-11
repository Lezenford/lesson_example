package com.lezenford.lesson6.identity_map;

import java.util.HashMap;
import java.util.Map;

public class PersonDao {
    private final Map<Integer, Person> identityMap = new HashMap<>();

    public Person findById(int id) {
        Person person = identityMap.get(id);
        if (person == null) {
            //read from DB
            if (person != null) {
                identityMap.put(id, person);
            }
        }
        return person;
    }

    public void save(Person person) {
        identityMap.remove(person.getId());
        //save to DB
    }
}
