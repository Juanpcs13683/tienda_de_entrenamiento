package com.tienda.DAO;

import java.sql.*;
import java.util.ArrayList;

import com.tienda.DTO.UsuarioVO;

/**
 * Clase qeu permite el acceso a la base de datos
 * @author juanpcs
 *
 */
public class UsuarioDAO {

	public void regustrarUsuario(UsuarioVO user) {
		//llama y crea una instancia de la clase encargada de hacer la conexion
		Conexion conex = new Conexion();
		
		try {
		//sentencia que se ejecutara en la base de datos
			Statement estatuto = conex.getConnection().createStatement();
		
		//String que contiene la sentencia insert a ejecutar
		String sentencia = "INSERT INTO usuarios VALUES("
				+ user.getCedula_usuario() + "," + "'"
				+ user.getEmail_usuario() + "'," + "'"
				+ user.getNombre_usuario() + "'," + "'"
				+ user.getPassword() + "'," + "'"
				+ user.getUsuario() + "'"
				+ ");";
		
		//se ejecuta la sentencia en la base de datos
		estatuto.executeUpdate(sentencia);
		//impresion en consola para verificacion
		System.out.println("Registrado " + sentencia);
		//cerrando la sentencia y la conexion
		estatuto.close();
		conex.desconectar();
		}catch(SQLException e) {
			//si hay un error en el sql mostrarlo
			System.out.println("----------Error------------");
			System.out.println("No se pudo insertar el usuario");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
		}catch(Exception e) {
			//si hay cualquier otro error mostrarlo
			System.out.println("-----Error-----");
			System.out.println("No se pudo insertar el usuario");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	//consultar usuario
	public ArrayList<UsuarioVO> consultaUsuario(String usuario){
		//lista que contendra el o los usuarios obtenidos
		ArrayList<UsuarioVO> listausuarios = new ArrayList<UsuarioVO>();
		//instancia de la conexion
		Conexion conex = new Conexion();
		try {
			//prepare la sentencia en la base de datos
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM usuarios where usuario = ?");
			
			//se cambia el comodin ? por el dato que ha llegado en el parametro de 1
			consulta.setString(1, usuario);
			
			//ejecute la sentencia
			ResultSet resultado = consulta.executeQuery();
			
			//cree un objeto basado en la clase entidad con los datos encontrados
			if(resultado.next()) {
				UsuarioVO Usuario = new UsuarioVO();
				Usuario.setCedula_usuario(Integer.parseInt(resultado.getString("cedula_usuario")));
				Usuario.setEmail_usuario(resultado.getString("email_usuario"));
				Usuario.setNombre_usuario(resultado.getString("nombre_usuario"));
				Usuario.setPassword(resultado.getString("password"));
				Usuario.setUsuario(resultado.getString("usuario"));
				
				//agregando el usuario a la lista de usuarios
				listausuarios.add(Usuario);
			}
			
			//cerrar resultado, sentencia y conexion
			resultado.close();
			consulta.close();
			conex.desconectar();
		}catch(SQLException e) {
			//si hay un error en el sql mostrarlo
			System.out.println("-----Error------");
			System.out.println("No se pudo consultar el usuario");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}catch(Exception e) {
			// si hay cualquier otro error mostrarlo
			System.out.println("--------Error-------");
			System.out.println("No se pudo consultar el usuario");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		return listausuarios;
	}
}























