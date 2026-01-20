package com.service;

import org.springframework.stereotype.Service;

@Service
public class InterestService {
	public double calculateinterest(double p,int r,int t) {
		return (p * r * t) / 100;
		
	}

}
