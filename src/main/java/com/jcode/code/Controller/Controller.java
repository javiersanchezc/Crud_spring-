package com.jcode.code.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jcode.code.InterfaceService.IpersonaSercice;
import com.jcode.code.modelo.Persona;


@org.springframework.stereotype.Controller
@RequestMapping

public class Controller {
	
	@Autowired
	private IpersonaSercice service;
	@GetMapping("/Listar")
	public String Listar(Model model) {
		List <Persona> personas=service.listar();
		model.addAttribute("personas",personas);
		
			
		
		return "index";
		
		
	}

}
