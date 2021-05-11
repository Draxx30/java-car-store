package com.cts.carstore.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CarSearch {
	
	@NotEmpty(message="Customer name is required")
	private String customerName;
	
	@NotEmpty(message="Gender is required")
	private String gender;
	
	
	@NotEmpty(message="Mobile number is required")
	@Pattern(regexp="[7-9]{1}[0-9]{9}",message="Mobile number should be 10 digits and starting with 7/8/9")
	private String mobileNumber;
	public CarSearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarSearch(String customerName, String gender, String mobileNumber, String customerCity, String brand,
			String budgetUpto, String fuelType) {
		super();
		this.customerName = customerName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.customerCity = customerCity;
		this.brand = brand;
		this.budgetUpto = budgetUpto;
		this.fuelType = fuelType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBudgetUpto() {
		return budgetUpto;
	}
	public void setBudgetUpto(String budgetUpto) {
		this.budgetUpto = budgetUpto;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
    private String customerCity;
    private String brand;
    private String budgetUpto;
    private String fuelType;
}
