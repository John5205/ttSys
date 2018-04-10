package com.longchang.www.mapper;

import com.longchang.www.entity.Extractmachine;
import com.longchang.www.entity.ExtractmachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtractmachineMapper {
    int countByExample(ExtractmachineExample example);

    int deleteByExample(ExtractmachineExample example);

    int deleteByPrimaryKey(Integer extractid);

    int insert(Extractmachine record);

    int insertSelective(Extractmachine record);

    List<Extractmachine> selectByExample(ExtractmachineExample example);

    Extractmachine selectByPrimaryKey(Integer extractid);

    int updateByExampleSelective(@Param("record") Extractmachine record, @Param("example") ExtractmachineExample example);

    int updateByExample(@Param("record") Extractmachine record, @Param("example") ExtractmachineExample example);

    int updateByPrimaryKeySelective(Extractmachine record);

    int updateByPrimaryKey(Extractmachine record);
}