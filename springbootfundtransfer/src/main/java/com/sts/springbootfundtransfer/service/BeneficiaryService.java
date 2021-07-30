package com.sts.springbootfundtransfer.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.entity.Beneficiary;
import com.sts.springbootfundtransfer.entity.User;
import com.sts.springbootfundtransfer.repository.IBeneficiaryRepository;

@Service

public class BeneficiaryService {
@Autowired
	IBeneficiaryRepository repository;

@Autowired
AccountService accountservice;
	public ResponseEntity<HttpStatus> addBeneficiary(Beneficiary ben) {
		
	
			Account account=accountservice.getAccount(ben.getAccount());
			
			ben.setAccount(account);
			
			repository.save(ben);
				 return ResponseEntity.ok().body(HttpStatus.OK);
		        
		        
			}
	
}

				