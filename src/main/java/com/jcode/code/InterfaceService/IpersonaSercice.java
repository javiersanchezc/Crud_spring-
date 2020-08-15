package com.jcode.code.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.jcode.code.modelo.*;

public interface IpersonaSercice {
	
	public List<Persona> listar();
	public Optional<Persona> Listarid(int id);
	public int save(Persona p);
	public void delete(int id);
	
	
	

}
