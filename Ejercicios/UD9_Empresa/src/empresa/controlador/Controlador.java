package empresa.controlador;

import java.sql.*;
import java.util.ArrayList;

import empresa.Modelo.BBDD.gestor.Gestor_Dep;
import empresa.Modelo.BBDD.gestor.Gestor_Emp;
import empresa.Modelo.BBDD.utiles.DBUtils;
import empresa.Modelo.BBDD.utiles.SQLQuerys;
import empresa.Modelo.POO.Departamento;
import empresa.Modelo.POO.Empleado;

public class Controlador {

	Gestor_Dep gestorDep = new Gestor_Dep();
	Gestor_Emp gestorEmp = new Gestor_Emp();
	
//DEPARTAMENTO ------------------------------------------------------------------------------------------
	public ArrayList<Departamento> mostrarTodosDepartamentos(){
		ArrayList <Departamento> departamentos = null;
		departamentos = gestorDep.mostrarTodosDepartamentos();
		
	return	departamentos ;
	}
	
	
//EMPLEADO ------------------------------------------------------------------------------------------
	
	public ArrayList<Empleado> mostrarTodosEmpleadosDep10(int numDep){
		ArrayList <Empleado> empleados = null;
		
		empleados = gestorEmp.mostrarTodosEmpleadosDep10(numDep);
		
	return	empleados ;
	}
	
	public Empleado mostrarEmpleadoMaxSalario(){
		Empleado empleado = new Empleado();
		
		empleado = gestorEmp.mostrarEmpleadoMaxSalario();
	 return empleado ;
	 }
	
	
	
}
