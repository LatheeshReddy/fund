package com.sts.springbootfundtransfer.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class FundTransfer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fundTransferId;
	private Long beneficiaryAccountNo;
	private Long payeeAccountNo;
	private double amount;
	private LocalDate date;//rt
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Long getFundTransferId() {
		return fundTransferId;
	}
	public void setFundTransferId(Long fundTransferId) {
		this.fundTransferId = fundTransferId;
	}
	public Long getBeneficiaryAccountNo() {
		return beneficiaryAccountNo;
	}
	public void setBeneficiaryAccountNo(Long beneficiaryAccountNo) {
		this.beneficiaryAccountNo = beneficiaryAccountNo;
	}
	public Long getPayeeAccountNo() {
		return payeeAccountNo;
	}
	public void setPayeeAccountNo(Long payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
   
	
}
