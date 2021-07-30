package com.sts.springbootfundtransfer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.entity.Beneficiary;

@Repository
public interface IBeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

	List<Beneficiary> findByLinkAccountId(String payeeaccount);

	
}
