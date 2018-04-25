package com.ss.service.Impl;

import com.ss.Dao.UserDao;
import com.ss.pojo.Person;
;
import com.ss.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")//将该对象加入容器，id为userService
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public int addPerson(Person person) {
        person.setCreateTime(System.currentTimeMillis());
        return userDao.addPerson(person);
    }

    public int updatePerson(Person person) {
        person.setUpdateTime(System.currentTimeMillis());
        return userDao.updatePerson(person);
    }

    public int deletePerson(int id) {
        return userDao.deletePerson(id);
    }

    public List<Person> getAll() {

        return userDao.getAll();
    }

    @Override
    public int seleteCount() {
        return userDao.seleteCount();
    }

    public Person getPersonById(int id) {

        return userDao.getPersonById(id);
    }
}
