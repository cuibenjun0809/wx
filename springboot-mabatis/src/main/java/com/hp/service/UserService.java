package com.hp.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hp.model.User;
import com.hp.model.UserExample;

public interface UserService {
	
	 long countByExample(UserExample example);

	    int deleteByExample(UserExample example);

	    int deleteByPrimaryKey(Integer user_id);

	    int insert(User record);

	    int insertSelective(User record);

	    List<User> selectByExample(Integer pageNum,Integer pageSize,UserExample example);
	    
	    PageInfo<User> selectAll(Integer pageNum,Integer pageSize);
	    
	    User selectByPrimaryKey(Integer user_id);

	    int updateByExampleSelective(User record, UserExample example);

	    int updateByExample(User record, UserExample example);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
}
