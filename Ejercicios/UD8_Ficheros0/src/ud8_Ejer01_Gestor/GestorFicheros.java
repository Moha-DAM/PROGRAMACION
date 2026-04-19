package ud8_Ejer01_Gestor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Implements the methods to read, write and write more text at the end of the file
 */
public class GestorFicheros {

    private static final String NOMBRE_FICHERO = "fichero.txt";
    private static final String RUTA_FICHERO = "carpetaFichos/";
    private static final File fichero = new File(RUTA_FICHERO + NOMBRE_FICHERO);

    /**
     * Write info into a file, if exists erase the previous content, if doesn't exists create the file
     * @param texto
     */
    public void guardarFichero(String texto) {
        System.out.println("Vamos a escribir en el fichero " + NOMBRE_FICHERO + " en la ruta " + RUTA_FICHERO);
        File carpeta = new File(RUTA_FICHERO);
        
        if(!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Preparamos las clases necesarias para escribir un fichero
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            // Asignamos el fichero que vamos a escribir
            fileWriter = new FileWriter(fichero, false); // si es false, el fichero se sobreescribe al final...
            // fileWriter = new FileWriter(RUTA_FICHERO + NOMBRE_FICHERO, true);
            printWriter = new PrintWriter(fileWriter);

            printWriter.print(texto);
            System.out.println("El fichero " + NOMBRE_FICHERO + " se ha guardado correctamente");
        } catch (IOException e) {
            System.out.println("IOException - Error de escritura en el fichero " + RUTA_FICHERO + NOMBRE_FICHERO);
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                // Nos da igual
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                // Nos da igual
            }
        }
    }

    /**
     * Retorna un String con todo el contenido del fichero; null si el fichero no existe
     * 
     * @return el contenido del fichero o null
     */
    public String leerTodoFichero() {
        String ret = null;

        System.out.println("Vamos a leer el fichero " + NOMBRE_FICHERO + " en la ruta " + RUTA_FICHERO);

        // Preparamos las clases necesarias para leer un fichero
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            File file = new File(RUTA_FICHERO + NOMBRE_FICHERO);

            // Asignamos el fichero que queremos leer
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            ret = "";

            while ((linea = bufferedReader.readLine()) != null) {
                // Nos aseguramos de que ret no sea null
                ret += linea + "\n";
                // System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException - El fichero " + RUTA_FICHERO + NOMBRE_FICHERO + " no existe");
        } catch (IOException e) {
            System.out.println("IOException - Error de lectura del fichero " + RUTA_FICHERO + NOMBRE_FICHERO);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                // Nos da igual
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                // Nos da igual
            }
        }

        return ret;
    }

    /**
     * Añade el texto al final del fichero
     * @param texto
     */
    public void anyadirTextoAlFichero(String texto) {
        System.out.println("Vamos a escribir en el fichero " + NOMBRE_FICHERO + " en la ruta " + RUTA_FICHERO);

        // Preparamos las clases necesarias para escribir un fichero
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            // Asignamos el fichero que vamos a escribir
            // fileWriter = new FileWriter(RUTA_FICHERO + NOMBRE_FICHERO);
            // Si le pasamos true el fichero se actualiza a final...
            fileWriter = new FileWriter(RUTA_FICHERO + NOMBRE_FICHERO, true);
            printWriter = new PrintWriter(fileWriter);

            printWriter.println(texto);
            System.out.println("El fichero " + NOMBRE_FICHERO + " se ha guardado correctamente");
        } catch (IOException e) {
            System.out.println("IOException - Error de escritura en el fichero " + RUTA_FICHERO + NOMBRE_FICHERO);
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                // Nos da igual
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                // Nos da igual
            }
        }
    }
}
