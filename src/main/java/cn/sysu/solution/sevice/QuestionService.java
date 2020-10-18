package cn.sysu.solution.sevice;

import cn.sysu.solution.pojo.equations;
import cn.sysu.solution.pojo.equationsExample;
import cn.sysu.solution.pojo.questions;
import cn.sysu.solution.pojo.questionsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private cn.sysu.solution.mapper.questionsMapper questionsMapper;
    @Autowired
    private cn.sysu.solution.mapper.equationsMapper equationsMapper;

    public List<questions> getQuestionsByID(String ID) {
        questionsExample questionsExample = new questionsExample();
        questionsExample.Criteria criteria = questionsExample.createCriteria();
        criteria.andIdEqualTo(Integer.valueOf(ID));
        return questionsMapper.selectByExample(questionsExample);
    }

    public List<equations> getEquationsByID(String ID) {
        equationsExample equationsExample = new equationsExample();
        equationsExample.Criteria criteria = equationsExample.createCriteria();
        criteria.andIdEqualTo(Integer.valueOf(ID));
        return equationsMapper.selectByExample(equationsExample);
    }

    

}
