package cn.sysu.solution.mapper;

import cn.sysu.solution.pojo.equations;
import cn.sysu.solution.pojo.equationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface equationsMapper {
    int countByExample(equationsExample example);

    int deleteByExample(equationsExample example);

    int insert(equations record);

    int insertSelective(equations record);

    List<equations> selectByExample(equationsExample example);

    int updateByExampleSelective(@Param("record") equations record, @Param("example") equationsExample example);

    int updateByExample(@Param("record") equations record, @Param("example") equationsExample example);
}