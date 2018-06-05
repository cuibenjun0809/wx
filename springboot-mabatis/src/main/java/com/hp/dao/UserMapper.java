package com.hp.dao;

import com.hp.model.User;
import com.hp.model.UserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper{
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    List<User> selectAll();
    
    User selectByPrimaryKey(Integer user_id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}