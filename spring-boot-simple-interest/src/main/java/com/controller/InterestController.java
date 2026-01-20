package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.InterestService;

@RestController
public class InterestController {
	@Autowired
	InterestService interestService;
	@GetMapping(value="interest")
	public double simpleinterest(@RequestParam double p,@RequestParam int r,@RequestParam int t) {
		return interestService.calculateinterest(p, r, t);
	}

}
