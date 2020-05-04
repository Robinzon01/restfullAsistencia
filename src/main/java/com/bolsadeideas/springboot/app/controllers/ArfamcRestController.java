package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Arfamc;
import com.bolsadeideas.springboot.app.models.service.IArfamcService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST}) //NOS PERMITE DAR COMUNICACION ENTRE SERVIDORES
@RestController
@RequestMapping("/api/company")
public class ArfamcRestController {
	
	@Autowired
	private IArfamcService arfaService;
	
	@GetMapping(value = "/list")
	@Secured("ROLE_USER")
	public List<Arfamc> listar() {
		return arfaService.getAllArfamc(); 
	}

}
