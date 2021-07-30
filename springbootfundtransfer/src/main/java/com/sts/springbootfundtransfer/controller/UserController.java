package com.sts.springbootfundtransfer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.springbootfundtransfer.entity.User;
import com.sts.springbootfundtransfer.exception.UserDataAccessException;
import com.sts.springbootfundtransfer.repository.IUserRepository;
import com.sts.springbootfundtransfer.service.UserService;
import com.sts.springbootfundtransfer.util.Constant;

import net.bytebuddy.implementation.bytecode.Throw;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	IUserRepository UserRepository ;

	@PostMapping("/signup")
	public ResponseEntity<Object> signUpUser(@Valid @RequestBody User user) {
		return	userService.signUpUser(user);

	}

	@PostMapping("/signin")
	public ResponseEntity<Object> signInUser(@Valid @RequestBody User user) {
		if(	userService.signInUser(user))
			return new ResponseEntity<>(Constant.USER_LOGIN, HttpStatus.OK);

		return new ResponseEntity<>(Constant.USER_NOT_EXISTS, HttpStatus.OK);

	}


}
