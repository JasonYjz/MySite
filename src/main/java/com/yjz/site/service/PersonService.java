package com.yjz.site.service;

import com.yjz.site.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> getPersonList();
    Person getPersonById(int id);
    boolean addPerson(Person person);
    boolean deletePerson(int id);
    boolean modifyPerson(Person person);
}
