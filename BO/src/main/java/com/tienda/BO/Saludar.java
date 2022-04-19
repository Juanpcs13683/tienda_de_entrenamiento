package com.tienda.BO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//clase de tipo rest control

@RestController
public class Saludar {

	@RequestMapping("/saludar")
	public String saludando() {
		return "Hola mundo";
	}
}
