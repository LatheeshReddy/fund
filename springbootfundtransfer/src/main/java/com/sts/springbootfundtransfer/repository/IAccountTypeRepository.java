package com.sts.springbootfundtransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.springbootfundtransfer.entity.AccountType;

@Repository
public interface IAccountTypeRepository extends JpaRepository<AccountType, Long> {

}
