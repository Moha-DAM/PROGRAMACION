package Ejercicio02_03;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio02 {

    private static final int MAX_NIVEL = 3;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame la ruta del fichero o directorio: ") ;
        String ruta =teclado.nextLine();

        File recurso = new File(ruta) ;

      
        if(!recurso.exists()) {
            System.out.println(" El fichero o directorio NO existe!! ");
        }else {

            try {
                FileWriter fw = new FileWriter("infoRecurso.txt ");
                BufferedWriter bw = new BufferedWriter(fw) ;

                escribirInfo(recurso, bw, 0) ;

                bw.close(); 
                
                System.out.println("Informacion guardada correctamente en el fichero infoRecurso.txt");

            } catch(IOException e) {
                System.out.println(" Error al escribir el fichero! ");
            }
        }
    }

 /**
  * 
  * @param f
  * @param bw
  * @param nivel
  */
    public static void escribirInfo(File f, BufferedWriter bw, int nivel) {

        if(nivel <= MAX_NIVEL) {

            try{
                String indentacion = "" ;

                for(int i = 0 ; i < nivel; i++ ) {
                     indentacion += "  " ;
                }

                bw.write(indentacion +" Nombre: "+ f.getName());
                bw.newLine();

                bw.write(indentacion + " ultima modificacion: "+ new Date(f.lastModified()));
                bw.newLine();

                bw.write(indentacion +" Tamano: "+ f.length()+ " bytes");
                bw.newLine();

                if (f.isFile()) {

                    bw.write(indentacion +" Ejecutable: "+ f.canExecute());
                    bw.newLine();

                    bw.write(indentacion +" Permisos -> Lectura: "+ f.canRead()
                            +", Escritura: "+ f.canWrite());
                    bw.newLine();

                } else if (f.isDirectory()) {

                    File[] elementos = f.listFiles();
                    int numElementos = 0;

                    if (elementos != null) {
                        numElementos = elementos.length;
                    }

                    bw.write(indentacion+"Numero de elementos: "+ numElementos);
                    bw.newLine();

                    if (elementos != null) {
                        for (int i = 0; i < elementos.length; i++) {
                            escribirInfo(elementos[i] , bw , nivel + 1);
                        }
                    }
                }

                bw.newLine();

            }catch(IOException e) {
                System.out.println(" Error al escribir informacion!!! ");
            }
        }
    }

}
