package com.hp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.model.User;
import com.hp.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class); 
	private final static ObjectMapper mapper = new ObjectMapper();
	@Autowired
	private UserService userService;
	
	@PostMapping("save")
	@ResponseBody
	public Map<String,String> save(@RequestBody User user){
		Map<String, String> map = new HashMap<>();
		try {
			logger.warn("save user:"+user);
			logger.error("name:{},password:{}",user.getUser_name(),user.getPassword());
			map.put("msg", "success");
			userService.insert(user);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("getOne")
	@ResponseBody
	public String getOne(Integer user_id){
		User user = userService.selectByPrimaryKey(user_id);
		try {
			return mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("getOneShow")
	public String getPrimary(Integer user_id,ModelMap modelMap){
		User user = userService.selectByPrimaryKey(user_id);
		modelMap.addAttribute("user", user);
		return "showUser";
	}
	
	@GetMapping("getUsers")
	@ResponseBody
	public PageInfo<User> getUsers(
			@RequestParam(name="pageNum",required=false,defaultValue="1") int pageNum,
			@RequestParam(name="pageSize",required=false,defaultValue="5") int pageSize
			){
		//开始分页
		return userService.selectAll(pageNum, pageSize);
//		return userService.selectByExample(pageNum,pageSize,null);
	}
}
