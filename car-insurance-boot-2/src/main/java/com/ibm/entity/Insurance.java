package com.ibm.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "insurance")
public class Insurance {
	@Id
	@GeneratedValue
	private int insId;
	@Column
	private int insuranceNo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column
	private LocalDate dateIssued;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column
	private LocalDate expiryDate;
	@Column(length = 20)
	private int duration;
	@Column(length = 20)
	private double amount;
	@Column(length = 20)
	private String coverageType;
	@Column(length = 20)
	private double prevAmntInsured;
	
	

	@OneToOne
	@JoinColumn(name = "carId")
	private Car car;



	public int getInsId() {
		return insId;
	}



	public void setInsId(int insId) {
		this.insId = insId;
	}



	public int getInsuranceNo() {
		return insuranceNo;
	}



	public void setInsuranceNo(int insuranceNo) {
		this.insuranceNo = insuranceNo;
	}



	public LocalDate getDateIssued() {
		return dateIssued;
	}



	public void setDateIssued(LocalDate dateIssued) {
		this.dateIssued = dateIssued;
	}



	public LocalDate getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
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



	public String getCoverageType() {
		return coverageType;
	}



	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}



	public double getPrevAmntInsured() {
		return prevAmntInsured;
	}



	public void setPrevAmntInsured(double prevAmntInsured) {
		this.prevAmntInsured = prevAmntInsured;
	}



	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
}
