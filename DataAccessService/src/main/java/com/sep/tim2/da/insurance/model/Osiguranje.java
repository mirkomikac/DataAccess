package com.sep.tim2.da.insurance.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "osiguranje")
public class Osiguranje implements Serializable{
	
	private static final long serialVersionUID = -7663607432545399871L;

	@Id
	@SequenceGenerator(name = "OSIGURANJE_SEQ", allocationSize = 10)
	@GeneratedValue(generator = "OSIGURANJE_SEQ")
	private Long id;
	
	@ManyToOne
	private Polisa polisa;
	
	@ManyToOne
	private TipOsiguranja tipoviOsiguranja;
	
	//@OneToMany(mappedBy = "osiguranje", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<VrednostAtributaOsiguranja> vrednostiAtributaOsiguranja;

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
	
	public TipOsiguranja getTipoviOsiguranja() {
		return tipoviOsiguranja;
	}
	
	public void setTipoviOsiguranja(TipOsiguranja tipoviOsiguranja) {
		this.tipoviOsiguranja = tipoviOsiguranja;
	}
	
	/*
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
	*/
}
