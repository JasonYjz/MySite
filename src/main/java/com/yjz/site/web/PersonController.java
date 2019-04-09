package com.yjz.site.web;

import com.yjz.site.entity.Person;
import com.yjz.site.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/getpersonbyid")
    private Map<String, Object> getPersonById(Integer id) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Person person = personService.getPersonById(id);
        modelMap.put("person", person);

        return modelMap;
    }

    @RequestMapping(value = "getpersonlist", method = RequestMethod.GET)
    private Map<String, Object> getPersonList() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
//        List<Person> persons = personService.getPersonList();
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person();
        person1.setId(1);
        person1.setAge(18);
        person1.setCreateTime(new Date());
        person1.setName("jason");
        person1.setPhone("13348874948");
        person1.setEmail("13348874948@126.com");

        Person person2 = new Person();
        person1.setId(2);
        person1.setAge(28);
        person1.setCreateTime(new Date());
        person1.setName("mali");
        person1.setPhone("13800138000");
        person1.setEmail("mali@126.com");

        persons.add(person1);
        persons.add(person2);
        modelMap.put("personList", persons);

        return modelMap;
    }
}
