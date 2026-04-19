package UD11_TiendaMascota.vista;

import java.util.ArrayList;
import java.util.Scanner;

import UD11_TiendaMascota.controlador.Controlador;
import UD11_TiendaMascota.modelo.pojos.Cocodrilo;
import UD11_TiendaMascota.modelo.pojos.Gato;
import UD11_TiendaMascota.modelo.pojos.Perro;
import UD11_TiendaMascota.modelo.pojos.Tortuga;

public class Menu {

    private Controlador controlador = new Controlador();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;

        do {
            opcion = menuOpcion();

            switch (opcion) {
                case 1:
                    visualizarTodasLasMascotas();
                    break;
                case 2:
                    visualizarMascotasPorTipo();
                    break;
                case 3:
                    visualizarMascotasPorTipoYid();
                    break;
                case 4:
                    añadirMascota();
                    break;
                case 5:
                    borrarMascota();
                    break;
                case 6:
                    modificarMascota();
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
        int opcion = -1;

        try {
            System.out.println("\n=================================");
            System.out.println("     MENU GESTION MASCOTAS");
            System.out.println("=================================");
            System.out.println("1. Mostrar todas las mascotas");
            System.out.println("2. Mostrar mascotas por tipo");
            System.out.println("3. Mostrar mascotas por tipo e ID");
            System.out.println("4. Añadir una mascota");
            System.out.println("5. Borrar una mascota");
            System.out.println("6. Modificar una mascota");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

        } catch (Exception e) {
            System.out.println("ERROR !!! No se admiten letras");
            scanner.nextLine();
        }

        return opcion;
    }

    // ========== VISUALIZAR ==========

    private void visualizarTodasLasMascotas() {
        System.out.println("\n--- TODAS LAS MASCOTAS ---");
        visualizarListaGatos();
        visualizarListaPerros();
        visualizarListaTortugas();
        visualizarListaCocodrilos(); 
    }

    private void visualizarMascotasPorTipo() {
        System.out.print("\n¿Que tipo quieres ver? (gato/perro/tortuga/cocodrilo): ");
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
            case "cocodrilo":
                visualizarListaCocodrilos(); 
                break;
            default:
                System.out.println("Tipo no valido. Opciones: gato, perro, tortuga, cocodrilo.");
        }
    }

    private void visualizarMascotasPorTipoYid() {
        System.out.print("\n¿Que tipo quieres ver? (gato/perro/tortuga/cocodrilo): ");
        String tipo = scanner.nextLine().toLowerCase();

        switch (tipo) {
            case "gato":
                visualizarGatoPorId();
                break;
            case "perro":
                visualizarPerroPorId();
                break;
            case "tortuga":
                visualizarTortugaPorId();
                break;
            case "cocodrilo":
                visualizarCocodriloPorId();  
                break;
            default:
                System.out.println("Tipo no valido. Opciones: gato, perro, tortuga, cocodrilo.");
        }
    }

    // ========== VISUALIZAR POR ID ==========

    private void visualizarGatoPorId() {
        int id = pedirID();
        Gato gato = controlador.obtenerGatoPorId(id);
        if (gato != null) {
            System.out.println(gato.toString());
        } else {
            System.out.println("NO hay Gato con este ID!!!");
        }
    }

    private void visualizarPerroPorId() {
        int id = pedirID();
        Perro perro = controlador.obtenerPerroPorId(id);
        if (perro != null) {
            System.out.println(perro.toString());
        } else {
            System.out.println("NO hay Perro con este ID!!!");
        }
    }

    private void visualizarTortugaPorId() {
        int id = pedirID();
        Tortuga tortuga = controlador.obtenerTortugaPorId(id);
        if (tortuga != null) {
            System.out.println(tortuga.toString());
        } else {
            System.out.println("NO hay Tortuga con este ID!!!");
        }
    }

    private void visualizarCocodriloPorId() {  
        int id = pedirID();
        Cocodrilo cocodrilo = controlador.obtenerCocodriloPorId(id);
        if (cocodrilo != null) {
            System.out.println(cocodrilo.toString());
        } else {
            System.out.println("NO hay Cocodrilo con este ID!!!");
        }
    }

    // ========== AÑADIR MASCOTA ==========

    private void añadirMascota() {
        
    }

    private void añadirGato() {
       
    }

    private void añadirPerro() {
       
    }

    private void añadirTortuga() {
       
    }

    private void añadirCocodrilo() {  
       
    }

    // ========== BORRAR MASCOTA ==========

    private void borrarMascota() {
        
    }

    private void borrarGato() {
       
    }

    private void borrarPerro() {
      
    }

    private void borrarTortuga() {
       
    }

    private void borrarCocodrilo() {  
      
    }

    // ========== MODIFICAR MASCOTA ==========

    private void modificarMascota() {
        
    }

    private void modificarGato() {
        
    }

    private void modificarPerro() {
        
    }

    private void modificarTortuga() {
        
    }

    private void modificarCocodrilo() {  
       
    }

    // ========== LISTAR MASCOTAS ==========

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

    private void visualizarListaCocodrilos() { 
        ArrayList<Cocodrilo> cocodrilos = controlador.obtenerListaCocodrilos();
        System.out.println("\n--- LISTA DE COCODRILOS ---");
        if (cocodrilos.isEmpty()) {
            System.out.println("No hay cocodrilos en la base de datos.");
        } else {
            for (Cocodrilo c : cocodrilos) {
                System.out.println(c);
            }
        }
    }

    private int pedirID() {
        int id = -1;
        do {
            try {
                System.out.print("Dame el ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR!! No se admiten letras");
                scanner.nextLine();
            }
        } while (id < 0);
        return id;
    }
}