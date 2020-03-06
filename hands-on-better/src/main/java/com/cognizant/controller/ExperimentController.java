package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.SpeedResult;

@RestController
public class ExperimentController {
	
	@Autowired
	private SpeedResult speedResult;
	
//	@RequestMapping(value ="/api/experiment", method = RequestMethod.POST)
//	public ResponseEntity<SpeedResult> persistSpeedResult(@RequestBody )
	
	@GetMapping("test")
	public String printLine() {
		return "test";
	}
	
	
}
