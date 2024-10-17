package com.rayen.demo.service;

import java.util.List;

import com.rayen.demo.entities.Rocket;
import com.rayen.demo.entities.RocketType;

public interface RocketService {
	Rocket saveRocket(Rocket r);
	Rocket updateRocket(Rocket r);
	void deleteRocket(Rocket r);
	void deleteRocketById(Long id);
	Rocket getRocket(Long id);
	List<Rocket> getAllRockets();
	List<Rocket> findByNomRocket(String nom);
	List<Rocket> findByNomRocketContains(String nom);
	List<Rocket> findByNomBudget(String nom, Double prix);
	List<Rocket> findByRocketType(RocketType rocketType);
	List<Rocket> findByRocketTypeId(Long id);
	List<Rocket> findByOrderByNomRocketAsc();
	List<Rocket> trierRocketsNomsBudget();


}
