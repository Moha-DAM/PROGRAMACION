package UD5_Ejercicios05_01;

import java.util.Scanner;

public class Ejercicios05_01 {

	public static Scanner teclado = new Scanner(System.in) ;
	public static int [] numeros = new int [10] ;
	public static int contador = 0 , opcion = 0 ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		do {
			menu();
			
			opcion = menuOpcion() ;
			
			switch (opcion) {
			
			case 1: anadirNumero(numeros) ;
					for(int i = 0 ; i<contador ; i++) {
						System.out.print(numeros[i]+" ");
					}
				break;
			case 2: buscarNumero(numeros) ;
				break;
			case 3: eliminarNumero(numeros)	 ;
				break;
			case 4: System.out.println("Adios! "); ;
				break;
			}
			
		}while(opcion!=4);
		
		
	 teclado.close();
			  
	}

	
//Metodos ----------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param numeros
	 */
	public static void anadirNumero(int [] numeros) {
		int num = 0 ;
		
		if (contador < numeros.length) {
			
				num = pedirNumero() ;
				
				if(buscarPos(num)== -1 ) {
					numeros[contador] = num ;
					contador ++;
					System.out.println("el numero anadido correctamente ");
					
				}else {
					System.out.println("el numero ya esta existe ");
				}	
			
		}else {
			System.out.println("Array esta lleno. NO hay espacio ");
		}	
	}
	
	/**
	 * 
	 * @param numeros
	 */
	public static void buscarNumero(int [] numeros) {
		int num = 0 , pos = 0 ;
		num = pedirNumero() ;
		
		pos = buscarPos(num) ;
		if(pos != -1 ) {
			System.out.println("el numero esta en la posicion : "+ pos);		
		}else {
			System.out.println("el numero NO esta en Array numeros ");	
		}
	}
	
	/**
	 * 
	 * @param numeros
	 */
	public static void eliminarNumero(int [] numeros) {
		int num = 0 , pos = 0 ;
		num = pedirNumero() ;
		
		pos = buscarPos(num) ;
		if(pos == -1 ) {
			System.out.println("el numero NO existe ");	
			
		}
		
		for (int i = pos ; i < contador - 1 ; i++ ) {
             numeros[i]= numeros[i + 1] ;
        }
		
		contador-- ;
		System.out.println("el numero Eliminado correctamente ");
	}
	
	/**
	 * 
	 * @return
	 */
	public static int pedirNumero() {
		int numero=0;
		do {
			try {
				System.out.print("Dame un numero  : ");
				numero= teclado.nextInt();
				teclado.nextLine();
				
				if(numero<0) {
					System.out.println("El Numero es Negativo !!!! ");
				}
			}catch(Exception e) {
				System.out.println("Numero NO valido!! ");
				teclado.nextLine();
				numero = -1 ;
			}
			
		}while(numero<0);
			
		return numero ;
	}
	
	/**
	 * 
	 */
	public static void menu() {
		System.out.println("\n----------Menu---------------");
		System.out.println("1.Introduzca el valor");
		System.out.println("2.Encuentra el valor");
		System.out.println("3.Eliminar el valor");
		System.out.println("4.Salir");
	}
	
	/**
	 * 
	 * @return
	 */
	public static int menuOpcion() {	
		int opcion=0;
		do {
			try {
				System.out.print("\nIntroduce la opcion deseada de 1 a 4 : ");
				opcion= teclado.nextInt();
				teclado.nextLine();
				
				if((opcion<1) ||( opcion>4)) {
					System.out.println("Opcion fuera del rango 1-4 !!!! ");
				}
			
			}catch (Exception e) {
				System.out.println("ERROR!! Opcion NO valida!! ");
				teclado.nextLine();
				opcion = -1 ;		
			}
		}while((opcion<1) ||( opcion>4));
	
	return opcion;
	}
	
	
	/**
	 * 
	 * @param num
	 * @return
	 */
	static int buscarPos(int num) {
		int pos = -1 ;
		
        for (int i = 0; i < contador; i++) {
            if (numeros[i] == num) {
                pos =  i;
                break ;
            }
        }
        return pos;
    }
	
}