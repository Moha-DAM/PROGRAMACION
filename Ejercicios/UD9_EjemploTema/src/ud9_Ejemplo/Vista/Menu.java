package ud9_Ejemplo.Vista;

import ud9_Ejemplo.Controlador.Controlador;
import ud9_Ejemplo.Modelo.Pojos.Alumno;

public class Menu {
	Controlador controlador = new Controlador();

    public void mostrarAlumno() {
        Alumno alumno = new Alumno();
        alumno = controlador.buscarAlumnoPorNombreyApellido("N3", "A3");
        System.out.println("--------------------------------------------");
        System.out.println(alumno.toString());
        System.out.println("--------------------------------------------");
    }
}
