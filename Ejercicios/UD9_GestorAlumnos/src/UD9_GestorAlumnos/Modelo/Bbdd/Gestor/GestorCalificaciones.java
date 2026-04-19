package UD9_GestorAlumnos.Modelo.Bbdd.Gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import UD9_GestorAlumnos.Modelo.Bbdd.Utils.DBUtils;
import UD9_GestorAlumnos.Modelo.Bbdd.Utils.SQLQuerys;
import UD9_GestorAlumnos.Modelo.Pojos.Alumno;
import UD9_GestorAlumnos.Modelo.Pojos.Asignatura;
import UD9_GestorAlumnos.Modelo.Pojos.Calificacion;

public class GestorCalificaciones {
	
	
	
	public ArrayList <Calificacion> mostrarNotasTodosAlumno() {
		ArrayList <Calificacion> Calificaciones = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.SELECT_TODOS_NOTAS_ALUMNOS);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			resultSet = preparedStatement.executeQuery();
/*Se comprueba si hay un resultado en el resultSet y se crea un objeto Alumno 
 * al que se le pasan los atributos del resultSet
 */
			Calificaciones = new ArrayList <Calificacion>() ;
			
			while (resultSet.next()) {
				Alumno alumno = new Alumno();
				Asignatura asignatura = new Asignatura();
				Calificacion ret = new Calificacion();
				
				alumno.setDni(resultSet.getString("dni"));
				asignatura.setCodasignatura(resultSet.getString("codasignatura"));
				
				ret.setAlumno(alumno);
				ret.setAsignatura(asignatura);
				ret.setNota(resultSet.getInt("nota")); 
			
				Calificaciones.add(ret);
				
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
		return Calificaciones;
	}
	
	public ArrayList <Calificacion> mostrarNotasAlumno(String dni) {
		ArrayList <Calificacion> Calificaciones = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.SELECT_TODOS_NOTAS_BY_ID_ALUMNO);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			preparedStatement.setString(1, dni);
	
			resultSet = preparedStatement.executeQuery();
/*Se comprueba si hay un resultado en el resultSet y se crea un objeto Alumno 
 * al que se le pasan los atributos del resultSet
 */	
			Calificaciones = new ArrayList <Calificacion>() ;
			while (resultSet.next()) {
				Alumno alumno = new Alumno();
				Asignatura asignatura = new Asignatura();
				Calificacion calificacion = new Calificacion();
				
				alumno.setDni(resultSet.getString("dni"));
				asignatura.setCodasignatura(resultSet.getString("codasignatura"));
				
				calificacion.setAlumno(alumno);
				calificacion.setAsignatura(asignatura);
				calificacion.setNota(resultSet.getInt("nota"));
				
				Calificaciones.add(calificacion);
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
		return Calificaciones;
	}
	
	public void insertarNota(Alumno alumno, Asignatura asignatura ,int nota) {

		Connection connection = null;
		Statement statement = null;

		
		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();

			//String sql = SQLQuerys.INSERT_NEW_NOTA + alumno.getDni() + SQLQuerys.SEPARATOR + asignatura.getCodasignatura()
			//		+ SQLQuerys.SEPARATOR  + nota + SQLQuerys.END_BLOCK;

			//statement.executeUpdate(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (statement != null)
					statement.close();
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
	} 
	
	
}
