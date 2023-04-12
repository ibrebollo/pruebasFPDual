package com.example.viewnext.ibr.pruebasFPDual.entities;


public class Usuario {
	
    private String nombreUsuario;
    private String email;
    private String idUsuario;
    
	public Usuario(String nombreUsuario, String email, String idUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.idUsuario = idUsuario;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

}
