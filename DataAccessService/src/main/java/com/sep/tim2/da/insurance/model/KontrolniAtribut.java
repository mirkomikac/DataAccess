package com.sep.tim2.da.insurance.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class KontrolniAtribut implements Serializable{

	private static final long serialVersionUID = -4758907317995159170L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private KontekstAtributa kontekstAtributa;
	
	@ManyToOne
	private TipAtributa tipAtributa;
	
	public KontrolniAtribut() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KontekstAtributa getKontekstAtributa() {
		return kontekstAtributa;
	}

	public void setKontekstAtributa(KontekstAtributa kontekstAtributa) {
		this.kontekstAtributa = kontekstAtributa;
	}

	public TipAtributa getTipAtributa() {
		return tipAtributa;
	}

	public void setTipAtributa(TipAtributa tipAtributa) {
		this.tipAtributa = tipAtributa;
	}
	
}
