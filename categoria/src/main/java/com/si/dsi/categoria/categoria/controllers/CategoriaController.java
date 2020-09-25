package com.si.dsi.categoria.categoria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categoria")
public class CategoriaController {
	
	@GetMapping
	public void teste() {
		System.out.println("chegou");
	}
	
}
