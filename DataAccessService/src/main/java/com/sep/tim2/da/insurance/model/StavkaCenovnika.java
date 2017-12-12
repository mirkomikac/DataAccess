package com.sep.tim2.da.insurance.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StavkaCenovnika implements Serializable{

	private static final long serialVersionUID = 1530039357410789892L;
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private Double suma;
	@ManyToOne
	private Cenovnik cenovnik;
	@ManyToOne
	private PredefinisanaVrednost predefinisanaVrednost;
	
	public StavkaCenovnika() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getSuma() {
		return suma;
	}

	public void setSuma(Double suma) {
		this.suma = suma;
	}

	public Cenovnik getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}

	public PredefinisanaVrednost getPredefinisanaVrednost() {
		return predefinisanaVrednost;
	}

	public void setPredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost) {
		this.predefinisanaVrednost = predefinisanaVrednost;
	}
	
}
