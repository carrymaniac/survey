package com.gdou.survey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author Ha
 * @DATE 2019/6/8 15:26
 **/
@Controller
public class PageController {
    @RequestMapping("/survey_page/{id}")
    public ModelAndView index(@PathVariable String id, Map<String,Object> parms){
        parms.put("adminID",id);
        return new ModelAndView("redirect:/index.html", parms);
    }
}
