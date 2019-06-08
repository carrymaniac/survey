package com.gdou.survey.test;


import com.gdou.survey.service.UserService;
import com.gdou.survey.util.PageUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void TestCRUD(){
        System.out.println(userService.listUser());

    }
}
