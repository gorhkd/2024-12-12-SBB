package com.ll.__12_12_sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "about";
    }

}
