package com.rayen.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rayen.demo.entities.Rocket;
import com.rayen.demo.repos.RocketRepository;

@SpringBootTest
class RocketsApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
	@Autowired
	private RocketRepository rocketRepository;

	@Test
	public void testCreateRocket() {
	    Rocket rocket = new Rocket("Falcon 9", 50000000.0, new Date());
	    rocketRepository.save(rocket);
	}
	@Test
	public void testFindRocket() {
	    Rocket r = rocketRepository.findById(1L).get();
	    System.out.println(r);
	}

	@Test
	public void testUpdateRocket() {
	    Rocket r = rocketRepository.findById(1L).get();
	    r.setbudgetRocket(1000.0); 
	    rocketRepository.save(r);
	}

	@Test
	public void testDeleteRocket() {
	    rocketRepository.deleteById(1L);
	}

	@Test
	public void testListAllRockets() {
	    List<Rocket> rockets = rocketRepository.findAll();
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}
	@Test
	public void testFindByNomRocketContains() {
	    List<Rocket> rockets = rocketRepository.findByNomRocketContains("Falcon");
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}
	
	@Test
	public void testFindByNomRocket() {
	    List<Rocket> rockets = rocketRepository.findByNomRocket("Falcon9");
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}

	@Test
	public void testFindByNomBudget() {
	    List<Rocket> rockets = rocketRepository.findByNomBudget("Falcon9", 50000000.0);
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}
	
	@Test
	public void findByRocketTypeId() {
	    List<Rocket> rockets = rocketRepository.findByRocketTypeId(1L);
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}
	@Test
	public void testfindByOrderByNomRocketAsc() {
	    List<Rocket> rockets = rocketRepository.findByOrderByNomRocketAsc();
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}
	@Test
	public void testTrierRocketsNomsBudget() {
	    List<Rocket> rockets = rocketRepository.trierRocketsNomsBudget();
	    for (Rocket r : rockets) {
	        System.out.println(r);
	    }
	}





}
