package com.rayen.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rayen.demo.entities.Rocket;
import com.rayen.demo.service.RocketService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RocketRESTController {
	@Autowired
	RocketService rocketService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Rocket> getAllRockets() {
	    return rocketService.getAllRockets();
	}
	@RequestMapping(value="/{idRocket}", method = RequestMethod.GET)
	public Rocket getRocketById(@PathVariable("idRocket") Long id) {
	    return rocketService.getRocket(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Rocket createRocket(@RequestBody Rocket rocket) {
	    return rocketService.saveRocket(rocket);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Rocket updateRocket(@RequestBody Rocket rocket) {
	    return rocketService.updateRocket(rocket);
	}
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteRocket(@PathVariable("id") Long id) {
	    rocketService.deleteRocketById(id);
	}
	
	@RequestMapping(value="/rocketsTy/{id}", method = RequestMethod.GET)
	public List<Rocket> getRocketsByCatId(@PathVariable("id") Long id) {
	    return rocketService.findByRocketTypeId(id);
	}
	
	@RequestMapping(value="/rocksByName/{nom}",method = RequestMethod.GET)
	public List<Rocket> findByNomRocketContains(@PathVariable("nom") String nom) {
	return rocketService.findByNomRocketContains(nom);
	}


}