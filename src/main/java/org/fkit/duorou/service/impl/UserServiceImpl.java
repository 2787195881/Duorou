package org.fkit.duorou.service.impl;

import org.fkit.duorou.domain.Manager;
import org.fkit.duorou.domain.User;
import org.fkit.duorou.mapper.UserMapper;
import org.fkit.duorou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void inUser(String username, String password,String email,String phone) {
		 userMapper.insertUser(username, password, email, phone);
	}
	public User login(String username,String password){
		return userMapper.findUsernameAndPasd(username,password);
	}
	@Override
	public Manager manager(String username,String password){
		return userMapper.findManager(username,password);
	}
	@Override
	public void findPwd(String username,String newpwd){
		 userMapper.alterpwd(username,newpwd);
	}
	
}