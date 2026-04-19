package UD9_GestorAlumnos.Modelo.Bbdd.Utils;

/**
 * Esta clase contiene las sentencias SQL del proyecto
 */
public class SQLQuerys {

	// SELECTS
	public static final String SELECT_ALUMNO_POR_NOMBRE_Y_APELLIDOS = "SELECT * FROM alumnos WHERE nombre = ? and apellidos = ?";
	public static final String SELECT_TODOS_ALUMNOS_POR_NOMBRE = "SELECT * FROM alumnos WHERE nombre = ?";
	public static final String SELECT_TODOS_ALUMNOS = "select * from alumnos";
	public static final String SELECT_TODOS_NOTAS_ALUMNOS = "SELECT * FROM calificaciones";
	public static final String SELECT_TODOS_NOTAS_BY_ID_ALUMNO = "SELECT * FROM calificaciones WHERE dni = ?";

	// INSERTS
	public static final String INSERT_NEW_ALUMNO = "INSERT INTO alumnos (dni, nombre, apellidos, grupo) VALUES (?, ?, ?, ?)";
	public static final String INSERT_NEW_NOTA = "INSERT INTO calificaciones (dni, CodAsignatura, nota) VALUES (?, ?, ?)";
	


	// UPDATES 
	public static final String UPDATE_DATOS_ALUMNO_BY_DNI = "update alumnos set dni = ?, nombre = ?, apellidos = ?, grupo = ? where dni = ?";
	public static final String UPDATE_DNI_ALUMNO_BY_DNI = "update alumnos set dni = ? where dni = ?";
	public static final String UPDATE_NOMBRE_ALUMNO_BY_DNI = "update alumnos set nombre = ? where dni = ?";
	public static final String UPDATE_APELLIDOS_ALUMNO_BY_DNI = "update alumnos set apellidos = ? where dni = ?";
	public static final String UPDATE_GRUPO_ALUMNO_BY_DNI = "update alumnos set grupo = ? where dni = ?";
	
	// DELETES
	public static final String DELETE_ALUMNO_BY_DNI = "DELETE FROM alumnos WHERE dni = ?";
	public static final String DELETE_ALL_ALUMNOS = "DELETE FROM  alumnos";
	public static final String DELETE_ALL_NOTAS = "DELETE FROM  calificaciones";
	
}
