package com.sts.springbootfundtransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.repository.IAccountRepository;

@RestController
@RequestMapping("/account")

public class AccountController {

	@Autowired
	IAccountRepository accrepo;
	
	
}
