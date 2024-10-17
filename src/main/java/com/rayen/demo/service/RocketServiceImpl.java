package com.rayen.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayen.demo.entities.Rocket;
import com.rayen.demo.entities.RocketType;
import com.rayen.demo.repos.RocketRepository;

@Service
public class RocketServiceImpl implements RocketService {
	@Autowired
	RocketRepository rocketRepository;

	@Override
	public Rocket saveRocket(Rocket r) {
	    return rocketRepository.save(r);
	}

	@Override
	public Rocket updateRocket(Rocket r) {
	    return rocketRepository.save(r);
	}

	@Override
	public void deleteRocket(Rocket r) {
	    rocketRepository.delete(r);
	}

	@Override
	public void deleteRocketById(Long id) {
	    rocketRepository.deleteById(id);
	}

	@Override
	public Rocket getRocket(Long id) {
	    return rocketRepository.findById(id).orElse(null);
	}

	@Override
	public List<Rocket> getAllRockets() {
	    return rocketRepository.findAll();
	}
	@Override
	public List<Rocket> findByNomRocket(String nom) {
	    return rocketRepository.findByNomRocket(nom);
	}

	@Override
	public List<Rocket> findByNomRocketContains(String nom) {
	    return rocketRepository.findByNomRocketContains(nom);
	}

	@Override
	public List<Rocket> findByNomBudget(String nom, Double prix) {
	    return rocketRepository.findByNomBudget(nom, prix);
	}

	@Override
	public List<Rocket> findByRocketType(RocketType rocketType) {
	    return rocketRepository.findByRocketType(rocketType);
	}

	@Override
	public List<Rocket> findByRocketTypeId(Long id) {
	    return rocketRepository.findByRocketTypeId(id);
	}

	@Override
	public List<Rocket> findByOrderByNomRocketAsc() {
	    return rocketRepository.findByOrderByNomRocketAsc();
	}

	@Override
	public List<Rocket> trierRocketsNomsBudget() {
	    return rocketRepository.trierRocketsNomsBudget();
	}


}
