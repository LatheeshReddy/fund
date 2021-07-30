package com.sts.springbootfundtransfer.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.entity.Beneficiary;
import com.sts.springbootfundtransfer.entity.FundTransfer;
import com.sts.springbootfundtransfer.entity.User;
import com.sts.springbootfundtransfer.repository.IAccountRepository;
import com.sts.springbootfundtransfer.repository.IBeneficiaryRepository;
import com.sts.springbootfundtransfer.repository.IFundTransferRepository;
import com.sts.springbootfundtransfer.util.CurrencyValidator;

@Service
public class FundTransferService {

	@Autowired
	IFundTransferRepository fundTransferRepository;
	@Autowired
	IAccountRepository  accountRepository;
	@Autowired
	IBeneficiaryRepository beneficiaryRepository;
	
	public String sendAmount(FundTransfer fundTransfer) {
		//validate amount
	
		if(fundTransfer.getPayeeAccountNo()==null ||fundTransfer.getBeneficiaryAccountNo()==null )
		{
			return "Accountno cannot be blank";
		}
			Account beneficaryaccount = accountRepository.findById(fundTransfer.getBeneficiaryAccountNo()).get();
	    	Account payeeaccount = accountRepository.findById(fundTransfer.getPayeeAccountNo()).get();
	   
	    	List<Beneficiary> beni=beneficiaryRepository.findByLinkAccountId(fundTransfer.getPayeeAccountNo()+"");
	     Long payeeAccno = fundTransfer.getPayeeAccountNo();
	    	for(Beneficiary bacc:beni) {
	    	 String linkaccid = bacc.getLinkAccountId();
	    	Long accno = bacc.getAccount().getAccountNo();
	    	if(payeeAccno.toString().equals(linkaccid) && accno.toString().equals(fundTransfer.getBeneficiaryAccountNo().toString()))
	    	{
	    		//valid transfer
	    		System.out.println("valid");
	    		if( beneficaryaccount!=null && payeeaccount!=null 	) {
	    			 
	    			System.out.println(payeeaccount);
	    			System.out.println(beneficaryaccount);
	    			
	    			Double balance=payeeaccount.getBalance();
	    			Double amount=fundTransfer.getAmount();
	    			if(amount>balance) {
	    				return "Insufficient Balance";
	    			}
	    			else {
	    				payeeaccount.setBalance(payeeaccount.getBalance()-amount);
	    				beneficaryaccount.setBalance(beneficaryaccount.getBalance()+amount);
	    				
	    				accountRepository.save(payeeaccount);
	    				accountRepository.save(beneficaryaccount);
	    				fundTransfer.setDate(LocalDate.now());
	    				fundTransferRepository.save(fundTransfer);
	    					
	    					return "Amount Transsfer Done succesfully";
	    			}
	    			
	    		}
	    	}
	    	}
	    	//System.out.println("invalid");
	
	return "Account Not Link to beneficiary account";
	
		
	}

}
