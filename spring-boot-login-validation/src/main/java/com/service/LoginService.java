package com.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public String loginvalidation(String username,String password) {
		if("admin".equals(username) && "admin123".equals(password)) {
			return "Login Sucessfull";
		}else {
			return "invalid username or password";
		}
	}

}
