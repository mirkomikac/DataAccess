package com.sep.tim2.da.insurance.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Osiguranje implements Serializable{
	
	private static final long serialVersionUID = -7663607432545399871L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Polisa polisa;
	
	@ManyToOne
	private TipOsiguranja tipOsiguranja;
	
	@OneToMany(mappedBy = "osiguranje", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<VrednostAtributaOsiguranja> vrednostiAtributaOsiguranja;

	public Osiguranje() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Polisa getPolisa() {
		return polisa;
	}
	
	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}
	
	public TipOsiguranja getTipOsiguranja() {
		return tipOsiguranja;
	}
	
	public void setTipOsiguranja(TipOsiguranja tipOsiguranja) {
		this.tipOsiguranja = tipOsiguranja;
	}
	
	@JsonIgnore
	public List<VrednostAtributaOsiguranja> getVrednostiAtributaOsiguranja() {
		if(vrednostiAtributaOsiguranja == null) {
			return new ArrayList<VrednostAtributaOsiguranja>();
		}
		return vrednostiAtributaOsiguranja;
	}
	
	@JsonProperty
	public void setVrednostiAtributaOsiguranja(List<VrednostAtributaOsiguranja> vrednostiAtributaOsiguranja) {
		this.vrednostiAtributaOsiguranja = vrednostiAtributaOsiguranja;
	}
}
