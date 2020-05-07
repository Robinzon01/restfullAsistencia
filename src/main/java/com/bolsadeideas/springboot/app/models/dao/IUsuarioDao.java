package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Usuario;

@Repository
public interface IUsuarioDao extends PagingAndSortingRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
	@Query("SELECT u FROM Usuario u")
	Page<Usuario> findAllPage(Pageable pageable);
	
}
