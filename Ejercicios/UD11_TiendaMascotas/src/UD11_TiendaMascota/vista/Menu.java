package UD11_TiendaMascota.vista;

import java.util.ArrayList;
import java.util.Scanner;

import UD11_TiendaMascota.controlador.Controlador;
import UD11_TiendaMascota.modelo.pojos.Gato;
import UD11_TiendaMascota.modelo.pojos.Perro;
import UD11_TiendaMascota.modelo.pojos.Tortuga;

public class Menu {

    private Controlador controlador = new Controlador();
    private Scanner scanner = new Scanner(System.in);

    
    
    public void mostrarMenu() {
        int opcion;

        do {
        	opcion = menuOpcion() ;

            switch (opcion) {
                case 1:
                    visualizarTodasLasMascotas();
                    break;
                case 2:
                    visualizarMascotasPorTipo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    private int menuOpcion() {
    	int opcion = -1 ;
    	
    	try { 
    		System.out.println("\n=================================");
	        System.out.println("     MENU GESTION MASCOTAS");
	        System.out.println("=================================");
	        System.out.println("1. Mostrar todas las mascotas");
	        System.out.println("2. Mostrar mascotas por tipo");
	        System.out.println("0. Salir");
	        System.out.print("Elige una opcion: ");

	        opcion = scanner.nextInt();
	        scanner.nextLine(); // limpiar buffer
    		
    	}catch(Exception e) {
    		 System.out.println("ERROR !!! No se admite Las letras ");
    		 scanner.nextLine(); // limpiar buffer
    	}
    	
     return opcion ;	
    }
    
    
    private void visualizarTodasLasMascotas() {
        System.out.println("\n--- TODAS LAS MASCOTAS ---");
        visualizarListaGatos();
        visualizarListaPerros();
        visualizarListaTortugas();
    }

    private void visualizarMascotasPorTipo() {
        System.out.print("\n¿Que tipo quieres ver? (gato/perro/tortuga): ");
        String tipo = scanner.nextLine().toLowerCase();

        switch (tipo) {
            case "gato":
                visualizarListaGatos();
                break;
            case "perro":
                visualizarListaPerros();
                break;
            case "tortuga":
                visualizarListaTortugas();
                break;
            default:
                System.out.println("Tipo no válido. Las opciones son: gato, perro, tortuga.");
        }
    }

    private void visualizarListaGatos() {
        ArrayList<Gato> gatos = controlador.obtenerListaGatos();
        System.out.println("\n--- LISTA DE GATOS ---");
        if (gatos.isEmpty()) {
            System.out.println("No hay gatos en la base de datos.");
        } else {
            for (Gato g : gatos) {
                System.out.println(g);
            }
        }
    }

    private void visualizarListaPerros() {
        ArrayList<Perro> perros = controlador.obtenerListaPerros();
        System.out.println("\n--- LISTA DE PERROS ---");
        if (perros.isEmpty()) {
            System.out.println("No hay perros en la base de datos.");
        } else {
            for (Perro p : perros) {
                System.out.println(p);
            }
        }
    }

    private void visualizarListaTortugas() {
        ArrayList<Tortuga> tortugas = controlador.obtenerListaTortugas();
        System.out.println("\n--- LISTA DE TORTUGAS ---");
        if (tortugas.isEmpty()) {
            System.out.println("No hay tortugas en la base de datos.");
        } else {
            for (Tortuga t : tortugas) {
                System.out.println(t);
            }
        }
    }
}