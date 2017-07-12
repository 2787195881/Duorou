package org.fkit.duorou.service;

import org.fkit.duorou.domain.Manager;
import org.fkit.duorou.domain.User;
import org.springframework.stereotype.Service;
@Service
public interface UserService {
	
	void inUser(String username,String password,String email,String phone);
	User login(String username,String password);
	Manager manager(String username, String password);
	void findPwd(String username, String newpwd);
}


