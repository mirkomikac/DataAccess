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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "klijent")
public class Klijent implements Serializable{
	
	private static final long serialVersionUID = 23507162692089508L;

	@Id
	@SequenceGenerator(name = "KLIJENT_SEQ", allocationSize = 10)
	@GeneratedValue(generator = "KLIJENT_SEQ")
	private Long id;
	
	@Column
	private String ime;
	
	@Column
	private String prezime;
	
	@Column
	private String jmbg;
	
	@Column
	private String brojPasosa;
	
	@Column
	private String adresa;
	
	@Column
	private String brojTelefona;
	
	@Column
	private String email;
	
	@OneToMany(mappedBy = "klijent", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Polisa> polise;
	
	public Klijent() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getJmbg() {
		return jmbg;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public String getBrojPasosa() {
		return brojPasosa;
	}
	
	public void setBrojPasosa(String brojPasosa) {
		this.brojPasosa = brojPasosa;
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public String getBrojTelefona() {
		return brojTelefona;
	}
	
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonIgnore
	public List<Polisa> getPolise() {
		if(polise == null) {
			return new ArrayList<Polisa>();
		}
		return polise;
	}
	
	@JsonProperty
	public void setPolise(List<Polisa> polise) {
		this.polise = polise;
	}
	
}
