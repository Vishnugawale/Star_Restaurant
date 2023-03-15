package com.str.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Rating {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int rating1;
private int rating2;
private int rating3;
private int rating4;
private int rating5;
@OneToMany(cascade = CascadeType.ALL)
List<Customers>customer = new ArrayList<>();
public int getRating1() {
	return rating1;
}
public void setRating1(int rating1) {
	this.rating1 = rating1;
}
public int getRating2() {
	return rating2;
}
public void setRating2(int rating2) {
	this.rating2 = rating2;
}
public int getRating3() {
	return rating3;
}
public void setRating3(int rating3) {
	this.rating3 = rating3;
}
public int getRating4() {
	return rating4;
}
public void setRating4(int rating4) {
	this.rating4 = rating4;
}
public int getRating5() {
	return rating5;
}
public void setRating5(int rating5) {
	this.rating5 = rating5;
}
public List<Customers> getCustomer() {
	return customer;
}
public void setCustomer(List<Customers> customer) {
	this.customer = customer;
}


}