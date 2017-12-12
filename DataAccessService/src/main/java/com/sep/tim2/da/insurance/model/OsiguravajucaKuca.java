package com.sep.tim2.da.insurance.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class OsiguravajucaKuca implements Serializable{
	
	private static final long serialVersionUID = -4134784298073252398L;

	public OsiguravajucaKuca() {}
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = true)
	private String pib;
	
	@Column(nullable = true)
	private String naziv;
	
	@Column(nullable = true)
	private String adresa;
	
	@Column(nullable = true)
	private String mesto;
	
	@Column(nullable = true)
	private String telefon; 
	
	
	@OneToMany(mappedBy="osiguravajucaKuca", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TipOsiguranja> tipoviOsiguranja;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	@JsonIgnore
	public List<TipOsiguranja> getTipoviOsiguranja() {
		if (tipoviOsiguranja == null) {
			return new ArrayList<TipOsiguranja>();
		}
		return tipoviOsiguranja;
	}
	
	@JsonProperty
	public void setTipoviOsiguranja(List<TipOsiguranja> tipoviOsiguranja) {
		this.tipoviOsiguranja = tipoviOsiguranja;
	}
	
}
