package cn.sysu.solution.sevice;

import cn.sysu.solution.mapper.questionsMapper;
import cn.sysu.solution.pojo.questions;
import cn.sysu.solution.pojo.questionsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private cn.sysu.solution.mapper.questionsMapper questionsMapper;

    public List<questions> importQuestions() {
        questionsExample questionsExample = new questionsExample();
        questionsExample.Criteria criteria = questionsExample.createCriteria();
        return questionsMapper.selectByExample(questionsExample);
    }

}
