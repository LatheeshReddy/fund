package com.sts.springbootfundtransfer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class AccountType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountTypeId;
	private String accountType;
	private String accountDetail;
	public Long getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(Long accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountDetail() {
		return accountDetail;
	}
	public void setAccountDetail(String accountDetail) {
		this.accountDetail = accountDetail;
	}
	@Override
	public String toString() {
		return "AccountType [accountTypeId=" + accountTypeId + ", accountType=" + accountType + ", accountDetail="
				+ accountDetail + "]";
	}
	
	
}
