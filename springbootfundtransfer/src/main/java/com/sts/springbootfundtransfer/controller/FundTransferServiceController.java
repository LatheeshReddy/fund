package com.sts.springbootfundtransfer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.springbootfundtransfer.entity.FundTransfer;
import com.sts.springbootfundtransfer.entity.User;
import com.sts.springbootfundtransfer.service.FundTransferService;

@RestController
@RequestMapping("/send")
public class FundTransferServiceController {

	@Autowired
	FundTransferService  fundTransferService;

	@PostMapping("/")
	public String sendAmount(@Valid @RequestBody FundTransfer fundTransfer) {
		String msg = null;
		try {
			msg=fundTransferService.sendAmount(fundTransfer);

		}catch(Exception e) {
			msg=e.getMessage();	
		}
		return msg;
	}

}
