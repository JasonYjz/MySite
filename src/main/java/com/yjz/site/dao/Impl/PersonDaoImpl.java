package com.yjz.site.dao.Impl;

import com.yjz.site.dao.PersonDao;
import com.yjz.site.entity.Person;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public Person queryPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> queryPersons() {
        return null;
    }

    @Override
    public int insertPerson(Person person) {
        return 0;
    }

    @Override
    public int updatePerson(Person person) {
        return 0;
    }

    @Override
    public int deletePerson(int id) {
        return 0;
    }
}
