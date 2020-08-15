package com.jcode.code.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jcode.code.modelo.Persona;
@Repository
public interface Ipersona extends CrudRepository<Persona, Integer>{
	

}
