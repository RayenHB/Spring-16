package com.rayen.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class RocketType {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nomRocketType; 
    private String descriptionRocketType; 
    @JsonIgnore
    @OneToMany(mappedBy = "rocketType") 
    private List<Rocket> rockets; 

    public RocketType(String nomRocketType, String descriptionRocketType, List<Rocket> rockets) { // Updated constructor parameters
        super();
        this.nomRocketType = nomRocketType;
        this.descriptionRocketType = descriptionRocketType;
        this.rockets = rockets;
    }

    public Long getIdRocketType() {
        return id;
    }

    public void setIdRocketType(Long idRocketType) {
        this.id= idRocketType;
    }

    public String getNomRocketType() {
        return nomRocketType;
    }

    public void setNomRocketType(String nomRocketType) {
        this.nomRocketType = nomRocketType;
    }

    public String getDescriptionRocketType() {
        return descriptionRocketType;
    }

    public void setDescriptionRocketType(String descriptionRocketType) {
        this.descriptionRocketType = descriptionRocketType;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(List<Rocket> rockets) {
        this.rockets = rockets;
    }
}
