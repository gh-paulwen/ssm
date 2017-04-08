package me.paul.ssm.service;

import me.paul.ssm.entity.User;

public interface UserService {
	
	void save(User user);
	
	User get(int id);
	
	void tranSave(User u1,User u2);

}
