package com.learnachiveportal.demo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnachiveportal.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
}
