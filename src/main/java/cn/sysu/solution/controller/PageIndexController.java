package cn.sysu.solution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageIndexController {

    @RequestMapping("/question")
    public String question(@RequestParam(value = "id") String id){
        return "question";
    }

}
