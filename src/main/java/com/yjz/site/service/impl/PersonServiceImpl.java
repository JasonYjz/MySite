package com.yjz.site.service.impl;

import com.yjz.site.dao.PersonDao;
import com.yjz.site.entity.Person;
import com.yjz.site.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> getPersonList() {
        return personDao.queryPersons();
    }

    @Override
    public Person getPersonById(int id) {
        return personDao.queryPersonById(id);
    }

    @Override
    public boolean addPerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        return false;
    }

    @Override
    public boolean modifyPerson(Person person) {
        return false;
    }
}
