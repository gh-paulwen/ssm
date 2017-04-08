package me.paul.ssm.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.paul.ssm.BaseTest;
import me.paul.ssm.entity.User;
import me.paul.ssm.service.UserService;

public class UserServiceImplTest extends BaseTest{
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testTranSave(){
		User u1 = new User();
		u1.setName("David");
		u1.setAge(29);
		userService.tranSave(u1,u1);
	}
	
}
