package UD2_Ejercicios02_07;
import java.util.Scanner;
public class Ejercicio02_07 {
	
	//Declaracion Variables; ----------------------------------------------------------------------------------------------
		public static Scanner teclado = new Scanner(System.in); 
		public static long tis = 0 ;
		public static String apellido = null , fecha = null, servicio = null , contacto= null ;
		public static int opcionPrin=0, opcionSer=0, opcionTipo=0 , numCita;
	
	// ------------Main----------------------------------------------------------------------------------------
		public static void main(String[] args) {
			tis = PedirTis();
			apellido = PedirApellido();
			fecha = PedirFecha();
			
		do {
			menuPrincipal();
			opcionPrin = opcionMenuPrincipal();
		
			switch (opcionPrin) {
			case 1: System.out.print("Inserta el numero de cita :");
					numCita =teclado.nextInt();
					System.out.println("La Cita Con Numero "+numCita+ " Anulada con Exito !! ");
				break;
			case 2: 
				   menuServicio() ;
				   opcionSer = opcionMenuServicio();
				   
				   switch (opcionSer) {				
				   case 1: servicio = "Enfermero/a";   
						break;
				   case 2: servicio = "Medico";
						break;
				   case 3: System.out.println("Volver al inicio");
						break;
				   }
				   
				   if(opcionSer!=3) {
					   menuTipoContacto() ;
					   opcionTipo = opcionMenuTipoContacto();								   
					   
					   switch(opcionTipo) {
				   		case 1:	 contacto = "Presencial" ;
				   				 confirmacionCita();
				   			 break;
				   		case 2:  contacto = "Telefono" ;
				   				 confirmacionCita();
				   			 break;
				   		case 3: System.out.println("Volver al inicio");
				   			 break;
					   }
				   } 
			break;   
		  } 
			
		}while((opcionPrin==2) && ( (opcionSer==3)||(opcionTipo==3) ) );
		
	teclado.close();	
	}	
		
	//Funcciones : -------------------------------------------------------------------------------------------------------
	public static long PedirTis() {
		long  contador ;
		do {
			contador = 0;
			try {
				System.out.print("Inserta el TIS : ");
				tis = teclado.nextLong();
				teclado.nextLine();
				
			//comprobar numero degitos 12   ----------------------------------
		        long temp = tis;
		        while (temp > 0) {
		            temp = temp / 10;
		            contador++;
		        }

		        if (contador == 12) {
		            System.out.println("Numero valido");
		        } else {
		            System.out.println("El numero NO tiene 12 digitos");
		        }
            //-------------------------------------------------------------------
				if(tis<0) {
					System.out.println("Numero no Valido! Inserta un numero positivo! ");
				}
				
			}catch(Exception e) {
				System.out.println("Error! Inserta un numero ! ");
				teclado.nextLine();
				tis = -1 ;
			}
			
		}while(tis<0 || contador!=12);
		
	return tis ;	
	}
	
	public static String PedirApellido() {
		System.out.print("Inserta el primer apellido : ");
		String apellido = teclado.next().trim();
	return apellido ;	
	}
		
	public static String PedirFecha() {
		System.out.print("Inserta la fecha : ");
		String fecha = teclado.next().trim();
	return fecha ;
	}
	
	public static void menuPrincipal() {
		System.out.println("------------------ ");
		System.out.println("--< Cita >--");
		System.out.println("------------------ ");
		System.out.println("1. Anula una cita ");
		System.out.println("2. Concierta una cita ");
		System.out.println(" ");
	}
	
	public static void menuServicio() {	
		System.out.println("------------------ ");
		System.out.println("1. Cita con enfermero/a ");
		System.out.println("2. Cita con medico ");
		System.out.println("3. Volver al inicio ");
		System.out.println(" ");
	}
	
	public static void menuTipoContacto() {
		System.out.println("------------------ ");
		System.out.println("1. Presencial ");
		System.out.println("2. Telefono ");
		System.out.println("3. Volver al inicio ");
		System.out.println(" ");
	}
	
	public static int opcionMenuPrincipal() {
		int opcion = 0 ;	
		do {
			try {
				System.out.print("Elige servicio : ");
				opcion = teclado.nextInt();
				teclado.nextLine();

				if((opcion<1) || (opcion>2)) {
					System.out.println("Numero no Valido! Inserta un numero entre 1 y 2 ");	
				}
			}catch(Exception e) {
				System.out.println("Error! Inserta un numero ! ");
				teclado.nextLine();
				opcion = -1 ;
			}
			
		}while((opcion<1) || (opcion>2));

		return opcion ;
	}
	
	public static int opcionMenuServicio() {
		int opcion = 0 ;	
		do {
			try {
				System.out.print("Elige servicio : ");
				opcion = teclado.nextInt();
				teclado.nextLine();

				if((opcion<1) || (opcion>3)) {
					System.out.println("Numero no Valido! Inserta un numero entre 1 y 3 ");	
				}
			}catch(Exception e) {
				System.out.println("Error! Inserta un numero ! ");
				teclado.nextLine();
				opcion = -1 ;
			}
			
		}while((opcion<1) || (opcion>3));

		return opcion ;
	}
	
	public static int opcionMenuTipoContacto() {
		int opcion = 0 ;		
		do {
			try {
				System.out.print("Indica tipo de contacto   : ");
				opcion = teclado.nextInt();
				teclado.nextLine();
				
				if((opcion<1) || (opcion>3)) {
					System.out.println("Numero no Valido! Inserta un numero entre 1 y 3 ");	
				}
			}catch(Exception e) {
				System.out.println("Error! Inserta un numero ! ");
				teclado.nextLine();
				opcion = -1 ;
			}
			
		}while((opcion<1) || (opcion>3));

		return opcion ;
	}
	
	public static void confirmacionCita(){
		System.out.println("Ha concertado usted una cita con su "+servicio+" de manera "+contacto+" con los datos: ");
		System.out.println("TIS: "+tis);
		System.out.println("Apellido: "+apellido);
		System.out.println("Anno de nacimiento: "+fecha);  	
	}
			
		
}
