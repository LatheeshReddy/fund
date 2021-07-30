package com.sts.springbootfundtransfer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.springbootfundtransfer.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Long>{

	//List<Account> findByAccountNo(Long accountNo);

	// void findTopByOrderByAccountIdDesc();

}
