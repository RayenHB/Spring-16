package com.rayen.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rayen.demo.entities.Rocket;
import com.rayen.demo.entities.RocketType;

@RepositoryRestResource(path = "rest")
public interface RocketRepository extends JpaRepository<Rocket, Long> {
	List<Rocket> findByNomRocket(String nom);
	List<Rocket> findByNomRocketContains(String nom);
	@Query("select r from Rocket r where r.nomRocket like %?1 and r.budgetRocket > ?2")
	List<Rocket> findByNomBudget(String nom, Double budget);
	
	List<Rocket> findByRocketTypeId(Long id);
	List<Rocket> findByOrderByNomRocketAsc();
	@Query("select r from Rocket r order by r.nomRocket ASC, r.budgetRocket DESC")
	List<Rocket> trierRocketsNomsBudget();
	@Query("select r from Rocket r where r.rocketType = ?1")
	List<Rocket> findByRocketType(RocketType rocketType);
}
