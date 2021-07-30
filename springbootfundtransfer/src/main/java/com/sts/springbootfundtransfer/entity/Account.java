package com.sts.springbootfundtransfer.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Positive;



@Entity

public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long accountNo;
private Integer accountTypeId;

private double balance;
private String active;
private LocalDate date;//rt
private String bankId;

public Long getAccountNo() {
	return accountNo;
}
public void setAccountNo(Long accountNo) {
	this.accountNo = accountNo;
}
public Integer getAccountTypeId() {
	return accountTypeId;
}
public void setAccountTypeId(Integer accountTypeId) {
	this.accountTypeId = accountTypeId;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getBankId() {
	return bankId;
}
public void setBankId(String bankId) {
	this.bankId = bankId;
}
@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", accountTypeId=" + accountTypeId + ", balance=" + balance + ", active="
			+ active + ", date=" + date + ", bankId=" + bankId + "]";
}



}
