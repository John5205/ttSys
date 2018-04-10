package com.longchang.www.mapper;

import com.longchang.www.entity.Income;
import com.longchang.www.entity.IncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncomeMapper {
    int countByExample(IncomeExample example);

    int deleteByExample(IncomeExample example);

    int deleteByPrimaryKey(Integer incomeid);

    int insert(Income record);

    int insertSelective(Income record);

    List<Income> selectByExample(IncomeExample example);

    Income selectByPrimaryKey(Integer incomeid);

    int updateByExampleSelective(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByExample(@Param("record") Income record, @Param("example") IncomeExample example);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
}