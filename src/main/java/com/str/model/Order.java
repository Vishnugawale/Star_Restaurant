package com.str.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
private String order;
private String panir;
private String vegpulav;
private String mixveg;
private String vegkolhapuri;
private String dalkhichdi;
private String fish;
private String chikan;
private String egg;
private String biryani;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOrder() {
	return order;
}
public void setOrder(String order) {
	this.order = order;
}
public String getPanir() {
	return panir;
}
public void setPanir(String panir) {
	this.panir = panir;
}
public String getVegpulav() {
	return vegpulav;
}
public void setVegpulav(String vegpulav) {
	this.vegpulav = vegpulav;
}
public String getMixveg() {
	return mixveg;
}
public void setMixveg(String mixveg) {
	this.mixveg = mixveg;
}
public String getVegkolhapuri() {
	return vegkolhapuri;
}
public void setVegkolhapuri(String vegkolhapuri) {
	this.vegkolhapuri = vegkolhapuri;
}
public String getDalkhichdi() {
	return dalkhichdi;
}
public void setDalkhichdi(String dalkhichdi) {
	this.dalkhichdi = dalkhichdi;
}
public String getFish() {
	return fish;
}
public void setFish(String fish) {
	this.fish = fish;
}
public String getChikan() {
	return chikan;
}
public void setChikan(String chikan) {
	this.chikan = chikan;
}
public String getEgg() {
	return egg;
}
public void setEgg(String egg) {
	this.egg = egg;
}
public String getBiryani() {
	return biryani;
}
public void setBiryani(String biryani) {
	this.biryani = biryani;
}

}
