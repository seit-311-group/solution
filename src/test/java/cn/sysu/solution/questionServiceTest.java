package cn.sysu.solution;

import cn.sysu.solution.sevice.QuestionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class questionServiceTest {
    @Autowired
    private QuestionService questionService;

    @Test
    public void test1() {
        System.out.println(questionService.getQuestionsByID("1").get(0));
    }
}
