package com.sts.springbootfundtransfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.springbootfundtransfer.entity.Beneficiary;
import com.sts.springbootfundtransfer.service.BeneficiaryService;

@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryController {

	@Autowired
	BeneficiaryService beneficiaryService;
	@PostMapping("/")
	public ResponseEntity<Object> addBeneficiary(@RequestBody Beneficiary ben){

		beneficiaryService.addBeneficiary(ben);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> addBeneficiary(@PathVariable("id") Long ben){

		//beneficiaryService.addBeneficiary(ben);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
