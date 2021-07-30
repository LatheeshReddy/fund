package com.sts.springbootfundtransfer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.springbootfundtransfer.entity.AccountType;
import com.sts.springbootfundtransfer.repository.IAccountTypeRepository;

@Service
public class AccountTypeService {

	@Autowired
	IAccountTypeRepository  accountTypeRepository ;

	public void addAccountType(AccountType accType) {
		accountTypeRepository.save(accType);
		
	}

}
