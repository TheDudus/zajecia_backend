package com.example.demo;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.io.InputStream;


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


    
}