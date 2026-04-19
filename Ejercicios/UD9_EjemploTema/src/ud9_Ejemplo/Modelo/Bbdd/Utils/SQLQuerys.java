package ud9_Ejemplo.Modelo.Bbdd.Utils;

/**
 * Esta clase contiene las sentencias SQL del proyecto
 */
public class SQLQuerys {

	// SELECTS

	public static final String SELECT_ALUMNO_POR_NOMBRE_Y_APELLIDOS = "SELECT * FROM `alumnos` WHERE `Nombre` = ? and `Apellidos`= ?";

	public static final String SELECT_TODOS_ALUMNOS = "select * from alumnos";
	
	public static final String SELECT_TODOS_NOTAS_BY_ID_ALUMNO = "SELECT * FROM `calificaciones` WHERE `Dni` = ?";

	// INSERTS

	public static final String INSERT_NEW_ALUMNO = "insert into alumnos (dni, nombre, apellidos, grupo) VALUES ('";

	public static final String INSERT_NEW_NOTA = "insert into calificaciones (dni, CodAsignatura, nota) VALUES ('";

	public static final String END_BLOCK = "')";
	public static final String SEPARATOR = "', '";

	// UPDATES 
	
	public static final String UPDATE_MEDIA_ALUMNO_BY_DNI = "update alumnos set grupo = ? where dni = ?";
	
	// DELETES

	public static final String DELETE_ALL_ALUMNOS = "delete from alumnos";
	public static final String DELETE_ALL_NOTAS = "delete from calificaciones";
}