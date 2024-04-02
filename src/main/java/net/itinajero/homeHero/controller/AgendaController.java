package net.itinajero.homeHero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {
	
	@GetMapping("/")
	public String inicio() {
		return "Welcom Agenda!!";
	}

}
