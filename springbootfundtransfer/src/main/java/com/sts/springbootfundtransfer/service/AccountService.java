package com.sts.springbootfundtransfer.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.entity.User;
import com.sts.springbootfundtransfer.repository.IAccountRepository;

@Service
public class AccountService {
//private static  Long ACCOUNTNO=101010L;
	@Autowired
	IAccountRepository accountRepository ;

	public Account getAccount(User user) {
         
		Account acc=new Account();
		//acc.getBankId();
		//acc.setAccountNo(ACCOUNTNO++);
		acc.setAccountTypeId(1);//[1=saving 2=current]
		acc.setActive("1");//0=inactive 1=active
		acc.setBalance(user.getAccount().getBalance());
		acc.setDate(LocalDate.now());
		acc.setBankId(user.getAccount().getBankId());
		return accountRepository.save(acc);
	}
	
	public Account getAccount(Account account) {
        
		Account acc=new Account();
		//acc.getBankId();
		//acc.setAccountNo(ACCOUNTNO++);
		acc.setAccountTypeId(1);//[1=saving 2=current]
		acc.setActive("1");//0=inactive 1=active
		acc.setBalance(account.getBalance());
		acc.setDate(LocalDate.now());
		acc.setBankId(account.getBankId());
		return accountRepository.save(acc);
	}

}
