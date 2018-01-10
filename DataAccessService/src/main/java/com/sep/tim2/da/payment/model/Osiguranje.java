package com.sep.tim2.da.payment.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Osiguranje implements Serializable{
	
	private static final long serialVersionUID = -7663607432545399871L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Date datumSklapanja;
	
	@OneToMany(mappedBy = "osiguranje", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Uplata> uplate;
	
	public Osiguranje() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDatumSklapanja() {
		return datumSklapanja;
	}

	public void setDatumSklapanja(Date datumSklapanja) {
		this.datumSklapanja = datumSklapanja;
	}

	@JsonIgnore
	public List<Uplata> getUplate() {
		if(uplate == null) {
			return new ArrayList<>();
		}
		return uplate;
	}

	@JsonProperty
	public void setUplate(List<Uplata> uplate) {
		this.uplate = uplate;
	}
	
}
