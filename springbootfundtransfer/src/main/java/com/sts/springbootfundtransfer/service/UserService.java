package com.sts.springbootfundtransfer.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sts.springbootfundtransfer.entity.Account;
import com.sts.springbootfundtransfer.entity.User;
import com.sts.springbootfundtransfer.repository.IUserRepository;

@Service
public class UserService {
	@Autowired
	IUserRepository UserRepository ;
	@Autowired
	AccountService accountservice;

	public ResponseEntity<Object>  signUpUser(User user) {
		if(!validateDuplicateEmail(user)) {
			Account account=accountservice.getAccount(user);

			user.setAccount(account);
			user.setDate(LocalDate.now());
			UserRepository.save(user);
			return ResponseEntity.ok().body(HttpStatus.OK);
		}
		return ResponseEntity.ok().body(new String("user already exist"));
	}

	public boolean validateDuplicateEmail(User user) {

		User u=UserRepository.findByEmail(user.getEmail());
		if(u!=null) 
			return true;

		return false;
	}

	public boolean signInUser(@Valid User user) {

		List<User> users=UserRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
		if(user!=null && users.size()>0)
			return true;
		return false;
	}



}
