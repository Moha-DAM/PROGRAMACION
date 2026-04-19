package empresa.Modelo.BBDD.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import empresa.Modelo.BBDD.utiles.DBUtils;
import empresa.Modelo.BBDD.utiles.SQLQuerys;
import empresa.Modelo.POO.Departamento;
import empresa.Modelo.POO.Empleado;


public class Gestor_Emp {

	
	public ArrayList<Empleado> mostrarTodosEmpleadosDep10(int numDep){
		
		ArrayList <Empleado> empleados = null;
		Connection connection = null ;
		PreparedStatement preparedStatement = null ;
		ResultSet resultSet = null ;

			try {
				Class.forName(DBUtils.DRIVER);
				connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				preparedStatement = connection.prepareStatement(SQLQuerys.SELECT_Apellido_Oficio_Salario_POR_NumDEp) ;
				//"SELECT apellido, oficio, salario FROM empleados WHERE  dept_no = ? ";
				
				preparedStatement.setInt(1, numDep);
				resultSet = preparedStatement.executeQuery() ;
		
				
				empleados = new ArrayList<Empleado>();
				
				while(resultSet.next()) {
					Empleado empleado = new Empleado();
					
					empleado.setApellido(resultSet.getString("apellido"));
					empleado.setOficio(resultSet.getString("oficio"));
					empleado.setSalario(resultSet.getDouble("salario"));
					
					
					empleados.add(empleado) ;	
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
		
	 return empleados ;
	 }
	
	public Empleado mostrarEmpleadoMaxSalario(){
		
		Connection connection = null ;
		PreparedStatement preparedStatement = null ;
		ResultSet resultSet = null ;

		Empleado empleado = new Empleado();
		Departamento departamento = new Departamento();
		
			try {
				Class.forName(DBUtils.DRIVER);
				connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				preparedStatement = connection.prepareStatement(SQLQuerys.SELECT_Apellido_Salario_Departamento_POR_MAX_SALARIO) ;
				resultSet = preparedStatement.executeQuery() ;
		
				if(resultSet.next()) {
					empleado.setApellido(resultSet.getString("apellido"));
					empleado.setSalario(resultSet.getDouble("salario"));
						departamento.setNum(resultSet.getInt("dept_no"));
					empleado.setDepartamento(departamento);
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
		
	 return empleado ;
	 }
	
}
	
	
	
	



