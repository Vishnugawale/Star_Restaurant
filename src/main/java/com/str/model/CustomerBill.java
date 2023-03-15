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
public class CustomerBill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int panirprice;
private int vegpulav;
private int mixveg;
private int vegkolhapuri;
private int dalkhichdi;
private int fish;
private int chikan;
private int egg;
private int biryani;
public int getPanirprice() {
	return panirprice;
}
public void setPanirprice(int panirprice) {
	this.panirprice = panirprice;
}
public int getVegpulav() {
	return vegpulav;
}
public void setVegpulav(int vegpulav) {
	this.vegpulav = vegpulav;
}
public int getMixveg() {
	return mixveg;
}
public void setMixveg(int mixveg) {
	this.mixveg = mixveg;
}
public int getVegkolhapuri() {
	return vegkolhapuri;
}
public void setVegkolhapuri(int vegkolhapuri) {
	this.vegkolhapuri = vegkolhapuri;
}
public int getDalkhichdi() {
	return dalkhichdi;
}
public void setDalkhichdi(int dalkhichdi) {
	this.dalkhichdi = dalkhichdi;
}
public int getFish() {
	return fish;
}
public void setFish(int fish) {
	this.fish = fish;
}
public int getChikan() {
	return chikan;
}
public void setChikan(int chikan) {
	this.chikan = chikan;
}
public int getEgg() {
	return egg;
}
public void setEgg(int egg) {
	this.egg = egg;
}
public int getBiryani() {
	return biryani;
}
public void setBiryani(int biryani) {
	this.biryani = biryani;
}

}