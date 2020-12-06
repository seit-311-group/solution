package cn.sysu.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageIndexController {
    @RequestMapping("/")
    public String index() {return "index";}
    @RequestMapping("/1")
    public String question1() {return "question";}
    @RequestMapping("/2")
    public String question2() {return "question";}
    @RequestMapping("/3")
    public String question3() {return "question";}
    @RequestMapping("/4")
    public String question4() {return "questionTemp";}
}
