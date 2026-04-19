package menu;
import java.util.ArrayList;
import java.util.Scanner;

import animales.Gato;
import animales.Perro;
import animales.Tortuga;

public class Menu {

	private Scanner teclado = null;
	
	private ArrayList <Gato> gatos = null;
	private ArrayList <Perro> perros = null;
	private ArrayList <Tortuga> tortugas = null;
	private int siguienteId = 1;
	
	public Menu() {
		teclado = new Scanner(System.in);
		
		gatos = new ArrayList <Gato>();
		perros = new ArrayList <Perro>();
		tortugas = new ArrayList <Tortuga>();
		
		Gato gato = new Gato( pedirId() , "loli" , "africa", "blanco");
		gatos.add(gato) ;
		System.out.println(gato.toString());
			
		Perro perro = new Perro( pedirId() , "blue" , "bitbull", true);
		perros.add(perro);
		System.out.println(perro.toString());
		
		Tortuga tortuga = new Tortuga( pedirId() , "mirama" , true);
		tortugas.add(tortuga) ;
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
		gatos.add(pedirDatosGato(pedirId()));
		System.out.println("El Gato anadido correctamente  ");
	}
	
	public void anadirPerro() {
		perros.add(pedirDatosPerro(pedirId()));
		System.out.println("El Perro anadido correctamente  ");
	}
	
	public void anadirTortuga() {
		tortugas.add(pedirDatosTortuga(pedirId()));
		System.out.println("La Tortuga anadida correctamente  ");
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
		for(Gato gato : gatos) {
			if(gato!=null) {
				System.out.println("Nº: "+num+" --> "+gato.toString());
				num++;
			}	
		}
	}
	
	public void mostrarPerros() {
		int num = 1 ;
		for(Perro perro : perros) {
			if(perro!=null) {
				System.out.println("Nº: "+num+" --> "+perro.toString());
				num++;
			}	
		}
	}
	
	public void mostrarTortugas() {
		int num = 1 ;
		for(Tortuga tortuga : tortugas) {
			if(tortuga!=null) {
				System.out.println("Nº: "+num+" --> "+tortuga.toString());
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
		
		for(Gato gato : gatos) {
			if((gato!=null) && (gato.getId()==id))  {
				System.out.println("Mascota encontrada: "+gato.toString());
				encontrado = true;
				break;
			}	
		}
		for(Tortuga tortuga : tortugas) {	
			if((tortuga!=null) && (tortuga.getId()==id))  {
				System.out.println("Mascota encontrada: "+tortuga.toString());
				encontrado = true;
				break;
			}
		}
		for(Perro perro : perros) {
			if((perro!=null) && (perro.getId()==id))  {
				System.out.println("Mascota encontrada: "+perro.toString());
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
		
		for(Tortuga tortuga : tortugas) {	
			if((tortuga!=null) && (tortuga.getEspecie().equalsIgnoreCase(nombre))){
				System.out.println("Mascota encontrada: "+tortuga.toString());
				encontrado = true;
				break;
			}
		}
		for(Perro perro : perros) {
			if((perro!=null) && (perro.getNombre().equalsIgnoreCase(nombre))){
				System.out.println("Mascota encontrada: "+perro.toString());
				encontrado = true;
				break;
			}
		}
		for(Gato gato : gatos) {
			if((gato!=null) && (gato.getNombre().equalsIgnoreCase(nombre))){
				System.out.println("Mascota encontrada: "+gato.toString());
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
		
		for(Gato gato : gatos) {
			if((gato!=null) && (gato.getId()==id))  {
				System.out.println("Mascota encontrada: "+gato.toString());
				gatos.remove(gato);
				gatos.add(pedirDatosGato(pedirId()));
				System.out.println("Mascota Modificada ");
				encontrado = true;
				break;
			}	
		}
		for(Tortuga tortuga : tortugas) {	
			if((tortuga!=null) && (tortuga.getId()==id))  {
				System.out.println("Mascota encontrada: "+tortuga.toString());
				tortugas.remove(tortuga);
				tortugas.add(pedirDatosTortuga(pedirId()));
				System.out.println("Mascota Modificada ");
				encontrado = true;
				break;
			}
		}
		for(Perro perro : perros) {
			if((perro!=null) && (perro.getId()==id))  {
				System.out.println("Mascota encontrada: "+perro.toString());
				perros.remove(perro);
				perros.add(pedirDatosPerro(pedirId()));
				System.out.println("Mascota Modificada ");
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
		
		for(Gato gato : gatos) {
			if((gato!=null) && (gato.getId()==id))  {
				System.out.println("Mascota encontrada: "+gato.toString());
				gatos.remove(gato);
				System.out.println("Mascota Borrada ");
				encontrado = true;
				break;
			}	
		}
		for(Tortuga tortuga : tortugas) {	
			if((tortuga!=null) && (tortuga.getId()==id))  {
				System.out.println("Mascota encontrada: "+tortuga.toString());
				tortugas.remove(tortuga);
				System.out.println("Mascota Borrada ");
				encontrado = true;
				break;
			}
		}
		for(Perro perro : perros) {
			if((perro!=null) && (perro.getId()==id))  {
				System.out.println("Mascota encontrada: "+perro.toString());
				perros.remove(perro);
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
