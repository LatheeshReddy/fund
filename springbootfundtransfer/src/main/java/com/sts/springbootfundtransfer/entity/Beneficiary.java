package com.sts.springbootfundtransfer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Beneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String linkAccountId;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Account account;
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getLinkAccountId() {
		return linkAccountId;
	}

	public void setLinkAccountId(String linkAccountId) {
		this.linkAccountId = linkAccountId;
	}

	@Override
	public String toString() {
		return "Beneficiary [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", linkAccountId="
				+ linkAccountId + ", account=" + account + "]";
	}


	
	
}
