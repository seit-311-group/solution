package cn.sysu.solution.controller;

import cn.sysu.solution.pojo.equations;
import cn.sysu.solution.pojo.questions;
import cn.sysu.solution.sevice.CoreService;
import cn.sysu.solution.sevice.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solution")
public class QueryController {
    @Autowired
    private CoreService coreService;
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/getDescriptionBYId")
    public String getDescriptionBYId(@RequestParam(value = "id") String id) throws Exception {
        List<questions> questions = questionService.getQuestionsByID(id);
        questions question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getDescription();
    }
    @RequestMapping("/getAnalysisBYId")
    public String getAnalysisBYId(@RequestParam(value = "id") String id) throws Exception {
        List<questions> questions = questionService.getQuestionsByID(id);
        questions question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getAnalysis();
    }

    @RequestMapping("/getEquationIDsBYId")
    public String getEquationIDsBYId(@RequestParam(value = "id") String id) throws Exception {
        List<questions> questions = questionService.getQuestionsByID(id);
        questions question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getEquationid();
    }

    @RequestMapping("/getEquationBYId")
    public String getEquationBYId(@RequestParam(value = "equationid") String equationid) throws Exception {
        List<equations> equations = questionService.getEquationsByID(equationid);
        equations equation = null;
        if (equations.size() == 1) {
            equation = equations.get(0);
        }
        return equation.getEquation();
    }

    @RequestMapping("/getQuantityBYId")
    public String getQuantityBYId(@RequestParam(value = "equationid") String equationid) throws Exception {
        List<equations> equations = questionService.getEquationsByID(equationid);
        equations equation = null;
        if (equations.size() == 1) {
            equation = equations.get(0);
        }
        return equation.getQuantity();
    }

    @RequestMapping("/getAnswerBYId")
    public String getAnswerBYId(@RequestParam(value = "id") String id) throws Exception {
        List<questions> questions = questionService.getQuestionsByID(id);
        questions question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getAnswer();
    }

    @RequestMapping("/judge")
    public String judge(@RequestParam(value = "questionID") String ID, @RequestParam(value = "equationID") String equationID, @RequestParam(value = "answer") String answer) throws Exception {
        return "";
    }

}
