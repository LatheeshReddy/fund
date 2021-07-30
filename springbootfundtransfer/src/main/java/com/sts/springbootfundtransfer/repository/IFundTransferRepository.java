package com.sts.springbootfundtransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.springbootfundtransfer.entity.FundTransfer;

@Repository
public interface IFundTransferRepository extends JpaRepository<FundTransfer, Long>{

}
