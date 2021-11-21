package com.ibm.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "claims")
public class Claim {
	@Id
	private int claim_id;
	@Column(length = 20)
	private String status;
	
//	@OneToOne
//	@JoinColumn(name = "cust_id")
//	private Customer customer;
//
//	@OneToOne
//	@JoinColumn(name = "reg_no")
//	private Car car;

	@OneToOne
	@JoinColumn(name = "ins_id")
	private Insurance insurance;
}
