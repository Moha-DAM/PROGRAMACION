package UD6_OOP.Ejer03_Coche;

import java.util.Scanner;

public class CarreraCoches {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche = new Coche();
        int velocidad = 0 ;
		System.out.println("Velocidad Inicial : " +coche.getVelocidad());
		
		do {
			System.out.print("introducir la variacion de  velocidad desea :  ");
			velocidad = teclado.nextInt();
			
			if(velocidad > 0) {
				coche.acelera(velocidad);
				System.out.println("Velocidad Actual : " +coche.getVelocidad());
			}else if(velocidad < 0) {
				coche.frena(-velocidad);
				
				 if (coche.getVelocidad()<0 ) {
					   coche.setVelocidad(0);
					   System.out.println("Velocidad Actual : " +coche.getVelocidad());
				   }else {
					   System.out.println("Velocidad Actual : " +coche.getVelocidad());
				   }
			}else {
				System.out.println("Fin.... ");
			}
		
		}while(velocidad != 0);
	}

}
