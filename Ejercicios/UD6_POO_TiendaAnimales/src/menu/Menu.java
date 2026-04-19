package menu;


import java.util.Scanner;

import animales.Gato;
import animales.Perro;
import animales.Tortuga;

public class Menu {

	private Scanner teclado = null;
	
	private Gato [] gatos = null;
	private Perro [] perros = null;
	private Tortuga [] tortugas = null;
	private int siguienteId = 1;
	private int lengthArrayMascota = 3 ;
	
	public Menu() {
		teclado = new Scanner(System.in);
		
		gatos = new Gato [lengthArrayMascota];
		perros = new Perro [lengthArrayMascota];
		tortugas = new Tortuga [lengthArrayMascota];
		
		Gato gato = new Gato( pedirId() , "loli" , "africa", "blanco");
		gatos[0]= gato ;
		System.out.println(gato.toString());
		
		
		Perro perro = new Perro( pedirId() , "blue" , "bitbull", true);
		perros[0]= perro ;
		System.out.println(perro.toString());
		
		
		Tortuga tortuga = new Tortuga( pedirId() , "mirama" , true);
		tortugas[0]= tortuga ;
		System.out.println(tortuga.toString());
	
	}	
	
	public int pedirId() {	
		return siguienteId++ ;
	}
	
	public void pintarMenu() {
		
		System.out.println("");
		System.out.println("--Menu Principal--");
		System.out.println("0.Salir");
		System.out.println("1.Añadir una Mascota");
		System.out.println("2.Mostrar todas las Mascotas");
		System.out.println("3.Mostrar todas las Mascotas del Tipo");
		System.out.println("4.Mostrar la mascota con Id");
		System.out.println("5.Mostrar la mascota con Nombre");
		System.out.println("6.Modificar una mascota");
		System.out.println("7.Borrar una mascota");
		System.out.println("");	
	}
	
	public int opcionMenu() {
		int ret = 0;
		do { 
			try {
				pintarMenu();
				System.out.print("Dame una Opcion : ");
				ret = teclado.nextInt();
				teclado.nextLine();
					if ((ret<0) || (ret>7)) {
					System.out.println("Opcion fuera del rango permitido (0-7), Inténtalo de nuevo. ");
					}
			}catch(Exception e) {
				System.out.println("ERROR! Opcion NO valida ! ");
				teclado.nextLine();
				ret = -1 ;
			}	
		}while((ret<0) || (ret>7) );
		
	return ret ;	
	}
	
	public void iniciarMenu() {
		int opcion = 0 ;
		do {
			opcion = opcionMenu();
			switch(opcion) {
				case 0 : System.out.println("Adios ! ");
					break ; 
				case 1 :  	anadirMascota();	 
					break ; 
				case 2 :  	mostrarMascotas();
					break ; 
				case 3 : 	mostrarTipoMascota();
					break ; 
				case 4 : 	mostrarMascotaConId(pedirIdMascota());
					break ; 
				case 5 : 	mostrarMascotaConNombre(pedirNombreMascota());
					break ; 
				case 6 : 	modificarMascota();
					break ; 
				case 7 : 	borrarMascota();
					break ; 
			}
			
		}while(opcion!=0);
	}
	public int pintarMenuTipoMascota() {
		int ret = 0 ;
		do {
			try {
				System.out.println("");
				System.out.println("--Tipo Mascota--");
				System.out.println("0.Volver al Menu Principal");
				System.out.println("1.Gatos");
				System.out.println("2.Perros");
				System.out.println("3.Tortugas");
				System.out.println("");	
				
				System.out.print("Elegir una Opcion :");
				ret = teclado.nextInt();
				teclado.nextLine();
					if ((ret<0) || (ret>3)) {
						System.out.println("Opcion fuera del rango permitido (0-3),Inténtalo de nuevo. ");
						}
			}catch(Exception e) {
				System.out.println("ERROR! Opcion NO valida ! ");
				teclado.nextLine();
				ret = -1 ;
			}
			
		}while(ret<0 || ret>3) ;
		
	return ret ;
	}
	
	public void anadirMascota() {
		int opcion = 0 ;
		do {
			opcion = pintarMenuTipoMascota();
			
				switch(opcion) {
				case 0 : System.out.println("0.Volver al Menu Principal");
					break ;
				case 1 : anadirGato();
					break ;
				case 2 : anadirPerro() ;
					break ;
				case 3 : anadirTortuga();
					break ;
				}
		}while(opcion!=0);
		
	}
	
	public void anadirGato() {
        boolean hayespacio = false ;
		for(int i = 0 ; i<gatos.length ; i++) {
			if(gatos[i]==null) {
				gatos[i]=pedirDatosGato(pedirId());
				System.out.println("El Gato anadido correctamente  ");
				hayespacio = true;
				break;
			}	
		}
		if(!hayespacio) {
			System.out.println("No hay espacio!!  ");
		}
	}
	
	public void anadirPerro() {
        boolean hayespacio = false ;
		for(int i = 0 ; i<perros.length ; i++) {
			if(perros[i]==null) {
				perros[i]=pedirDatosPerro(pedirId());
				System.out.println("El Perro anadido correctamente  ");
				hayespacio = true;
				break;
			}	
		}
		if(!hayespacio) {
			System.out.println("No hay espacio!!  ");
		}
	}
	
	public void anadirTortuga() {
        boolean hayespacio = false ;
		for(int i = 0 ; i<tortugas.length ; i++) {
			if(tortugas[i]==null) {
				tortugas[i]=pedirDatosTortuga(pedirId());
				System.out.println("La Tortuga anadida correctamente  ");
				hayespacio = true;
				break;
			}	
		}
		if(!hayespacio) {
			System.out.println("No hay espacio!!  ");
		}
	}
	public void mostrarTipoMascota() {
		int opcion = 0 ;
		do {
			opcion = pintarMenuTipoMascota();
			
				switch(opcion) {
				case 0 : System.out.println("0.Volver al Menu Principal");
					break ;
				case 1 : mostrarGatos();
					break ;
				case 2 : mostrarPerros() ;
					break ;
				case 3 : mostrarTortugas();
					break ;
				}
		}while(opcion!=0);
		
	}
	
	public void mostrarMascotas() {
		System.out.println("--<Gatos>-- ");
		mostrarGatos();
		System.out.println("--<Perros>-- ");
		mostrarPerros();
		System.out.println("--<Tortugas>-- ");
		mostrarTortugas();
	}
	
	public void mostrarGatos() {
		int num = 1 ;
		for(int i = 0 ; i<gatos.length ; i++) {
			if(gatos[i]!=null) {
				System.out.println("Nº: "+num+" --> "+gatos[i].toString());
				num++;
			}	
		}
	}
	
	public void mostrarPerros() {
		int num = 1 ;
		for(int i = 0 ; i<perros.length ; i++) {
			if(perros[i]!=null) {
				System.out.println("Nº: "+num+" --> "+perros[i].toString());
				num++;
			}	
		}
	}
	
	public void mostrarTortugas() {
		int num = 1 ;
		for(int i = 0 ; i<tortugas.length ; i++) {
			if(tortugas[i]!=null) {
				System.out.println("Nº: "+num+" --> "+tortugas[i].toString());
				num++;
			}	
		}
	}
	
	public int pedirIdMascota() {
		int ret = 0 ;
		do {
			try {
				System.out.print("Dame el Id de la mascota :");
				ret = teclado.nextInt() ;
				teclado.nextLine();
					if(ret<1) {
						System.out.println("Id No valido !!");
					}
			}catch(Exception e) {
				System.out.println("ERROR! El Id debe estar un numero ");
				teclado.nextLine();
				ret = 0 ;
			}
		}while(ret<1);
		
	return ret ;
	}
	
	public void mostrarMascotaConId(int id) {
		boolean encontrado = false ;
		
		for(int i = 0 ; i<lengthArrayMascota ; i++) {
			if((tortugas[i]!=null) && (tortugas[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+tortugas[i].toString());
				encontrado = true;
				break;
			}	
			if((perros[i]!=null) && (perros[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+perros[i].toString());
				encontrado = true;
				break;
			}	
			if((gatos[i]!=null) && (gatos[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+gatos[i].toString());
				encontrado = true;
				break;
			}	
		}
		if(!encontrado) {
			System.out.println("La Mascota con id "+id+" NO encontrada !!");
		}	
	}
	
	public void mostrarMascotaConNombre(String nombre) {
		boolean encontrado = false ;
		
		for(int i = 0 ; i<lengthArrayMascota ; i++) {
			if((tortugas[i]!=null) && (tortugas[i].getEspecie().equalsIgnoreCase(nombre))){
				System.out.println("Mascota encontrada: "+tortugas[i].toString());
				encontrado = true;
				break;
			}	
			if((perros[i]!=null) && (perros[i].getNombre().equalsIgnoreCase(nombre))){
				System.out.println("Mascota encontrada: "+perros[i].toString());
				encontrado = true;
				break;
			}	
			if((gatos[i]!=null) && (gatos[i].getNombre().equalsIgnoreCase(nombre))){
				System.out.println("Mascota encontrada: "+gatos[i].toString());
				encontrado = true;
				break;
			}	
		}
		if(!encontrado) {
			System.out.println("La Mascota con nombre "+nombre+" NO encontrada !!");
		}	
	}
	
	public void modificarMascota() {
		int id = pedirIdMascota();
		boolean encontrado = false ;
		
		for(int i = 0 ; i<lengthArrayMascota ; i++) {
			if((tortugas[i]!=null) && (tortugas[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+tortugas[i].toString());
				tortugas[i]=pedirDatosTortuga(id);
				encontrado = true;
				break;
			}	
			if((perros[i]!=null) && (perros[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+perros[i].toString());
				perros[i]=pedirDatosPerro(id);
				encontrado = true;
				break;
			}	
			if((gatos[i]!=null) && (gatos[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+gatos[i].toString());
				gatos[i]=pedirDatosGato(id);
				encontrado = true;
				break;
			}	
		}
		if(!encontrado) {
			System.out.println("La Mascota con id "+id+" NO encontrada !!");
		}	
	}
	
	public void borrarMascota() {
		int id = pedirIdMascota();
		boolean encontrado = false ;
		
		for(int i = 0 ; i<lengthArrayMascota ; i++) {
			if((tortugas[i]!=null) && (tortugas[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+tortugas[i].toString());
				tortugas[i]=null;
				System.out.println("Mascota Borrada ");
				encontrado = true;
				break;
			}	
			if((perros[i]!=null) && (perros[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+perros[i].toString());
				perros[i]=null;
				System.out.println("Mascota Borrada ");
				encontrado = true;
				break;
			}	
			if((gatos[i]!=null) && (gatos[i].getId()==id))  {
				System.out.println("Mascota encontrada: "+gatos[i].toString());
				gatos[i]=null;
				System.out.println("Mascota Borrada ");
				encontrado = true;
				break;
			}	
		}
		if(!encontrado) {
			System.out.println("La Mascota con id "+id+" NO encontrada !!");
		}	
	}
	
	public String pedirNombreMascota() {
		String ret = null ;
		System.out.print("Dame el Nombre de la mascota :");
		ret = teclado.nextLine().trim().toLowerCase();

	return ret ;
	}
	
	public Gato pedirDatosGato(int id) {
		Gato ret = new Gato();
	
		String nombre = null;
		String raza = null ;
		String color = null ;
		
		System.out.print("dame el nombre : ");
		nombre = teclado.nextLine().trim() ; 
		System.out.print("dame la raza : ");
		raza = teclado.nextLine().trim(); 
		System.out.print("dame el color : ");
		color = teclado.nextLine().trim(); 
		
		ret.setId(id);
		ret.setNombre(nombre);
		ret.setRaza(raza);
		ret.setColor(color);
			
	return ret ;
	}
	
	public Perro pedirDatosPerro(int id) {
		Perro ret = new Perro();
		
		System.out.print("dame el nombre : ");
		String nombre = teclado.nextLine().trim() ; 
		System.out.print("dame la raza : ");
		String raza = teclado.nextLine().trim() ; 
		System.out.print("Esta vacunado ? (si/no) : ");
		String respuesta = teclado.nextLine().toLowerCase().trim();
		boolean estaVacunado= respuesta.equals("si") ; 
		
		ret.setId(id);
		ret.setNombre(nombre);
		ret.setRaza(raza);
		ret.setEstaVacunado(estaVacunado);
			
	return ret ;
	}
	
	public Tortuga pedirDatosTortuga(int id) {
		Tortuga ret = new Tortuga();
		
		System.out.print("dame la especie : ");
		String especie  = teclado.nextLine().trim() ;  
		System.out.print("Esta de Agua dulce ? (si/no): ");
		String respuesta = teclado.nextLine().toLowerCase().trim();
		boolean deAguaDulce = respuesta.equals("si");
		
		ret.setId(id);
		ret.setEspecie(especie);
		ret.setDeAguaDulce(deAguaDulce);
			
	return ret ;
	}
	
}
