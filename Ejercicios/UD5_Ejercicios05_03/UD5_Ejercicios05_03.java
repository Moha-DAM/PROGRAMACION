package UD5_Ejercicios05_03;

import java.util.Scanner;

public class UD5_Ejercicios05_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_ESTUDIANTES = 5;
        final int NUM_MATERIAS = 3;
        String[] nombres = new String[NUM_ESTUDIANTES];
        String[] apellidos = new String[NUM_ESTUDIANTES];
        double[][] notas = new double[NUM_ESTUDIANTES][NUM_MATERIAS];
        String[] materias = { "Redes", "Bases de datos", "Programación" };

        // Leer datos
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("----- Estudiante " + (i+1) + " -----");
            System.out.print("Nombre: ");
            nombres[i] = sc.next();
            System.out.print("Apellido: ");
            apellidos[i] = sc.next();
            for (int j = 0; j < NUM_MATERIAS; j++) {
                System.out.print("Nota de " + materias[j] + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n*** RESULTADOS POR ALUMNO ***");
   
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("\nAlumno: " + nombres[i] + " " + apellidos[i]);
            double suma = 0;
            int suspensos = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            int idxMax = -1, idxMin = -1;

            for (int j = 0; j < NUM_MATERIAS; j++) {
                double nota = notas[i][j];
                suma += nota;
                if (nota < 5) {
                    suspensos++;
                }
                if (nota > max) {
                    max = nota;
                    idxMax = j;
                }
                if (nota < min) {
                    min = nota;
                    idxMin = j;
                }
            }
            double media = suma / NUM_MATERIAS;
            System.out.printf("Media: %.2f\n", media);

            if (suspensos > 0) {
                System.out.print("Suspensos en: ");
                for (int j = 0; j < NUM_MATERIAS; j++) {
                    if (notas[i][j] < 5) {
                        System.out.print(materias[j] + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("No tiene suspensos.");
            }

            System.out.println("Nota más alta: " + max + " en " + materias[idxMax]);
            System.out.println("Nota más baja: " + min + " en " + materias[idxMin]);
        }

        System.out.println("\n*** RESULTADOS POR MATERIA ***");
     
        for (int j = 0; j < NUM_MATERIAS; j++) {
            double suma = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            int idxMax = -1, idxMin = -1;
            int suspensos = 0;

            for (int i = 0; i < NUM_ESTUDIANTES; i++) {
                double nota = notas[i][j];
                suma += nota;
                if (nota > max) {
                    max = nota;
                    idxMax = i;
                }
                if (nota < min) {
                    min = nota;
                    idxMin = i;
                }
                if (nota < 5) {
                    suspensos++;
                }
            }
            double media = suma / NUM_ESTUDIANTES;
            System.out.println("\nMateria: " + materias[j]);
            System.out.printf("Media de clase: %.2f\n", media);
            System.out.println("Nota más alta: " + max + " obtenida por " + nombres[idxMax] + " " + apellidos[idxMax]);
            System.out.println("Nota más baja: " + min + " obtenida por " + nombres[idxMin] + " " + apellidos[idxMin]);
            System.out.println("Número de suspensos: " + suspensos);
        }

        System.out.println("\n*** RESULTADOS GENERALES ***");

        double sumaTotal = 0;
        double maxG = Double.MIN_VALUE;
        double minG = Double.MAX_VALUE;
        int idxMaxEst = -1, idxMaxMat = -1;
        int idxMinEst = -1, idxMinMat = -1;
        int[] suspensosPorAlumno = new int[NUM_ESTUDIANTES];
        int[] suspensosPorMateria = new int[NUM_MATERIAS];

        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            for (int j = 0; j < NUM_MATERIAS; j++) {
                double nota = notas[i][j];
                sumaTotal += nota;
                if (nota > maxG) {
                    maxG = nota;
                    idxMaxEst = i;
                    idxMaxMat = j;
                }
                if (nota < minG) {
                    minG = nota;
                    idxMinEst = i;
                    idxMinMat = j;
                }
                if (nota < 5) {
                    suspensosPorAlumno[i]++;
                    suspensosPorMateria[j]++;
                }
            }
        }

        double mediaGlobal = sumaTotal / (NUM_ESTUDIANTES * NUM_MATERIAS);
        System.out.printf("Media global de todas las notas: %.2f\n", mediaGlobal);
        System.out.println("Nota más alta global: " + maxG + " — Alumno: " 
            + nombres[idxMaxEst] + " " + apellidos[idxMaxEst] + ", Materia: " + materias[idxMaxMat]);
        System.out.println("Nota más baja global: " + minG + " — Alumno: " 
            + nombres[idxMinEst] + " " + apellidos[idxMinEst] + ", Materia: " + materias[idxMinMat]);

  
        int mayorSuspensos = -1;
        int idxAlumnoMas = -1;
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            if (suspensosPorAlumno[i] > mayorSuspensos) {
                mayorSuspensos = suspensosPorAlumno[i];
                idxAlumnoMas = i;
            }
        }
        if (mayorSuspensos > 0) {
            System.out.println("Alumno con más suspensos: " + nombres[idxAlumnoMas] + " " + apellidos[idxAlumnoMas]
                + " — " + mayorSuspensos + " suspensos.");
        } else {
            System.out.println("No hay suspensos en ningún alumno.");
        }

        int mayorSuspensosMat = -1;
        int idxMatMas = -1;
        for (int j = 0; j < NUM_MATERIAS; j++) {
            if (suspensosPorMateria[j] > mayorSuspensosMat) {
                mayorSuspensosMat = suspensosPorMateria[j];
                idxMatMas = j;
            }
        }
        if (mayorSuspensosMat > 0) {
            System.out.println("Materia con más suspensos: " + materias[idxMatMas]
                + " — " + mayorSuspensosMat + " suspensos.");
        } else {
            System.out.println("No hay suspensos en ninguna materia.");
        }

        sc.close();
    }
}
