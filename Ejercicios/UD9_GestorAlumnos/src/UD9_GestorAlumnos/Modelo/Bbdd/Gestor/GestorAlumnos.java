package UD9_GestorAlumnos.Modelo.Bbdd.Gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import UD9_GestorAlumnos.Modelo.Bbdd.Utils.DBUtils;
import UD9_GestorAlumnos.Modelo.Bbdd.Utils.SQLQuerys;
import UD9_GestorAlumnos.Modelo.Pojos.Alumno;
	/**
	 * Esta clase tiene todos los metodos relevantes a la tabla alumnos de BBDD.
	 */
public class GestorAlumnos {
	
/**
 * Retorna de BBDD todos los datos del alumno dado el nombre, apellidos
 * 
 * @param nombre
 * @param apellidos
 * @return El alumno buscado
 */
	public Alumno buscarAlumnoPorNombreyApellidos(String nombre, String apellidos) {  // OK
	    Alumno alm = null;
	    String sql = SQLQuerys.SELECT_ALUMNO_POR_NOMBRE_Y_APELLIDOS;

	    Connection connection = null;
	    PreparedStatement statement = null;
	    ResultSet resultSet = null;

	    try {
	        connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
	        statement = connection.prepareStatement(sql);

	        statement.setString(1, nombre);
	        statement.setString(2, apellidos);

	        resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            alm = new Alumno();
	            alm.setDni(resultSet.getString("dni"));
	            alm.setNombre(resultSet.getString("nombre"));
	            alm.setApellidos(resultSet.getString("apellidos"));
	            alm.setGrupo(resultSet.getString("grupo"));
	        }

	    } catch (SQLException e) {
	        System.out.println("Error con la BBDD - " + e.getMessage());
	    } finally {
	        try {
	            if (resultSet != null) resultSet.close();
	        } catch (SQLException e) {}

	        try {
	            if (statement != null) statement.close();
	        } catch (SQLException e) {}

	        try {
	            if (connection != null) connection.close();
	        } catch (SQLException e) {}
	    }

	    if (alm == null) {
	        System.out.println("Alumno no encontrado");
	    }

	    return alm;
	}


//MOSTRAR
	public ArrayList <Alumno> mostrarTodosAlumnos() {  // OK
		//alumnos.clear(); // Limpiar la lista antes de llenarla otra vez
		ArrayList<Alumno> alumnos = new ArrayList<>();
		String sql = SQLQuerys.SELECT_TODOS_ALUMNOS ;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.prepareStatement(sql);
	
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				
				Alumno al = new Alumno();
				al.setDni(resultSet.getString("dni"));
				al.setNombre(resultSet.getString("nombre"));
				al.setApellidos(resultSet.getString("apellidos"));
				al.setGrupo(resultSet.getString("grupo"));
				alumnos.add(al);
				//ret.setNota(resultSet.getInt("nota"));
			}
		} catch (SQLException e) {
	        System.out.println("Error con la BBDD: " + e.getMessage());
	    } finally {
	        try {
	            if (resultSet != null) resultSet.close();
	        } catch (SQLException e) {}
	        try {
	            if (statement != null) statement.close();
	        } catch (SQLException e) {}
	        try {
	            if (connection != null) connection.close();
	        } catch (SQLException e) {}
	    }
		
		if (alumnos.isEmpty()) {
	        System.out.println("No hay alumnos en la base de datos");
	    }
		return alumnos;
	}
	//-------------------------------------------------------------------------------------------
		
			
//INSERTS	
	/**
	 * Inserta un alumno en BBDD
	 * 
	 * @param alumno
	 */
	public void insertarAlumno(Alumno alumno) {   // OK
		String sql = SQLQuerys.INSERT_NEW_ALUMNO ;
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			
			statement = connection.prepareStatement( sql);
			
			statement.setString(1, alumno.getDni());
			statement.setString(2, alumno.getNombre());
			statement.setString(3, alumno.getApellidos());
			statement.setString(4, alumno.getGrupo());
			
			statement.executeUpdate();


		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {		
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
			}
		}
	}


//MODIFICAR
	public void modificarDatosAlumno(String dni, Alumno alumno) {  //OK
	    String sql = SQLQuerys.UPDATE_DATOS_ALUMNO_BY_DNI;

	    Connection connection = null;
	    PreparedStatement statement = null;

	    try {
	        connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
	        statement = connection.prepareStatement(sql);

	        statement.setString(1, alumno.getDni());
	        statement.setString(2, alumno.getNombre());
	        statement.setString(3, alumno.getApellidos());
	        statement.setString(4, alumno.getGrupo());
	        statement.setString(5, dni);   // WHERE

	        int filas = statement.executeUpdate();

	        if (filas == 0) {
	            System.out.println("No se encontro alumno con ese DNI");
	        } else {
	            System.out.println("Alumno actualizado correctamente");
	        }

	    } catch (SQLException e) {
	        System.out.println("Error con la BBDD - " + e.getMessage());
	    } finally {
	        try {
	            if (statement != null) statement.close();
	        } catch (SQLException e) {}

	        try {
	            if (connection != null) connection.close();
	        } catch (SQLException e) {}
	    }
	}

	
	public void modificarDniAlumno(String dni, String newDni) {   // podemos usar pojo Alumno en lugar de dni para buscar el alumno con DNI

		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.UPDATE_DNI_ALUMNO_BY_DNI);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			preparedStatement.setString(1, newDni);
			preparedStatement.setString(2, dni);
			
			preparedStatement.executeUpdate();

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			
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
	}
	public void modificarNombreAlumno(String dni, String newNombre) { // podemos usar pojo Alumno en lugar de dni para buscar el alumno con DNI

		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.UPDATE_NOMBRE_ALUMNO_BY_DNI);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			preparedStatement.setString(1, newNombre);
			preparedStatement.setString(2, dni);
			
			preparedStatement.executeUpdate();

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			
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
	}
	public void modificarApellidoAlumno(String dni, String newApellido) { // podemos usar pojo Alumno en lugar de dni para buscar el alumno con DNI

		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.UPDATE_APELLIDOS_ALUMNO_BY_DNI);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			preparedStatement.setString(1, newApellido);
			preparedStatement.setString(2, dni);
			
			preparedStatement.executeUpdate();

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			
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
	}
	public void modificarGrupoAlumno(Alumno alumno, String newGrupo) { // podemos usar String dni en lugar de Pojo Alumno para buscar el alumno con DNI

		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.UPDATE_GRUPO_ALUMNO_BY_DNI);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			preparedStatement.setString(1, newGrupo);
			preparedStatement.setString(2, alumno.getDni());
			
			preparedStatement.executeUpdate();

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			
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
	}
	
//DELETES
	public boolean borrarAlumno(String dni) { //OK

	    boolean encontrado = false;
	    String sql = SQLQuerys.DELETE_ALUMNO_BY_DNI;

	    Connection connection = null;
	    PreparedStatement statement = null;

	    try {
	        connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
	        statement = connection.prepareStatement(sql);

	        statement.setString(1, dni);

	        int filas = statement.executeUpdate();

	        if (filas > 0) {
	            encontrado = true;   // se encontró y se borró
	        }

	    } catch (SQLException e) {
	        System.out.println("Error con la BBDD - " + e.getMessage());
	    } finally {
	        try {
	            if (statement != null) statement.close();
	        } catch (SQLException e) {}

	        try {
	            if (connection != null) connection.close();
	        } catch (SQLException e) {}
	    }

	    return encontrado;
	}

	
	public void borrarTodosAlumnos() {  //OK

	    String sql = SQLQuerys.DELETE_ALL_ALUMNOS;

	    Connection connection = null;
	    PreparedStatement statement = null;

	    try {
	        connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
	        statement = connection.prepareStatement(sql);

	        statement.executeUpdate();
	        
	        /* NUMERO ALUMNOS BORRADOS
	        int filas = statement.executeUpdate();
	        System.out.println("Se borraron " + filas + " alumnos."); */

	    } catch (SQLException e) {
	        System.out.println("Error con la BBDD - " + e.getMessage());
	    } finally {
	        try {
	            if (statement != null) statement.close();
	        } catch (SQLException e) {}

	        try {
	            if (connection != null) connection.close();
	        } catch (SQLException e) {}
	    }
	}

	
	
}  
