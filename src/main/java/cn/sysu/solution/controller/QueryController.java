package cn.sysu.solution.controller;

import cn.sysu.solution.pojo.option_t;
import cn.sysu.solution.pojo.point;
import cn.sysu.solution.pojo.question;
import cn.sysu.solution.pojo.subquestion;
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
    private QuestionService questionService;

    @RequestMapping("/getDescriptionBYId")
    public String getDescriptionBYId(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getDescription();
    }
    @RequestMapping("/getAnalysisBYId")
    public String getAnalysisBYId(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getAnalysis();
    }
    @RequestMapping("/getSubquesIDsBYId")
    public String getSubquesIDsBYId(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getSubquesid();
    }
    @RequestMapping("/getPointIDsBYId")
    public String getPointIDsBYId(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getPointid();
    }
    @RequestMapping("/getAnswerByID")
    public String getAnswerByID(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getAnswer();
    }
    @RequestMapping("/getAddPictureByID")
    public String getAddPictureByID(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getAddpicture();
    }
    @RequestMapping("/getChangePictureByID")
    public String getChangePictureByID(@RequestParam(value = "id") String id) throws Exception {
        List<question> questions = questionService.getQuestionsByID(id);
        question question = null;
        if (questions.size() == 1) {
            question = questions.get(0);
        }
        return question.getChangepicture();
    }


    @RequestMapping("/getContentBYSubquesId")
    public String getContentBYSubquesId(@RequestParam(value = "id") String id) throws Exception {
        List<subquestion> subquestions = questionService.getSubquestionsByID(id);
        subquestion subquestion = null;
        if (subquestions.size() == 1) {
            subquestion = subquestions.get(0);
        }
        return subquestion.getContent();
    }
    @RequestMapping("/getAnswerBYSubquesId")
    public int getAnswerBYSubquesId(@RequestParam(value = "id") String id) throws Exception {
        List<subquestion> subquestions = questionService.getSubquestionsByID(id);
        subquestion subquestion = null;
        if (subquestions.size() == 1) {
            subquestion = subquestions.get(0);
        }
        return subquestion.getAnswer();
    }
    @RequestMapping("/getOptionIDBYSubquesId")
    public String getOptionIDBYSubquesId(@RequestParam(value = "id") String id) throws Exception {
        List<subquestion> subquestions = questionService.getSubquestionsByID(id);
        subquestion subquestion = null;
        if (subquestions.size() == 1) {
            subquestion = subquestions.get(0);
        }
        return subquestion.getOptionid();
    }


    @RequestMapping("/getContentBYOptionId")
    public String getContentBYOptionId(@RequestParam(value = "id") String id) throws Exception {
        List<option_t> option_ts = questionService.getOptionsByID(id);
        option_t option_t = null;
        if (option_ts.size() == 1) {
            option_t = option_ts.get(0);
        }
        return option_t.getContent();
    }
    @RequestMapping("/getPointIDBYOptionID")
    public String getPointIDBYOptionID(@RequestParam(value = "id") String id) throws Exception {
        List<option_t> option_ts = questionService.getOptionsByID(id);
        option_t option_t = null;
        if (option_ts.size() == 1) {
            option_t = option_ts.get(0);
        }
        return option_t.getPointid();
    }


    @RequestMapping("/getContentBYPointId")
    public String getContentBYPointId(@RequestParam(value = "id") String id) throws Exception {
        List<point> points = questionService.getPointsByID(id);
        point point = null;
        if (points.size() == 1) {
            point = points.get(0);
        }
        return point.getContent();
    }

}
