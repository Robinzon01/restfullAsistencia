package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Company;

@Repository
public interface ICompanyDao extends PagingAndSortingRepository<Company, Long> {
	Company findByCia(String cia);
}
