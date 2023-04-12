package com.example.viewnext.ibr.pruebasFPDual.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viewnext.ibr.pruebasFPDual.entities.Usuario;

@RestController
public class UsuarioController {
	// Clase Rest que conectará el frontal con los servicios de Backend. 
	// Plantearemos un esqueleto para las típicas opciones de un CRUD de Usuarios. 
	
	 @GetMapping("/listarUsuarios")
	public ArrayList<Usuario> listarUsuarios(){
		 Usuario usuario = new Usuario("allbora", "allbora82@gmail.com", "bora");
		 ArrayList<Usuario> listaUsuarios = new ArrayList<>(); 
		 listaUsuarios.add(usuario);
		return listaUsuarios;
		
	}

}
