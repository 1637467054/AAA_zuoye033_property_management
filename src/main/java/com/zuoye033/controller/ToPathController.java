package com.zuoye033.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToPathController {
    @GetMapping("/index")
    String toIndex(){
        return "index";
    }
    @GetMapping("/insert")
    String toInsert(){
        return "insert";
    }

}
