package com.longchang.www.mapper;

import com.longchang.www.entity.Minemachine;
import com.longchang.www.entity.MinemachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MinemachineMapper {
    int countByExample(MinemachineExample example);

    int deleteByExample(MinemachineExample example);

    int deleteByPrimaryKey(Integer mmid);

    int insert(Minemachine record);

    int insertSelective(Minemachine record);

    List<Minemachine> selectByExample(MinemachineExample example);

    Minemachine selectByPrimaryKey(Integer mmid);

    int updateByExampleSelective(@Param("record") Minemachine record, @Param("example") MinemachineExample example);

    int updateByExample(@Param("record") Minemachine record, @Param("example") MinemachineExample example);

    int updateByPrimaryKeySelective(Minemachine record);

    int updateByPrimaryKey(Minemachine record);
}