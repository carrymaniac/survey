package com.gdou.survey.service;


import com.gdou.survey.entity.User;
import com.gdou.survey.util.PageResult;
import com.gdou.survey.util.PageUtil;

import java.util.List;
import java.util.Map;

public interface UserService {
    int saveUser(User user);
    User getUserById(int id);
    int removeUserById(int id);
    PageResult listUser(PageUtil pageUtil);
    List<Map<String, Integer>> countOption();
    PageResult listUser();
}
