package com.controller;

import com.reponsitory.AccountReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {


    @Autowired
    AccountReponsitory accountReponsitory;

    @RequestMapping(value = "/")
    public String index(Map<String, Object> map) {
        map.put("title", "index");
        map.put("list", accountReponsitory.findAll());
        return "index";
    }

}
