package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Role;

@Repository
public interface IRoleDao extends CrudRepository<Role, Long>{

	@Query("SELECT r.authority FROM Role r GROUP BY r.authority")
	List<String> findRolesUnicos();
}
