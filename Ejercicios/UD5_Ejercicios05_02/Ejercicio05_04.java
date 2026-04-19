package UD5_Ejercicios05_02;
import java.util.Scanner;
public class Ejercicio05_04 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombres = cargarArrayNombres();
		int [] notas = cargarArrayNotas() ;
		mostrarTodosDatos(nombres, notas );
		double [] datos = calculoDatos(notas);
   
		mostrarEstadisticas(nombres,datos);	
		
		AlumnosNotaMaxMedia(notas,nombres,datos[0]);
	}
/**
 * cargar los nombres de los alumnos en el Array
 * @return
 */
	public static String [] cargarArrayNombres() {
		String [] nombres = new String [10];
		for(int i = 0 ; i <nombres.length ; i++) {
			
			System.out.print("Dame el Nombre del Alumno : ");
			String nombre = teclado.nextLine().trim();
			nombres[i] = nombre ;
		}

	return nombres ;
	}
/**
 * cargar los notas de los alumnos en el Array
 * @return
 */
	public static int [] cargarArrayNotas() {
		int [] notas = new int [10];
		
		for(int i = 0 ; i <notas.length ; i++) {
				int nota = 0 ;
				boolean valido = false ;
			while(valido==false) {
				System.out.print("Dame la Nota del Alumno (0-->10) : ");
				nota = teclado.nextInt();
				teclado.nextLine();
				if (nota>=0 && nota<=10){
					notas[i] = nota ;
					valido = true ;
				}else {
					System.out.println("Nota NO Valida!! ");	
				}
			}
		}

	return notas ;
	}
/**
 * 	mostrar todos los datos de los alumnos
 * @param nombres
 * @param notas
 */
	public static void mostrarTodosDatos(String [] nombres , int [] notas) {
		for(int i = 0 ; i <notas.length ; i++) {
			System.out.println((nombres[i])+" - "+(notas[i]));
		}
	}
/**
 * calcula nota media, nota maxima , nota minima , posicion del alumno con nota minima y maxima
 * @param notas
 * @return
 */
	public static double []  calculoDatos(int [] notas) {
		double [] datos = new double [5];
		double sumaNota = 0 , mediaNota = 0 ;
		int iMaxNota = 0 , iMinNota = 0, 
				MaxNota = Integer.MIN_VALUE , MinNota = Integer.MAX_VALUE ;
		
		for(int i = 0 ; i <notas.length ; i++) {
			sumaNota = sumaNota + notas[i];
		
			if(notas[i]>=MaxNota) {
				MaxNota = notas[i];
				iMaxNota = i;
			}
			if(notas[i]<=MinNota) {
				MinNota = notas[i];
				iMinNota = i ;
			}
		}
		mediaNota = sumaNota/notas.length;
		
		datos[0] = mediaNota ;
		datos[1] = MaxNota ;
		datos[2] = iMaxNota ;
		datos[3] = MinNota ;
		datos[4] = iMinNota ;

	return datos ;
	}
/**
 * 	 * mostrar nota media, nota maxima , nota minima , alumno con nota minima y maxima

 * @param nombres
 * @param datos
 */
	public static void mostrarEstadisticas(String [] nombres , double [] datos) {
		double notaMedia = datos[0];
		int notaMax = (int)datos[1];
		int notaMin = (int)datos[3];
		String AlumNotaMax = nombres[(int)datos[2]];
		String AlumNotaMin = nombres[(int)datos[4]];
		
		System.out.printf("la nota media de la clase : %.2f%n",notaMedia);
		System.out.println("la nota máxima de los alumnos : "+notaMax);
		System.out.println("la nota máxima es de alumno : "+AlumNotaMax);
		System.out.println("la nota mínima de los alumnos : "+notaMin);
		System.out.println("la nota mínima es de alumno : "+AlumNotaMin);	
	}
/**
 * mostrar  los alumnos cuya nota es mayor que la media
 * @param notas
 * @param nombres
 */
	public static void AlumnosNotaMaxMedia(int [] notas , String [] nombres ,double mediaNota) {
		
		System.out.println("Los alumnos cuya nota es mayor que la media son : ");

		for(int i = 0 ; i <notas.length ; i++) {
			if(notas[i]>mediaNota) {
				System.out.println("* "+nombres[i]);
			}
		}	
	}
	
}
