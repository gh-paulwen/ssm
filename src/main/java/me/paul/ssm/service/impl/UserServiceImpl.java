package me.paul.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.paul.ssm.entity.User;
import me.paul.ssm.mapper.UserMapper;
import me.paul.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void save(User user) {
		userMapper.save(user);
	}

	@Override
	public User get(int id) {
		return userMapper.get(id);
	}

	@Transactional
	@Override
	public void tranSave(User u1, User u2) {
		userMapper.save(u1);
		userMapper.save(u2);
	}

}
