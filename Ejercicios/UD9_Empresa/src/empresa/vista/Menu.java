package empresa.vista;

import java.util.ArrayList;
import java.util.Scanner;

import empresa.Modelo.POO.Departamento;
import empresa.Modelo.POO.Empleado;
import empresa.controlador.Controlador;

public class Menu {
	
	private Scanner teclado = null;
	private Controlador controlador = null ;
	
	public Menu() {
		teclado = new Scanner(System.in);
		controlador = new Controlador ();
	}
	
	
	public void pintarMenu() {
		System.out.println("");
		System.out.println("--Menu Principal--");
		System.out.println("0.Salir");
		System.out.println("1.Mostrar todos los Departamentos");
		System.out.println("2.Mostrar los empleados del departamento");
		System.out.println("3.Mostrar Empleado con el máximo salario");
		System.out.println("");
	}
	
	public int opcionMenu() {
		int ret = 0 ;
		do {
			try {
				pintarMenu() ;
				System.out.print("Dame una opcion : ");
				ret =teclado.nextInt();
				teclado.nextLine();
					if ( (ret<0) || (ret>3) ) {
						System.out.println("Ojo! debe introducir un numero entre 0 y 3 ");
					}
			}catch (Exception e) {
				System.out.println("ERROR! no es un numero ");
				teclado.nextLine();
				ret = -1 ;
			}	
		}while( (ret<0) || (ret>3) ) ;	
	return ret ;	
	}
	
	public void ejecutarGestorEmpresa() {
		int opcion = 0 ;
		do{
			opcion = opcionMenu() ;
			switch (opcion) {
			case 0 : System.out.println("ADIOS !! ");
				break ;
			case 1 : mostrarTodosDepartamentos();
				break ;
			case 2 : int numDep = pedirNumDep() ;
					mostrarTodosEmpleadosDep10(numDep) ;
				break ;
			case 3 : mostrarEmpleadoMaxSalario();
				break ;
			}	
		}while(opcion!=0);
	}
	
	public void mostrarTodosDepartamentos() {
		ArrayList <Departamento> departamentos = null;
		departamentos = controlador.mostrarTodosDepartamentos();
		
		if (departamentos != null) {
			for(Departamento departamento : departamentos ) {
				System.out.println(departamento);
			}
		}else {
			System.out.println("NO hay ningun departamento!!");
		}
		
	}
	
	public void  mostrarTodosEmpleadosDep10(int numDep){
		ArrayList <Empleado> empleados = null;
		empleados = controlador.mostrarTodosEmpleadosDep10(numDep);
		
		if (empleados != null) {
			System.out.println(" Apellido     Oficio    Salario ");
			for(Empleado empleado : empleados ) {
				System.out.printf("%10s   %10s  %.2f \n",     //cadenas alineada a 10 y 10 espacios
						empleado.getApellido(),
						empleado.getOficio(),
						empleado.getSalario()
						);			
			}
		}else {
			System.out.println("NO hay ningun Empleado !!");
		}
		
	}
	
	public int pedirNumDep() {
		int numDep = 0 ;
		System.out.print("Dame el Numero Departamento : ");
		numDep = teclado.nextInt();
		
	return numDep;	
	}
	
	
	public void mostrarEmpleadoMaxSalario(){
		Empleado empleado = new Empleado();
		empleado = controlador.mostrarEmpleadoMaxSalario();
	 
		System.out.println("     Apellido   Salario    numDepart ");
		
			System.out.printf("%10s   %10s  %10s \n",     //cadenas alineada a 10 y 10 espacios
					empleado.getApellido(),
					empleado.getSalario(),
					empleado.getDepartamento().getNum()
					);			
	}
	
}
