package com.sep.tim2.da.payment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Uplata implements Serializable{

	private static final long serialVersionUID = -2184014031936616233L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private StatusUplate status;
	
	@Column
	private Date datumUplate;
	
	@ManyToOne
	private Polisa polisa;
	
	public Uplata() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusUplate getStatus() {
		return status;
	}

	public void setStatus(StatusUplate status) {
		this.status = status;
	}

	public Date getDatumUplate() {
		return datumUplate;
	}

	public void setDatumUplate(Date datumUplate) {
		this.datumUplate = datumUplate;
	}

	public Polisa getPolisa() {
		return polisa;
	}

	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}
	
}
