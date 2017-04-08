package me.paul.ssm.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.paul.ssm.BaseTest;
import me.paul.ssm.entity.User;

public class UserMapperTest extends BaseTest{
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testSave(){
		User user = new User();
		user.setName("Louis");
		user.setAge(19);
		userMapper.save(user);
	}
	
	public void testGet(){
		User user = userMapper.get(3);
		System.out.println(user);
	}
}
