package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Gelocation;

public interface IGelocationService {
	Gelocation searchGeloCiaAnaUsu(String cia, String user);
}
