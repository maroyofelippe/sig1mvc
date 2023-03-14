package com.fatec.sig1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GUIHomeController {
	
	/**
	 * processa a requisição localhost 8080
	 * @return a view html
	 */
	
	@GetMapping("/")
	public ModelAndView nemu() {
		return new ModelAndView("paginaMenu");
	}
	
	/**
	 * processa a requisição localhost:8080/clientes
	 * @return a view html
	 */
	
	@GetMapping("/clientes")
	public ModelAndView formClientes() {
		return new ModelAndView("cadastrarClientes");
	}

}
