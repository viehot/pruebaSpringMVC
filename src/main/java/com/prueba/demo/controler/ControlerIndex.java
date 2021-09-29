package com.prueba.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControlerIndex {

	@GetMapping("/")
	public String index() {
		return "mapa.html";
	}
}
