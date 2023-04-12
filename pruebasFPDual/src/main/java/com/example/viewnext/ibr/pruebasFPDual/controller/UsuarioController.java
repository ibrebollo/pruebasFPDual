package com.example.viewnext.ibr.pruebasFPDual.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viewnext.ibr.pruebasFPDual.entities.Usuario;
import com.example.viewnext.ibr.pruebasFPDual.repositories.UsuarioDAOImpl;
import com.example.viewnext.ibr.pruebasFPDual.services.UsuarioService;

@RestController
public class UsuarioController {
	// Clase Rest que conectará el frontal con los servicios de Backend.
	// Plantearemos un esqueleto para las típicas opciones de un CRUD de Usuarios.
	@Autowired
	private UsuarioService usuarioService; 
	
	
	
	public UsuarioController() {
		Usuario usuario1 = new Usuario("Usuario1", "correousuario1@gmail.com", "idUsuario1");
		Usuario usuario2 = new Usuario("Usuario2", "correousuario2@gmail.com", "idUsuario2");
		UsuarioDAOImpl.listaUsuario.add(usuario1);
		UsuarioDAOImpl.listaUsuario.add(usuario2);
	}


//  EJEMPLO 1 estático. 
//	@GetMapping("/listarUsuarios")
//	public ArrayList<Usuario> listarUsuarios() {
//		Usuario usuario = new Usuario("allbora", "allbora82@gmail.com", "bora");
//		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
//		listaUsuarios.add(usuario);
//		return listaUsuarios;
//
//	}
	
	// EJEMPLO 2 estático pero con servicio
	@GetMapping("/listarUsuarios")
	public ArrayList<Usuario> listarUsuarios() {		
		return usuarioService.listarUsuarios();

	}

}
