package com.gdou.survey.test;

import com.gdou.survey.dao.UserDao;

import com.gdou.survey.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 测试UserDao的工作
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserMapperTest {
    @Autowired
    UserDao userDao;
    @Test
    public void testCRUD(){
        User user  = new User();
        user.setCreatTime(new Date());
        user.setUserName("测试数据3");
        user.setUserQ1("D");
        user.setUserQ2("A");
        user.setUserQ3("C");
        user.setUserQ4("AD");
        user.setUserQ5("A");
        user.setUserQ6("D");
        user.setUserQ7("B");
        user.setUserTel("15992537886");
        System.out.println(userDao.addUser(user));

    }

    @Test
    public void testList(){
        Map<String,Object> map = new HashMap();
        map.put("start",null);
        map.put("limit",null);
        List list= userDao.listUser(map);
        System.out.println(list);
    }

    @Test
    public void testCount(){
        System.out.println(userDao.countOption("user_q5","A"));
    }
}
