package cn.sysu.solution.sevice;

import cn.sysu.solution.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private cn.sysu.solution.mapper.questionMapper questionMapper;
    @Autowired
    private cn.sysu.solution.mapper.pointMapper pointMapper;
    @Autowired
    private cn.sysu.solution.mapper.subquestionMapper subquestionMapper;
    @Autowired
    private cn.sysu.solution.mapper.option_tMapper option_tMapper;


    public List<question> getQuestionsByID(String ID) {
        questionExample questionExample = new questionExample();
        questionExample.Criteria criteria = questionExample.createCriteria();
        criteria.andIdEqualTo(Integer.valueOf(ID));
        return questionMapper.selectByExample(questionExample);
    }

    public List<subquestion> getSubquestionsByID(String ID) {
        subquestionExample subquestionExample = new subquestionExample();
        subquestionExample.Criteria criteria = subquestionExample.createCriteria();
        criteria.andIdEqualTo(Integer.valueOf(ID));
        return subquestionMapper.selectByExample(subquestionExample);
    }

    public List<point> getPointsByID(String ID) {
        pointExample pointExample = new pointExample();
        pointExample.Criteria criteria = pointExample.createCriteria();
        criteria.andIdEqualTo(Integer.valueOf(ID));
        return pointMapper.selectByExample(pointExample);
    }

    public List<option_t> getOptionsByID(String ID) {
        option_tExample option_tExample = new option_tExample();
        option_tExample.Criteria criteria = option_tExample.createCriteria();
        criteria.andIdEqualTo(Integer.valueOf(ID));
        return option_tMapper.selectByExample(option_tExample);
    }
    

}
