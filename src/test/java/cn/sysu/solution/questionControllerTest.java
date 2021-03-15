package cn.sysu.solution;

import cn.sysu.solution.controller.QueryController;
import cn.sysu.solution.sevice.QuestionService;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class questionControllerTest {
    @Autowired
    QueryController queryController;
    @Autowired
    private QuestionService questionService;

    @Test
    public void test1() throws Exception {
        System.out.println(queryController.getAddPictureByID("4"));
    }
}
