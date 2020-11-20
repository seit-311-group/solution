package cn.sysu.solution.mapper;

import cn.sysu.solution.pojo.point;
import cn.sysu.solution.pojo.pointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pointMapper {
    int countByExample(pointExample example);

    int deleteByExample(pointExample example);

    int insert(point record);

    int insertSelective(point record);

    List<point> selectByExample(pointExample example);

    int updateByExampleSelective(@Param("record") point record, @Param("example") pointExample example);

    int updateByExample(@Param("record") point record, @Param("example") pointExample example);
}