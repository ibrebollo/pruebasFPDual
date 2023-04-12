package com.example.viewnext.ibr.pruebasFPDual.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HolaMundoController {

//	@RequestMapping("/HolaMundo")
//	@ResponseBody
	@GetMapping("/HolaMundo")
	public String HolaMundo() {
		return "Hola Mundo RestController";
		
	}
}
