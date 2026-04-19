package UD11_TiendaMascota.controlador;

import java.util.ArrayList;

import UD11_TiendaMascota.modelo.bbdd_utils.GestorGatos;
import UD11_TiendaMascota.modelo.bbdd_utils.GestorPerros;
import UD11_TiendaMascota.modelo.bbdd_utils.GestorTortugas;
import UD11_TiendaMascota.modelo.pojos.Gato;
import UD11_TiendaMascota.modelo.pojos.Perro;
import UD11_TiendaMascota.modelo.pojos.Tortuga;

public class Controlador {

     GestorGatos gestorGatos = new GestorGatos();
     GestorPerros gestorPerros = new GestorPerros();
     GestorTortugas gestorTortugas = new GestorTortugas();
     


    public ArrayList<Gato> obtenerListaGatos() {
        return gestorGatos.buscarTodosGatos();
    }

    public ArrayList<Perro> obtenerListaPerros() {
        return gestorPerros.buscarTodosPerros();
    }

    public ArrayList<Tortuga> obtenerListaTortugas() {
        return gestorTortugas.buscarTodosTortugas();
    }
}