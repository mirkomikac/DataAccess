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
	
	@Enumerated(EnumType.STRING)
	private TipUplate tipUplate;
	
	@Column(length = 30)
	private String trgovacId;
	
	@Column(length = 100)
	private String lozinkaTrgovca;

	@Column(precision=10, scale=2)
	private Double iznos;
	
	@Column
	private Date datumUplate;
	
	@Column
	private String errorUrl;
	
	@ManyToOne
	private Osiguranje osiguranje;
	
	public Uplata() {
	}

	public String getErrorUrl() {
		return errorUrl;
	}

	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
	}


	public String getTrgovacId() {
		return trgovacId;
	}

	public void setTrgovacId(String trgovacId) {
		this.trgovacId = trgovacId;
	}

	public String getLozinkaTrgovca() {
		return lozinkaTrgovca;
	}

	public void setLozinkaTrgovca(String lozinkaTrgovca) {
		this.lozinkaTrgovca = lozinkaTrgovca;
	}

	public Double getIznos() {
		return iznos;
	}

	public void setIznos(Double iznos) {
		this.iznos = iznos;
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

	public TipUplate getTipUplate() {
		return tipUplate;
	}

	public void setTipUplate(TipUplate tipUplate) {
		this.tipUplate = tipUplate;
	}

	public Date getDatumUplate() {
		return datumUplate;
	}

	public void setDatumUplate(Date datumUplate) {
		this.datumUplate = datumUplate;
	}

	public Osiguranje getOsiguranje() {
		return osiguranje;
	}

	public void setOsiguranje(Osiguranje osiguranje) {
		this.osiguranje = osiguranje;
	}
	
}
