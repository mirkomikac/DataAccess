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
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class KontekstAtributa implements Serializable{

	private static final long serialVersionUID = 2169394029110006240L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String naziv;
	
	@Column(nullable = false)
	private Boolean visestrukoDodavanje;
	
	@Column(nullable = false)
	private short redniBrojForme;
	
	@Column(nullable = false)
	private Boolean predstavljaGrupu;
	
	@OneToMany(mappedBy = "kontekst", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TipAtributa> tipoviAtributa = new ArrayList<>();
	
	@ManyToMany(targetEntity = com.sep.tim2.da.insurance.model.TipOsiguranja.class, mappedBy = "konteksti")
	private List<TipOsiguranja> tipoviOsiguranja = new ArrayList<>();
	
	public KontekstAtributa() {
	}

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
	
	public Boolean getVisestrukoDodavanje() {
		return visestrukoDodavanje;
	}

	public void setVisestrukoDodavanje(Boolean visestrukoDodavanje) {
		this.visestrukoDodavanje = visestrukoDodavanje;
	}

	public short getRedniBrojForme() {
		return redniBrojForme;
	}

	public void setRedniBrojForme(short redniBrojForme) {
		this.redniBrojForme = redniBrojForme;
	}

	public Boolean getPredstavljaGrupu() {
		return predstavljaGrupu;
	}

	public void setPredstavljaGrupu(Boolean predstavljaGrupu) {
		this.predstavljaGrupu = predstavljaGrupu;
	}

	@JsonIgnore
	public List<TipAtributa> getTipoviAtributa() {
		return tipoviAtributa;
	}
	
	@JsonProperty
	public void setTipoviAtributa(List<TipAtributa> tipoviAtributa) {
		this.tipoviAtributa = tipoviAtributa;
	}

	@JsonIgnore
	public List<TipOsiguranja> getTipoviOsiguranja() {
		return tipoviOsiguranja;
	}

	@JsonProperty
	public void setTipoviOsiguranja(List<TipOsiguranja> tipoviOsiguranja) {
		this.tipoviOsiguranja = tipoviOsiguranja;
	}
	
}
