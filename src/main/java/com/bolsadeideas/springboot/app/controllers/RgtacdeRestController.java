package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Rgtacde;
import com.bolsadeideas.springboot.app.models.service.IRgtacdeService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/rgta")
public class RgtacdeRestController {
	
	@Autowired
	private IRgtacdeService rgtaService;
	
	//METODO POST
	@PostMapping("/save") // http://localhost:555/company/save
	public void guardar(@RequestBody @Valid Rgtacde objRg) {
		rgtaService.createRgtacde(objRg);
	}
	
    @GetMapping(value = "/rgHoy/{cia}/{user}")
	@Secured("ROLE_USER")
	public List<Rgtacde> registroHoy(@PathVariable("cia") String cia, @PathVariable("user") String user) {
		return rgtaService.registroHoyAndUser(cia, user); 
	}

}
