package cn.sysu.solution.mapper;

import cn.sysu.solution.pojo.subquestion;
import cn.sysu.solution.pojo.subquestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface subquestionMapper {
    int countByExample(subquestionExample example);

    int deleteByExample(subquestionExample example);

    int insert(subquestion record);

    int insertSelective(subquestion record);

    List<subquestion> selectByExample(subquestionExample example);

    int updateByExampleSelective(@Param("record") subquestion record, @Param("example") subquestionExample example);

    int updateByExample(@Param("record") subquestion record, @Param("example") subquestionExample example);
}