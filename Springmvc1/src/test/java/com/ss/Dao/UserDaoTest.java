package com.ss.Dao;

import com.ss.pojo.Person;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {

    @Autowired
    UserDao userDao;
    Person person = new Person();
    Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void addPerson() {

        person.setNAME("测试9");
        person.setGender("女");

        int i= userDao.addPerson(person);
       logger.info(i);
        logger.info("--------> "+ person.getId());
    }
    @Test
    public void updatePerson() {
        person = userDao.getPersonById(8);
        person.setNAME("王娇");
        person.setGender("女");
        int i = userDao.updatePerson(person);//操作成功返回1
        logger.info(i);
    }

    @Test
    public void deletePerson() {
        int i = userDao.deletePerson(123);
        logger.info("--------> "+ i);//返回0，没有删除成功。返回1，删除成功。
    }

    @Test
    public void getAll() {
        List list = userDao.getAll();
        logger.info(list);
    }

    @Test
    public void getPersonById() {
        person = userDao.getPersonById(8);
        logger.info(person);
    }

    @Test
    public void testBASE() {
        int i = userDao.seleteCount();
        logger.info("人数： "+i);
    }

    @Test // lambda表达式
    public void lambda(){
        List<String> AreYouOk = Arrays.asList("nihao","wohao","dajiahao","caishi","zhendehao");
        AreYouOk.forEach(x -> logger.info(x));
        AreYouOk.forEach(logger::info);

    }

}