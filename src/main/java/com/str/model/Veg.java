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
public class Veg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String panir;
	private String vegpulav;
	private String mixveg;
	private String vegkolhapuri;
	private String dalkhichdi;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Veg [id=" + id + ", panir=" + panir + ", vegpulav=" + vegpulav + ", mixveg=" + mixveg
				+ ", vegkolhapuri=" + vegkolhapuri + ", dalkhichdi=" + dalkhichdi + "]";
	}

	

}
