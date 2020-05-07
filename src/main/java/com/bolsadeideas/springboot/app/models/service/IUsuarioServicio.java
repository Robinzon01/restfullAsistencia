package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Usuario;

public interface IUsuarioServicio {
	List<Usuario> getAllUsuarios();
	Usuario createUsusario(Usuario usuario);
	void deleteUsusario(Long codigo);
	//BUSCAMOS UN usuario
	Usuario findUsuario(Long codigo);
	//PAGINACION
	Page<Usuario> findAllPage(Pageable pageable);
}
