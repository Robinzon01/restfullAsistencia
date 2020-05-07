package com.bolsadeideas.springboot.app;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.bolsadeideas.springboot.app.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.app.models.entity.Role;
import com.bolsadeideas.springboot.app.models.entity.Usuario;
import com.bolsadeideas.springboot.app.models.service.IUsuarioServicio;
import com.fasterxml.jackson.databind.ObjectReader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaApplicationTests {
	
	@Autowired
	private IUsuarioServicio usuServi;
	
	@Test
	public void contextLoads() {
				
				List<Role> roles = new ArrayList<>();
				Role objR = new Role();
				objR.setAuthority("ROL_RH");
				roles.add(objR);
				
				Usuario objU = new Usuario();
				
				objU.setUsername("vuv");
				objU.setEnabled(true);
				objU.setPassword("vuv");
				objU.setRoles(roles);
				
				Usuario u = usuServi.createUsusario(objU);
				assertTrue(u.getPassword().equalsIgnoreCase(objU.getPassword()));

	}

}
