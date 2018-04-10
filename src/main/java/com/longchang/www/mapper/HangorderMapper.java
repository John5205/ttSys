package com.longchang.www.mapper;

import com.longchang.www.entity.Hangorder;
import com.longchang.www.entity.HangorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HangorderMapper {
    int countByExample(HangorderExample example);

    int deleteByExample(HangorderExample example);

    int deleteByPrimaryKey(Integer hangid);

    int insert(Hangorder record);

    int insertSelective(Hangorder record);

    List<Hangorder> selectByExample(HangorderExample example);

    Hangorder selectByPrimaryKey(Integer hangid);

    int updateByExampleSelective(@Param("record") Hangorder record, @Param("example") HangorderExample example);

    int updateByExample(@Param("record") Hangorder record, @Param("example") HangorderExample example);

    int updateByPrimaryKeySelective(Hangorder record);

    int updateByPrimaryKey(Hangorder record);
}