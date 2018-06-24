package cn.zippler.drugcombinationserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        System.out.println("jump to main.html");
        return "forward:/static/index.html";
    }
}
