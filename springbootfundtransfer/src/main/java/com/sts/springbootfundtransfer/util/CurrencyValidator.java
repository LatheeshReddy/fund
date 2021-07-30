package com.sts.springbootfundtransfer.util;

import java.util.List;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.entity.FundTransfer;

public class CurrencyValidator {

	public static boolean validateAmount(double amount) {
		
		if(amount<0) {
			return false;
		}
		
		return true;
	}

	

	public static void sendAmount(List<Account> beneficaryaccount, List<Account> payeeaccount) {
	
		
	}

}
