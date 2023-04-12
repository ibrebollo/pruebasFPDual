package com.example.viewnext.ibr.pruebasFPDual.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.viewnext.ibr.pruebasFPDual.entities.Usuario;
import com.example.viewnext.ibr.pruebasFPDual.repositories.UsuarioDAOImpl;

@Service
public class UsuarioService {
	public ArrayList<Usuario> listarUsuarios() {
		return UsuarioDAOImpl.listaUsuario; // Si invocásemos al DAO con JPA recuperaría el listado de usuarios de la BBDD. 
	}
}
