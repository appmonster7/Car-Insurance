package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	private int user_id;
	@Column(length = 20)
	private String password;
	@Column(length = 20)
	private String role;
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
