package com.tienda.DTO;

import java.io.Serializable;

//todas las clases entidad benen ser serializables, y deben estar encapsulados
public class UsuarioVO implements Serializable{
	
	//identificador unico de las clases entidad
	private static final long serialVersionUID = 1L;
	
	private Integer cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String password;
	private String usuario;
	
	/*
	 * @return the cedula_usuario.
	 */
	public Integer getCedula_usuario() {
		return cedula_usuario;
	}
	
	/**
	 * 
	 * @param cedula_usuario the cedula_usuario to set
	 */
	public void setCedula_usuario(Integer cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	
	/**
	 * 
	 * @return the email_usuario.
	 */
	public String getEmail_usuario() {
		return email_usuario;
	}
	
	/*
	 * @param email_usuario.
	 */
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
