package com.sep.tim2.da.insurance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VrednostAtributaOsiguranja implements Serializable{

	private static final long serialVersionUID = -7767383711555084420L;
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String vrednost;
	@ManyToOne
	private TipAtributa tipAtributa;
	@ManyToOne
	private Osiguranje osiguranje;
	
	public VrednostAtributaOsiguranja() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}

	public TipAtributa getTipAtributa() {
		return tipAtributa;
	}

	public void setTipAtributa(TipAtributa tipAtributa) {
		this.tipAtributa = tipAtributa;
	}

	public Osiguranje getOsiguranje() {
		return osiguranje;
	}

	public void setOsiguranje(Osiguranje osiguranje) {
		this.osiguranje = osiguranje;
	}
	
}
