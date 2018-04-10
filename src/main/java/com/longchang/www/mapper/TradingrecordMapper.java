package com.longchang.www.mapper;

import com.longchang.www.entity.Tradingrecord;
import com.longchang.www.entity.TradingrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradingrecordMapper {
    int countByExample(TradingrecordExample example);

    int deleteByExample(TradingrecordExample example);

    int deleteByPrimaryKey(Integer transactionid);

    int insert(Tradingrecord record);

    int insertSelective(Tradingrecord record);

    List<Tradingrecord> selectByExample(TradingrecordExample example);

    Tradingrecord selectByPrimaryKey(Integer transactionid);

    int updateByExampleSelective(@Param("record") Tradingrecord record, @Param("example") TradingrecordExample example);

    int updateByExample(@Param("record") Tradingrecord record, @Param("example") TradingrecordExample example);

    int updateByPrimaryKeySelective(Tradingrecord record);

    int updateByPrimaryKey(Tradingrecord record);
}