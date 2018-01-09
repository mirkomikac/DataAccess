package com.sep.tim2.da.insurance.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class TipAtributa implements Serializable{
	
	private static final long serialVersionUID = 5218576756408205556L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String naziv;
	
	@Enumerated(EnumType.STRING)
	private DomenAtributa domen;
	
	@Column(nullable = false)
	private Boolean obavezan;
	
	@Column(nullable = false)
	private Boolean uticeNaCenu;
	
	@Column(nullable = false)
	private Boolean slobodnoPolje;
	
	@ManyToOne
	private KontekstAtributa kontekst;
	
	@OneToMany(mappedBy = "tipAtributa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<KontrolniAtribut> kontrolniAtributi;
	
	@OneToMany(mappedBy = "tipAtributa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PredefinisanaVrednost> predefinisaneVrednosti = new ArrayList<>();
	
	@OneToMany(mappedBy = "tipAtributa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<VrednostAtributaOsiguranja> vrednostiAtributa = new ArrayList<>();
	
	@ManyToMany(targetEntity = com.sep.tim2.da.insurance.model.TipOsiguranja.class)
	private List<TipOsiguranja> tipoviOsiguranja = new ArrayList<>();
	
	public TipAtributa() {
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

	public DomenAtributa getDomen() {
		return domen;
	}

	public void setDomen(DomenAtributa domen) {
		this.domen = domen;
	}

	public Boolean getObavezan() {
		return obavezan;
	}

	public void setObavezan(Boolean obavezan) {
		this.obavezan = obavezan;
	}

	public Boolean getUticeNaCenu() {
		return uticeNaCenu;
	}

	public void setUticeNaCenu(Boolean uticeNaCenu) {
		this.uticeNaCenu = uticeNaCenu;
	}

	public Boolean getSlobodnoPolje() {
		return slobodnoPolje;
	}

	public void setSlobodnoPolje(Boolean slobodnoPolje) {
		this.slobodnoPolje = slobodnoPolje;
	}
	
	public KontekstAtributa getKontekst() {
		return kontekst;
	}

	public void setKontekst(KontekstAtributa kontekst) {
		this.kontekst = kontekst;
	}

	@JsonIgnore
	public List<KontrolniAtribut> getKontrolniAtributi() {
		return kontrolniAtributi;
	}

	@JsonProperty
	public void setKontrolniAtributi(List<KontrolniAtribut> kontrolniAtributi) {
		this.kontrolniAtributi = kontrolniAtributi;
	}

	@JsonIgnore
	public List<PredefinisanaVrednost> getPredefinisaneVrednosti() {
		return predefinisaneVrednosti;
	}

	@JsonProperty
	public void setPredefinisaneVrednosti(List<PredefinisanaVrednost> predefinisaneVrednosti) {
		this.predefinisaneVrednosti = predefinisaneVrednosti;
	}
	
	@JsonIgnore
	public List<VrednostAtributaOsiguranja> getVrednostiAtributa() {
		return vrednostiAtributa;
	}
	
	@JsonProperty
	public void setVrednostiAtributa(List<VrednostAtributaOsiguranja> vrednostiAtributa) {
		this.vrednostiAtributa = vrednostiAtributa;
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
