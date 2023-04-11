package com.example.pruebasFPDual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HolaMundoController {

	@RequestMapping("/HolaMundo")
	@ResponseBody
	public String HolaMundo() {
		return "Hola Mundo";
		
	}
}
