package com.ibm.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class Insurance {
	@Id
	@GeneratedValue
	private int ins_id;
	@Column
	private int insurance_no;
	@Column
	private LocalDate date_issued;
	@Column
	private LocalDate expiry_date;
	@Column(length = 20)
	private int duration;
	@Column(length = 20)
	private double amount;
	@Column(length = 20)
	private String coverage_type;
	@Column(length = 20)
	private double prev_amnt_insured;
	
	public int getIns_id() {
		return ins_id;
	}

	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}

	public int getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(int insurance_no) {
		this.insurance_no = insurance_no;
	}

	public LocalDate getDate_issued() {
		return date_issued;
	}

	public void setDate_issued(LocalDate date_issued) {
		this.date_issued = date_issued;
	}

	public LocalDate getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDate expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCoverage_type() {
		return coverage_type;
	}

	public void setCoverage_type(String coverage_type) {
		this.coverage_type = coverage_type;
	}

	public double getPrev_amnt_insured() {
		return prev_amnt_insured;
	}

	public void setPrev_amnt_insured(double prev_amnt_insured) {
		this.prev_amnt_insured = prev_amnt_insured;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@OneToOne
	@JoinColumn(name = "car_id")
	private Car car;
	
}
