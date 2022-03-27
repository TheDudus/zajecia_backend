package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

    //http://localhost:8080/test?name=Bartek&age=25

    @RequestMapping("/test")
    @ResponseBody
    public String index2(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age
    ) {
        return "TEST " + " " + name + " " + age;
    }

    @RequestMapping("/users")
    @ResponseBody
    public String index3(


    ) {
        return "";
    }
}