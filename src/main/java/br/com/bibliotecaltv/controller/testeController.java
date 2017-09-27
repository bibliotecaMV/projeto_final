package br.com.bibliotecaltv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testeController {
	
	@RequestMapping("testa")
	public String testes() {
		return "novo";
	}
}
