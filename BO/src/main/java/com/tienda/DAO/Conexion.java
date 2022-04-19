package com.tienda.DAO;

import java.sql.*;

/**
 * Clase que permite conectar con la base de datos
 * @author juanpcs
 *
 */

public class Conexion {
	
	/** parametros de conexion */
	static String nombre_base_datos = "tiendajuanc";
	static String usuariobd = "root";
	static String clavebd = "admin";
	static String url = "jdbc:mysql://127.0.0.1/" + nombre_base_datos;

	//objeto sin inicializar de la conexion
	Connection connection = null;
	
	/** consructor de DbConnection */
	public Conexion() {
		try {
			// obtenemos el driver para mysql
			Class.forName("com.mysl.cj.jdbc.Driver");
			// obtenemos la conexion
			connection = DriverManager.getConnection(url, usuariobd, clavebd);
			
			//si hay conexion correcta mostrar informacion en consola
			if (connection != null) {
				System.out.println("Conexion a base de datos " + nombre_base_datos + "OK\n");
			}
		}catch(SQLException e) {
			//error de la base de datos
			System.out.println(e);
		}catch(ClassNotFoundException e){
			//error en carga de clases
			System.out.println(e);
		}catch(Exception e) {
			//cualquier otro error
			System.out.println(e);
		}
	}
	
	/** Permite retornar la conexion */
	public Connection getConnection() {
		return connection;
	}
	
	//cerrando la conexion
	public void desconectar() {
		connection = null;
	}
}
