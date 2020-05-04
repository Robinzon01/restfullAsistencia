package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Arfamc;

public interface IArfamcService {
	
	List<Arfamc> getAllArfamc();
	Arfamc createArfamc(Arfamc objArfamc);
	void deleteArfamc(String cia);
	//BUSCAMOS UNA COMPAÑIA
	Arfamc findArfamc(String cia);
	//PAGINACION
	Page<Arfamc> findAll(Pageable pageable);

}
