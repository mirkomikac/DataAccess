package com.sep.tim2.da.insurance.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Polisa implements Serializable{

	private static final long serialVersionUID = -6901258118812785721L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Date datumSklapanja;
	
	@Column
	private Double cena;
	
	@OneToMany(mappedBy = "polisa", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Osiguranje> osiguranja;
	
	@ManyToOne
	private Klijent klijent;
	
	public Polisa() {
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
	
	public Double getCena() {
		return cena;
	}
	
	public void setCena(Double cena) {
		this.cena = cena;
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
	public Klijent getKlijent() {
		return klijent;
	}
	
	@JsonProperty
	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}

}
