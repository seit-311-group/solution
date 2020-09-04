package cn.sysu.solution.mapper;

import cn.sysu.solution.pojo.quantities;
import cn.sysu.solution.pojo.quantitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface quantitiesMapper {
    int countByExample(quantitiesExample example);

    int deleteByExample(quantitiesExample example);

    int insert(quantities record);

    int insertSelective(quantities record);

    List<quantities> selectByExample(quantitiesExample example);

    int updateByExampleSelective(@Param("record") quantities record, @Param("example") quantitiesExample example);

    int updateByExample(@Param("record") quantities record, @Param("example") quantitiesExample example);
}