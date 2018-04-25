package com.ss.service;

import com.ss.Dao.UserDao;
import com.ss.pojo.Person;

import java.util.List;

public interface UserService {

    int addPerson(Person person);

    int updatePerson(Person user);

    int deletePerson(int id);

    List<Person> getAll();

    Person getPersonById(int id);

    int seleteCount();
}
