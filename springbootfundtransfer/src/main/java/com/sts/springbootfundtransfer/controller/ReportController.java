package com.sts.springbootfundtransfer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/report")
public class ReportController {

	
	@GetMapping
	public ResponseEntity<Object> getReport(){
		
		
		return null;
		
		
	}
}
