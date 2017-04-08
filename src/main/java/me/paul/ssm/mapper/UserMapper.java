package me.paul.ssm.mapper;

import me.paul.ssm.entity.User;

public interface UserMapper {
	
	void save(User user);
	
	User get(int id);

}
