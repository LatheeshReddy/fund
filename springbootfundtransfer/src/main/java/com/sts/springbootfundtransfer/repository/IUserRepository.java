package com.sts.springbootfundtransfer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.springbootfundtransfer.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

	List<User> findByPanId(String panId);

	User findByEmail(String email);

	List<User> findByEmailAndPassword(String email, String password);

	

}
