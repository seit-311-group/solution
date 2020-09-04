package cn.sysu.solution.mapper;

import cn.sysu.solution.pojo.questions;
import cn.sysu.solution.pojo.questionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface questionsMapper {
    int countByExample(questionsExample example);

    int deleteByExample(questionsExample example);

    int insert(questions record);

    int insertSelective(questions record);

    List<questions> selectByExample(questionsExample example);

    int updateByExampleSelective(@Param("record") questions record, @Param("example") questionsExample example);

    int updateByExample(@Param("record") questions record, @Param("example") questionsExample example);
}