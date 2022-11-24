package com.example.postapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.postapi.Service.PostSerivce;

@Controller
public class PostController {

    @Autowired
    public PostSerivce serivce;

    @RequestMapping("/")
    public String index() {
        return "post";
    }

    @RequestMapping("/submit")
    @ResponseBody
    public String submit(@RequestBody String zipcode) {
        return serivce.service(zipcode);

    }

}
