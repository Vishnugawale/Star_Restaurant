package com.str.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private long amobileno;
	private long aadharno;
	@OneToMany(cascade = CascadeType.ALL)
	List<Customers> c = new ArrayList<>();
	@OneToOne(cascade = CascadeType.ALL)
	private Order order;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerBill customerBill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAmobileno() {
		return amobileno;
	}
	public void setAmobileno(long amobileno) {
		this.amobileno = amobileno;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public List<Customers> getC() {
		return c;
	}
	public void setC(List<Customers> c) {
		this.c = c;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public CustomerBill getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(CustomerBill customerBill) {
		this.customerBill = customerBill;
	}
	
}