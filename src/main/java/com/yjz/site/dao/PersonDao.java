package com.yjz.site.dao;

import com.yjz.site.entity.Person;

import java.util.List;

public interface PersonDao {
    Person queryPersonById(int id);
    List<Person> queryPersons();
    int insertPerson(Person person);
    int updatePerson(Person person);
    int deletePerson(int id);
}
