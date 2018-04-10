package com.longchang.www.mapper;

import com.longchang.www.entity.UserMinemachine;
import com.longchang.www.entity.UserMinemachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMinemachineMapper {
    int countByExample(UserMinemachineExample example);

    int deleteByExample(UserMinemachineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserMinemachine record);

    int insertSelective(UserMinemachine record);

    List<UserMinemachine> selectByExample(UserMinemachineExample example);

    UserMinemachine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserMinemachine record, @Param("example") UserMinemachineExample example);

    int updateByExample(@Param("record") UserMinemachine record, @Param("example") UserMinemachineExample example);

    int updateByPrimaryKeySelective(UserMinemachine record);

    int updateByPrimaryKey(UserMinemachine record);
}