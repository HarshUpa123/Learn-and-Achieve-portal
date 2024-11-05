package com.learnachiveportal.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "rolename")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<User> userRole = new HashSet<>();
}
