package Empresa;

import java.sql.*;

public class verDpto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String sqlPedido = "Select * from pedido";
		String urlConnexion = "jdbc:mysql://localhost:3306/pedidos_dam";
		String usuario = "root";
		String clave = "1234";
		
		String sqlPedidos = "select * from pedido";
		
		
		Connection connection = null; //representa la conexion con BBDD.
		Statement statement = null; // permite ejecutar sentencias SQL.
		ResultSet resultSet = null; // almacena los resultados de una consulta
		
		
		try {
			connection = DriverManager.getConnection(urlConnexion, usuario,clave) ;// Abrir la conexion .
			statement = connection.createStatement(); // Crea un objeto para ejecutar sentencias SQL.
			resultSet = statement.executeQuery(sqlPedidos); // Ejecuta la consulta SELECT y almacena los resultados en resultSet
			
			System.out.println("RefPed  FecPed");
			System.out.println("---------------------------------------------------");
			
			while (resultSet.next()) { //Mostrar y  Avanza fila por fila por los resultados
				
				System.out.printf("%2s   %10s \n", //cadenas alineada a 10 y 22 espacios
									resultSet.getString("RefPed"), // El tipo debe coincidir con el tipo de dato SQL.
									resultSet.getString("FecPed")
									
								);
				
			}
			
			resultSet.close();
			statement.close();
			connection.close();
			
			
		}catch (SQLException ex) {
			
			
			
		}
		
		
		
	
		
	}

}
