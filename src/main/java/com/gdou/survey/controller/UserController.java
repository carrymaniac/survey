package com.gdou.survey.controller;

import com.gdou.survey.common.Constants;
import com.gdou.survey.common.Result;
import com.gdou.survey.common.ResultGenerator;
import com.gdou.survey.controller.annotation.TokenToUser;
import com.gdou.survey.entity.Admin;
import com.gdou.survey.entity.User;
import com.gdou.survey.service.UserService;
import com.gdou.survey.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService ;

    @RequestMapping(value="/list",method = RequestMethod.GET)
    public Result list(@TokenToUser Admin admin){
        if( admin == null){
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_NOT_LOGIN,"用户认证过期!");
        }
        return ResultGenerator.genSuccessResult(userService.listUser());
    }

    @RequestMapping(value = "/save")
    public Result save(@RequestBody User user){
        if(StringUtils.isEmpty(user.getUserName())||StringUtils.isEmpty(user.getUserTel())||StringUtils.isEmpty(user.getUserQ1())){
            //提交的用户填写信息为空
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_PARAM_ERROR,"参数异常,请检查填写的信息");
        }
        user.setCreatTime(new Date());
        if(userService.saveUser(user)>0){
            return ResultGenerator.genSuccessResult();
        }else {
            return ResultGenerator.genFailResult("添加失败,请联系管理员");
        }
    }

    @RequestMapping(value = "count")
    public Result count(@TokenToUser Admin admin){
        if( admin == null){
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_NOT_LOGIN,"用户认证过期!");
        }
        return ResultGenerator.genSuccessResult(userService.countOption());
    }

    @RequestMapping(value = "/info/{id}")
    public Result info(@PathVariable("id") Integer id,@TokenToUser Admin admin){
        if( admin == null){
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_NOT_LOGIN,"用户认证过期!");
        }
        if (id < 1) {
            return ResultGenerator.genErrorResult(Constants.RESULT_CODE_PARAM_ERROR, "参数异常！");
        }
        User user = userService.getUserById(id);
        if(user == null){
            return  ResultGenerator.genErrorResult(Constants.RESULT_CODE_PARAM_ERROR, "参数异常！");
        }
        return ResultGenerator.genSuccessResult(user);
    }


}
