package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Gelocation;
import com.bolsadeideas.springboot.app.models.service.IGelocationService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/gelo")
public class GelocationRestController {
	@Autowired
	private IGelocationService geloService;
	
	@GetMapping(value = "/get/{cia}/{user}")
	@Secured("ROLE_USER")
	public Gelocation getGelocation(@PathVariable("cia") String cia, @PathVariable("user") String user) {
		return geloService.searchGeloCiaAnaUsu(cia, user);
	}
}
