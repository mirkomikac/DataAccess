package com.sep.tim2.da.insurance.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TipOsiguranja implements Serializable{

	private static final long serialVersionUID = -2182384755331442068L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String naziv;
	
	@Column(nullable = false)
	private short brojFormi;
	
	@ManyToOne(optional = false)
	private OsiguravajucaKuca osiguravajucaKuca;
	
	@OneToMany(mappedBy = "tipOsiguranja", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Osiguranje> osiguranja;
	
	@ManyToMany(targetEntity = com.sep.tim2.da.insurance.model.TipAtributa.class, mappedBy = "tipoviOsiguranja")
	private List<TipAtributa> tipoviAtributa;
	
	@ManyToMany(targetEntity = com.sep.tim2.da.insurance.model.KontekstAtributa.class)
	private List<KontekstAtributa> konteksti;
	
	public TipOsiguranja() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public short getBrojFormi() {
		return brojFormi;
	}

	public void setBrojFormi(short brojFormi) {
		this.brojFormi = brojFormi;
	}

	public OsiguravajucaKuca getOsiguravajucaKuca() {
		return osiguravajucaKuca;
	}
	
	public void setOsiguravajucaKuca(OsiguravajucaKuca osiguravajucaKuca) {
		this.osiguravajucaKuca = osiguravajucaKuca;
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
	public List<TipAtributa> getTipoviAtributa() {
		if(tipoviAtributa == null) {
			return new ArrayList<TipAtributa>();
		}
		return tipoviAtributa;
	}
	
	@JsonProperty
	public void setTipoviAtributa(List<TipAtributa> tipoviAtributa) {
		this.tipoviAtributa = tipoviAtributa;
	}

	@JsonIgnore
	public List<KontekstAtributa> getKonteksti() {
		return konteksti;
	}

	@JsonProperty
	public void setKonteksti(List<KontekstAtributa> konteksti) {
		this.konteksti = konteksti;
	}	
	
}
