package com.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionService {

	public double getfahrenheit(double celsius) {
		double fahrenheit=(celsius * 9/5) + 32;
		return fahrenheit;
		
	}
}
