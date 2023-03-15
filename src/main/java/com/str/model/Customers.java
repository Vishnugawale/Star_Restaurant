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

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.data.annotation.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String mobileno;
	private String adharno;
	private String address;
	private String state;
	private String city;
	private String date;
	private String ordertime;
	private String orderstatus;
	@Transient
	private int ratingstar;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ViewBooking booking;
	@OneToMany(cascade = CascadeType.ALL)
	List<Veg> v = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL)
	List<Nonveg> n = new ArrayList<>();
	@OneToOne(cascade = CascadeType.ALL)
	private Feedback feedback;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerBill customerBill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public int getRatingstar() {
		return ratingstar;
	}
	public void setRatingstar(int ratingstar) {
		this.ratingstar = ratingstar;
	}
	public ViewBooking getBooking() {
		return booking;
	}
	public void setBooking(ViewBooking booking) {
		this.booking = booking;
	}
	public List<Veg> getV() {
		return v;
	}
	public void setV(List<Veg> v) {
		this.v = v;
	}
	public List<Nonveg> getN() {
		return n;
	}
	public void setN(List<Nonveg> n) {
		this.n = n;
	}
	public Feedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	public CustomerBill getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(CustomerBill customerBill) {
		this.customerBill = customerBill;
	}
	
}