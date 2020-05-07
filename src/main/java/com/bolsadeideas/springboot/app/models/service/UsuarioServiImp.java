package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.app.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.app.models.entity.Usuario;

@Service
public class UsuarioServiImp implements IUsuarioServicio {
	@Autowired
	private IUsuarioDao usuDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public Usuario createUsusario(Usuario usuario) {
		Usuario objU = new Usuario();
		objU.setEnabled(usuario.getEnabled());
		objU.setPassword(passwordEncoder.encode(usuario.getPassword()));
		objU.setRoles(usuario.getRoles());
		objU.setUsername(usuario.getUsername());
		
		return usuDao.save(objU);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsusario(Long codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findUsuario(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Usuario> findAllPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
