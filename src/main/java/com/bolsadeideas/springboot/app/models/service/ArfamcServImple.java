package com.bolsadeideas.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.models.dao.IArfamcDao;
import com.bolsadeideas.springboot.app.models.entity.Arfamc;

@Service
public class ArfamcServImple implements IArfamcService {
	
	@Autowired
	private IArfamcDao arfamcDao;

	@Override
	public List<Arfamc> getAllArfamc() {
		List<Arfamc> cias = new ArrayList<>();
		arfamcDao.findAll().iterator().forEachRemaining(cias::add);
		return cias;
	}

	@Override
	public Arfamc createArfamc(Arfamc objArfamc) {
		// TODO Auto-generated method stub
		return arfamcDao.save(objArfamc);
	}

	@Override
	public void deleteArfamc(String cia) {
		// TODO Auto-generated method stub
		 arfamcDao.delete( this.findArfamc(cia) );
	}

	@Override
	public Arfamc findArfamc(String cia) {
		// TODO Auto-generated method stub
		return arfamcDao.findByCia(cia);
	}

	@Override
	public Page<Arfamc> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
