package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Company;

public interface ICompanyService {
	
	List<Company> getAllArfamc();
	Company createArfamc(Company objArfamc);
	void deleteArfamc(String cia);
	//BUSCAMOS UNA COMPAÑIA
	Company findArfamc(String cia);
	//PAGINACION
	Page<Company> findAll(Pageable pageable);

}
