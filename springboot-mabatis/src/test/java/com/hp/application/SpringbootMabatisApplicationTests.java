package com.hp.application;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.hp.model.Printer;
import com.hp.model.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMabatisApplicationTests {

	@Autowired
	private StringRedisTemplate springRedisTemplate;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Test
	public void contextLoads() {
		springRedisTemplate.opsForValue().set("name", "amd");
		Assert.assertEquals("amd", springRedisTemplate.opsForValue().get("name"));
	}
	
	@Test
	public void testRedis(){
		//保存对象
		User user = new User(1,"ck","ck","13922833222");
//		redisTemplate.opsForValue().set(user.getUser_name(), user);
//		Assert.assertEquals("ck", user.getPassword());
		System.out.println(redisTemplate.opsForValue().get("ck"));
	}
	
	@Test
	public void testRedis2(){
		Printer printer = new Printer("hp-printer","123456");
		redisTemplate.opsForValue().set("num", "123456789");
		System.out.println(redisTemplate.opsForValue().get("num"));
	}
	
}
