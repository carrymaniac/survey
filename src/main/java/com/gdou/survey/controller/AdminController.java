package com.gdou.survey.controller;


import com.gdou.survey.common.Result;
import com.gdou.survey.common.ResultGenerator;
import com.gdou.survey.entity.Admin;
import com.gdou.survey.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService ;

    @RequestMapping(value="login",method = RequestMethod.POST)
    public Result login(@RequestBody Admin admin){
        Result result = ResultGenerator.genFailResult("登录失败");
        if (StringUtils.isEmpty(admin.getUserName()) || StringUtils.isEmpty(admin.getPassword())) {
            result.setMessage("请填写登录信息！");
        }
        Admin loginAdmin = adminService.login(admin.getUserName(),admin.getPassword());
        if(loginAdmin != null){
            result = ResultGenerator.genSuccessResult(loginAdmin);
        }
        return result;
    }
}
