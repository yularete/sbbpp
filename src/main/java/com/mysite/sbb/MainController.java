package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/sbb")
    @ResponseBody
    public String index() {
        return "오류야 발생금지야 너 !";
 
    }
    
    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
    
}