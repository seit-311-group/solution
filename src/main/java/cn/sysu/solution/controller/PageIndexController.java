package cn.sysu.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageIndexController {
    @RequestMapping("/")
    public String index() {return "index";}
    @RequestMapping("/1")
    public String question() {return "question";}
}
