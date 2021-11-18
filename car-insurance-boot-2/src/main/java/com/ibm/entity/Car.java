package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue
	private int car_id;
	
	@Column
	private String reg_no;
	
	@Column(length = 20)
	private String model_name;
	
	@Column(length = 20)
	private String model_no;
	
	@Column(length = 20)
	private String manufct_yr;
	
	@Column(length = 20)
	private String purch_yr;
	
	@Column(length = 20)
	private double price;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name = "ins_id")
	private Insurance insurance;
}
