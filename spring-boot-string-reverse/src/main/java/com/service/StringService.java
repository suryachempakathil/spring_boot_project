package com.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
	public String reversestring(String text) {
		StringBuilder sb=new StringBuilder(text);
		return sb.reverse().toString();
		
	}

}
