package UD2_Ejercicios02_05;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int nota , numNotas = 0, numNotasMayor = 0 , numNotasMenor = 0;
		
		while(numNotas<10) {
			System.out.print("Dame una nota  : ");
			nota= teclado.nextInt();
			
				if(nota>=7) {
					numNotasMayor++;
				}else {
					numNotasMenor++;
				}
			numNotas++;	
		}
		
	System.out.println("El numero de Alumnos que tienen notas mayores o iguales a 7  : "+numNotasMayor);
	System.out.println("El numero de Alumnos que tienen notas menores a 7  : "+numNotasMenor);
	
	teclado.close();
	}

}
