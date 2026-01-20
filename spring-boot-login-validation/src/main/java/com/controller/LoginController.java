package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.LoginService;



@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	@PostMapping(value="login")
	public String Login(@RequestBody String username,@RequestBody String password) {
		return loginService.loginvalidation(username, password);
	}

}
