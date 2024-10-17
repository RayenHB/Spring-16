package com.rayen.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Rocket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRocket;
	private String nomRocket;
	private Double budgetRocket;
	private Date dateCreation;
	@ManyToOne
	private RocketType rocketType;


	public Rocket() {
	    super();
	}

	public Rocket(String nomRocket, Double budgetRocket, Date dateCreation) {
	    super();
	    this.nomRocket = nomRocket;
	    this.budgetRocket = budgetRocket;
	    this.dateCreation = dateCreation;
	}

	public Long getIdRocket() {
	    return idRocket;
	}

	public void setIdRocket(Long idRocket) {
	    this.idRocket = idRocket;
	}

	public String getNomRocket() {
	    return nomRocket;
	}

	public void setNomRocket(String nomRocket) {
	    this.nomRocket = nomRocket;
	}

	public Double getbudgetRocket() {
	    return budgetRocket;
	}

	public void setbudgetRocket(Double budgetRocket) {
	    this.budgetRocket = budgetRocket;
	}

	public Date getDateCreation() {
	    return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
	    this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
	    return "Rocket [idRocket=" + idRocket + ", nomRocket=" + nomRocket + ", budgetRocket=" + budgetRocket + ", dateCreation=" + dateCreation + "]";
	}

	public RocketType getRocketType() {
		return rocketType;
	}

	public void setRocketType(RocketType rocketType) {
		this.rocketType = rocketType;
	}

}
