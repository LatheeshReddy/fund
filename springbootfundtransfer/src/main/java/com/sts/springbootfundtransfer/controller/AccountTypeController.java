package com.sts.springbootfundtransfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.springbootfundtransfer.entity.AccountType;
import com.sts.springbootfundtransfer.service.AccountTypeService;

@RestController
@RequestMapping("/type")
public class AccountTypeController {
    @Autowired
	AccountTypeService accountTypeService;
    
    @PostMapping("/")
	public ResponseEntity<Object> addAccountType(@RequestBody AccountType accType) {
		
		accountTypeService.addAccountType(accType);
		
		 return new ResponseEntity<>(HttpStatus.OK);
	}
}
