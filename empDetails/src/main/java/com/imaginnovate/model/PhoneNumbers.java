package com.imaginnovate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONENUMBERS")
public class PhoneNumbers {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "PHN_ID")
	private long phnId;
	
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "PHN_NUMBER")
	private String phnNumber;

	public long getPhnId() {
		return phnId;
	}

	public void setPhnId(long phnId) {
		this.phnId = phnId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(String phnNumber) {
		this.phnNumber = phnNumber;
	}

}
