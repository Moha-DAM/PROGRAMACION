package UD2_EjerciciosExtra;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean jugarOtraVez = true;

        while (jugarOtraVez) {
            jugar();
            System.out.print("Quieres jugar otra vez ?(s/n): ");
            String respuesta = teclado.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                jugarOtraVez = false;
            }
        }

        System.out.println("Gracias por jugar!");
        teclado.close();
    }

    public static void jugar() {
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(100) + 1; 
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("** Adivina el numero entre 1 y 100 **");
        while (intentos < 10 && !adivinado) {
            System.out.print("Introduce tu intento: ");
            int intento = teclado.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                adivinado = true;
                System.out.println("Felicidad! Adivinaste el numero en " + intentos + " intentos");
            } else if (intento < numeroSecreto) {
                System.out.println("Mas alto");
            } else {
                System.out.println("Mas bajo");
            }
        }

        if (!adivinado) {
            System.out.println("Se acabaron los intentos! El numero era: " + numeroSecreto);
        }
    }
}
