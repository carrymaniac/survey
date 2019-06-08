package com.gdou.survey.dao;

import com.gdou.survey.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {
    int addUser(User user);
    User getUserById(int id);
    int deleteUserById(int id);
    List<User> listUser(Map param);
    int getTotalUser();
    int countOption(@Param("question") String question, @Param("condition") String condition);
}
