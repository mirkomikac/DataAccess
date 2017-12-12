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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sep.tim2.da.payment.model.Uplata;

@Entity
@Table(name = "Polisa")
public class Polisa implements Serializable{

	private static final long serialVersionUID = -6901258118812785721L;
	
	@Id
	@SequenceGenerator(name = "POLISA_SEQ", allocationSize = 10)
	@GeneratedValue(generator = "POLISA_SEQ")
	private Long id;
	
	@Column
	private Double cena;
	
	@OneToMany(mappedBy = "polisa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Osiguranje> osiguranja;
	
	@ManyToMany(targetEntity = com.sep.tim2.da.insurance.model.Klijent.class)
	private List<Klijent> klijenti;
	
	@OneToMany(mappedBy = "polisa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Uplata> uplate;
	
	public Polisa() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getCena() {
		return cena;
	}
	
	public void setCena(Double cena) {
		this.cena = cena;
	}
	
	@JsonIgnore
	public List<Osiguranje> getOsiguranja() {
		if(osiguranja == null) {
			return new ArrayList<Osiguranje>();
		}
		return osiguranja;
	}
	
	@JsonProperty
	public void setOsiguranja(List<Osiguranje> osiguranja) {
		this.osiguranja = osiguranja;
	}
	
	@JsonIgnore
	public List<Klijent> getKlijenti() {
		if(klijenti == null) {
			return new ArrayList<Klijent>();
		}
		return klijenti;
	}
	
	@JsonProperty
	public void setKlijenti(List<Klijent> klijenti) {
		this.klijenti = klijenti;
	}

	@JsonIgnore
	public List<Uplata> getUplate() {
		if(uplate == null) {
			uplate = new ArrayList<>();
		}
		return uplate;
	}

	@JsonProperty
	public void setUplate(List<Uplata> uplate) {
		this.uplate = uplate;
	}
	
}
