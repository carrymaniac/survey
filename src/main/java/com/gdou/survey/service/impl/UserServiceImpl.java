package com.gdou.survey.service.impl;

import com.gdou.survey.dao.UserDao;
import com.gdou.survey.entity.User;
import com.gdou.survey.service.UserService;
import com.gdou.survey.util.PageResult;
import com.gdou.survey.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    public int saveUser(User user) {
        return userDao.addUser(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public int removeUserById(int id) {
        return userDao.deleteUserById(id);
    }

    public PageResult listUser(PageUtil pageUtil) {
         List<User> list = userDao.listUser(pageUtil);
         int total = userDao.getTotalUser();
         PageResult pageResult = new PageResult(list,total,pageUtil.getLimit(),pageUtil.getPage());
         return pageResult;
    }

    public List<Map<String, Integer>> countOption() {
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();

        Map<String,Integer> map1 = new HashMap<String, Integer>();
        map1.put("A",userDao.countOption("user_q1","A"));
        map1.put("B",userDao.countOption("user_q1","B"));
        map1.put("C",userDao.countOption("user_q1","C"));
        map1.put("D",userDao.countOption("user_q1","D"));
        map1.put("E",userDao.countOption("user_q1","E"));
        map1.put("F",userDao.countOption("user_q1","F"));
        list.add(map1);

        Map<String,Integer> map2 = new HashMap<String, Integer>();
        map2.put("A",userDao.countOption("user_q2","A"));
        map2.put("B",userDao.countOption("user_q2","B"));
        map2.put("C",userDao.countOption("user_q2","C"));
        map2.put("D",userDao.countOption("user_q2","D"));
        list.add(map2);

        Map<String,Integer> map3 = new HashMap<String, Integer>();
        map3.put("A",userDao.countOption("user_q3","A"));
        map3.put("B",userDao.countOption("user_q3","B"));
        map3.put("C",userDao.countOption("user_q3","C"));
        map3.put("D",userDao.countOption("user_q3","D"));
        list.add(map3);

        Map<String,Integer> map4 = new HashMap<String, Integer>();
        map4.put("A",userDao.countOption("user_q4","A"));
        map4.put("B",userDao.countOption("user_q4","B"));
        map4.put("C",userDao.countOption("user_q4","C"));
        map4.put("D",userDao.countOption("user_q4","D"));
        map4.put("E",userDao.countOption("user_q4","E"));
        map4.put("F",userDao.countOption("user_q4","F"));
        map4.put("G",userDao.countOption("user_q4","G"));
        list.add(map4);

        Map<String,Integer> map5 = new HashMap<String, Integer>();
        map5.put("A",userDao.countOption("user_q5","A"));
        map5.put("B",userDao.countOption("user_q5","B"));
        map5.put("C",userDao.countOption("user_q5","C"));
        map5.put("D",userDao.countOption("user_q5","D"));
        map5.put("E",userDao.countOption("user_q5","E"));
        map5.put("F",userDao.countOption("user_q5","F"));
        list.add(map5);

        Map<String,Integer> map6 = new HashMap<String, Integer>();
        map6.put("A",userDao.countOption("user_q6","A"));
        map6.put("B",userDao.countOption("user_q6","B"));
        map6.put("C",userDao.countOption("user_q6","C"));
        list.add(map6);

        Map<String,Integer> map7 = new HashMap<String, Integer>();
        map7.put("A",userDao.countOption("user_q7","A"));
        map7.put("B",userDao.countOption("user_q7","B"));
        map7.put("C",userDao.countOption("user_q7","C"));
        map7.put("D",userDao.countOption("user_q7","D"));
        list.add(map7);
        return list;
    }

    @Override
    public PageResult listUser() {
        PageUtil pageUtil = new PageUtil();
        List<User> list = userDao.listUser(pageUtil);
        int total = userDao.getTotalUser();
        PageResult pageResult = new PageResult(list,total,0,0);
        return pageResult;
    }
}
