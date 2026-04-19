package empresa.Modelo.BBDD.utiles;

/**
 * Esta clase contiene las sentencias SQL del proyecto
 */
public class SQLQuerys {

	// SELECTS
	public static final String SELECT_TODOS_DEPARTAMENTOS = "SELECT * FROM departamentos" ;
	public static final String SELECT_Apellido_Oficio_Salario_POR_NumDEp = 
							"SELECT apellido, oficio, salario FROM empleados WHERE  dept_no = ? ";
	public static final String SELECT_Apellido_Salario_Departamento_POR_MAX_SALARIO =
							"SELECT apellido, salario, dept_no  FROM empleados WHERE  salario = (SELECT max(salario) FROM empleados)";

	// INSERTS
	


	// UPDATES 
	
	
	// DELETES
	
	
}
