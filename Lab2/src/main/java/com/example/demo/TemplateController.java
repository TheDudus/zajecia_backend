package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TemplateController {

    @RequestMapping("/t")
    @ResponseBody
    public String index() {
        return "Template";
    }
}
