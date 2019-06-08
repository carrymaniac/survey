package com.gdou.survey.test;


import com.gdou.survey.dao.AdminDao;
import com.gdou.survey.entity.Admin;
import com.gdou.survey.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AdminMapperTest {

    @Autowired
    AdminDao adminDao;

    @Test
    public void TestCRUD(){
        Admin admin = adminDao.getAdminByUserNameAndPassword("admin", MD5Util.MD5Encode("admin", "UTF-8"));
        System.out.println(admin);
    }
}
