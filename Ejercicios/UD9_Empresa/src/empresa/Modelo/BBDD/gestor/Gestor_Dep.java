package empresa.Modelo.BBDD.gestor;

import java.sql.*;
import java.util.ArrayList;

import empresa.Modelo.BBDD.utiles.DBUtils;
import empresa.Modelo.BBDD.utiles.SQLQuerys;
import empresa.Modelo.POO.Departamento;


public class Gestor_Dep {
	
	
 public ArrayList<Departamento> mostrarTodosDepartamentos(){
	
	ArrayList <Departamento> departamentos = null;
	Connection connection = null ;
	PreparedStatement preparedStatement = null ;
	ResultSet resultSet = null ;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.SELECT_TODOS_DEPARTAMENTOS) ;
			resultSet = preparedStatement.executeQuery() ;
		
			departamentos = new ArrayList <Departamento>();
			
			while(resultSet.next()) {
				Departamento departamento = new Departamento()  ;
				departamento.setNum(resultSet.getInt("dept_no"));
				departamento.setNombre(resultSet.getString("dnombre"));
				departamento.setUbicacion(resultSet.getString("loc"));
				
				departamentos.add(departamento);	
			}
				
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
	
 return departamentos ;
 }
	

 
 
}
