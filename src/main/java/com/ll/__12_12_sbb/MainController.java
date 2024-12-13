package com.ll.__12_12_sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "안녕하세요. 게시판에 오신걸 환영합니다.";
    }


    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }


}
