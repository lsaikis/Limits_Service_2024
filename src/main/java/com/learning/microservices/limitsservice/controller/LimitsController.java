package com.learning.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.limitsservice.bean.Limits;
import com.learning.microservices.limitsservice.configuration.LimitServiceConfiguration;


@RestController
public class LimitsController {

	@Autowired
	private LimitServiceConfiguration lsc;
	
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(lsc.getMinimum(), lsc.getMaximum());
	}
}
