package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Arfamc;

@Repository
public interface IArfamcDao extends PagingAndSortingRepository<Arfamc, Long> {
	Arfamc findByCia(String cia);
}
