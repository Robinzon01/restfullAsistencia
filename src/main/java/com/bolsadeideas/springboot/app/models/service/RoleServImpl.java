package com.bolsadeideas.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.models.dao.IRoleDao;
@Service
public class RoleServImpl implements IRolService {
	@Autowired
	private IRoleDao rolDoa;
	@Override
	public List<String> rolesUnicos() {
		List<String> roles = new ArrayList<>();
		rolDoa.findRolesUnicos().iterator().forEachRemaining(roles :: add);
		return roles;
	}

}
