package com.learnachiveportal.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "username")
	private String name;
	
	@Column(name = "useremail")
	private String email;
	
	@Column(name = "userpassword")
	private String password;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Set<Role> roleOfUser = new HashSet<>();
	
	
	
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
               joinColumns = @JoinColumn(name = "user_id"),
               inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roleOfUser = new HashSet<>();

}
