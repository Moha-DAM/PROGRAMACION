package ud9_Ejemplo.Modelo.Bbdd.Gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ud9_Ejemplo.Modelo.Bbdd.Utils.DBUtils;
import ud9_Ejemplo.Modelo.Bbdd.Utils.SQLQuerys;
import ud9_Ejemplo.Modelo.Pojos.Alumno;
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
	public Alumno buscarAlumnoPorNombreyApellidos(String nombre, String apellidos) {

		Alumno ret = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null; // enviar comandos SQL a la BBDD
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			preparedStatement = connection.prepareStatement(SQLQuerys.SELECT_ALUMNO_POR_NOMBRE_Y_APELLIDOS);
			//Enlaza cada ? de SQLQuerys con los parametros que se pasan
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, apellidos);
			resultSet = preparedStatement.executeQuery();
/*Se comprueba si hay un resultado en el resultSet y se crea un objeto Alumno 
 * al que se le pasan los atributos del resultSet
 */
			if (resultSet.next()) {
				ret = new Alumno();
				ret.setDni(resultSet.getString("dni"));
				ret.setNombre(resultSet.getString("nombre"));
				ret.setApellidos(resultSet.getString("apellidos"));
				ret.setGrupo(resultSet.getString("grupo"));
				//ret.setNota(resultSet.getInt("nota"));
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
		return ret;
	}

		/**
		 * Inserta un alumno en BBDD
		 * 
		 * @param alumno
		 */
		public void insertarAlumno(Alumno alumno) {

			Connection connection = null;
			Statement statement = null;

			try {
				Class.forName(DBUtils.DRIVER);
				connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				statement = connection.createStatement();

				String sql = SQLQuerys.INSERT_NEW_ALUMNO + alumno.getDni() + SQLQuerys.SEPARATOR + alumno.getNombre()
						+ SQLQuerys.SEPARATOR + alumno.getApellidos() + SQLQuerys.SEPARATOR + alumno.getGrupo() + SQLQuerys.END_BLOCK;

				statement.executeUpdate(sql);

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

		
		/**
		 * Actualiza el grupo de un alumno
		 * 
		 * @param alumno
		 * @param grupo
		 */
		public void actualizarMediaAlumno(Alumno alumno, int grupo) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				Class.forName(DBUtils.DRIVER);
				connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

				String sql = SQLQuerys.UPDATE_MEDIA_ALUMNO_BY_DNI;
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, grupo);
				preparedStatement.setString(2, alumno.getDni());

				preparedStatement.executeUpdate();

			} catch (SQLException sqle) {
				System.out.println("Error con la BBDD - " + sqle.getMessage());
			} catch (Exception e) {
				System.out.println("Error generico - " + e.getMessage());
			} finally {
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

	


}
