package com.str.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int panirprice;
	private int vegpulavprice;
	private int mixvegprice;
	private int vegkolhapuriprice;
	private int dalkhichdiprice;
	private int fishprice;
	private int chikanprice;
	private int eggprice;
	private int biryaniprice;
	@OneToOne(cascade = CascadeType.ALL)
	private Customers customers;
	@OneToOne(cascade = CascadeType.ALL)
	private Veg veg;
	@OneToOne(cascade = CascadeType.ALL)
	private Nonveg nonveg;
	public int getPanirprice() {
		return panirprice;
	}
	public void setPanirprice(int panirprice) {
		this.panirprice = panirprice;
	}
	public int getVegpulavprice() {
		return vegpulavprice;
	}
	public void setVegpulavprice(int vegpulavprice) {
		this.vegpulavprice = vegpulavprice;
	}
	public int getMixvegprice() {
		return mixvegprice;
	}
	public void setMixvegprice(int mixvegprice) {
		this.mixvegprice = mixvegprice;
	}
	public int getVegkolhapuriprice() {
		return vegkolhapuriprice;
	}
	public void setVegkolhapuriprice(int vegkolhapuriprice) {
		this.vegkolhapuriprice = vegkolhapuriprice;
	}
	public int getDalkhichdiprice() {
		return dalkhichdiprice;
	}
	public void setDalkhichdiprice(int dalkhichdiprice) {
		this.dalkhichdiprice = dalkhichdiprice;
	}
	public int getFishprice() {
		return fishprice;
	}
	public void setFishprice(int fishprice) {
		this.fishprice = fishprice;
	}
	public int getChikanprice() {
		return chikanprice;
	}
	public void setChikanprice(int chikanprice) {
		this.chikanprice = chikanprice;
	}
	public int getEggprice() {
		return eggprice;
	}
	public void setEggprice(int eggprice) {
		this.eggprice = eggprice;
	}
	public int getBiryaniprice() {
		return biryaniprice;
	}
	public void setBiryaniprice(int biryaniprice) {
		this.biryaniprice = biryaniprice;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public Veg getVeg() {
		return veg;
	}
	public void setVeg(Veg veg) {
		this.veg = veg;
	}
	public Nonveg getNonveg() {
		return nonveg;
	}
	public void setNonveg(Nonveg nonveg) {
		this.nonveg = nonveg;
	}

	
}
