package br.com.bibliotecaltv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	@RequestMapping("mostrarInicio")
	public String mostrarInicio(){
		return "inicio/index";
	}
}
