package com.bolsadeideas.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.models.dao.ICompanyDao;
import com.bolsadeideas.springboot.app.models.entity.Company;

@Service
public class CompanyServImple implements ICompanyService {
	
	@Autowired
	private ICompanyDao arfamcDao;

	@Override
	public List<Company> getAllArfamc() {
		List<Company> cias = new ArrayList<>();
		arfamcDao.findAll().iterator().forEachRemaining(cias::add);
		return cias;
	}

	@Override
	public Company createArfamc(Company objArfamc) {
		// TODO Auto-generated method stub
		return arfamcDao.save(objArfamc);
	}

	@Override
	public void deleteArfamc(String cia) {
		// TODO Auto-generated method stub
		 arfamcDao.delete( this.findArfamc(cia) );
	}

	@Override
	public Company findArfamc(String cia) {
		// TODO Auto-generated method stub
		return arfamcDao.findByCia(cia);
	}

	@Override
	public Page<Company> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
