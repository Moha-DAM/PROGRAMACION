package ud8_Ejer01_Menu;

import java.util.Scanner;

import ud8_Ejer01_Gestor.GestorFicheros;

/**
 * Shows menu and asks for input data
 * @author Gorka Unamuno
 */
public class Menu {

    private static Scanner teclado = new Scanner(System.in);
    GestorFicheros gestor = new GestorFicheros();

    /**
     * Shows menu
     */
    public void mostrarMenu() {
        int opcionMenu = -1;

        while (opcionMenu != 0) {
            try {
                System.out.println("MENU GESTIÓN FICHEROS:");
                System.out.println("0 - Salir");
                System.out.println("1 - Escribir texto y guardar fichero");
                System.out.println("2 - Abrir fichero y mostrar contenido");
                System.out.println("3 - Abrir fichero y añadir más texto");
                opcionMenu = pedirOpcionMenu();
            } catch (Exception e) {
                System.out.println("Error. Introduzca un número entre 0 y 3.");
                teclado.nextLine();
            }

            if ((opcionMenu <0 || opcionMenu > 3)) {
                System.out.println("Error. Introduzca un número entre 0 y 3.");      
            } else {
            	elegirOperacion(opcionMenu);
            }
        }
    }

    /**
     * Asks for a menu option
     * @return int opcionMenu
     */
    private int pedirOpcionMenu() {
        int ret = 0;
        System.out.println("Elija una opción: ");
        System.out.println(" ");
        ret = teclado.nextInt();
        return ret;
    }

    /**
     * Choose an option from the menu
     * @param opcionMenu
     */
    private void elegirOperacion(int opcionMenu) {
        String texto = "";

        switch (opcionMenu) {
            case 0:
                System.out.println("Fin de programa");
                break;

            case 1:
                texto = leerTexto();
                gestor.guardarFichero(texto);
                break;

            case 2:
                texto = gestor.leerTodoFichero();
                mostrarTexto(texto);
                break;

            case 3:
                texto = leerTexto();
                gestor.anyadirTextoAlFichero(texto);
                break;

            default:
                System.out.println("Opción no válida. Introduzca un número entre 0 y 3.");
                System.out.println("");
        }
    }

    /**
     * Shows the text from the file if it is not null
     * @param texto
     */
    private void mostrarTexto(String texto) {
        if (texto == null) {
            System.out.println("El fichero está vacío.");
            System.out.println("");
        } else {
            System.out.println(texto);
            System.out.println("");
        }
    }

    /**
     * Read the text typed by the user
     * @return texto
     */
    private String leerTexto() {
        String texto = "";
        teclado.nextLine();
        System.out.println("Introduzca el texto que quiera guardar:");
        System.out.println("");
        texto = teclado.nextLine();
        System.out.println("");
        return texto;
    }
}
