package UD11_TiendaMascota.controlador;

import java.util.ArrayList;

import UD11_TiendaMascota.modelo.bbdd_utils.GestorCocodrilos;
import UD11_TiendaMascota.modelo.bbdd_utils.GestorGatos;
import UD11_TiendaMascota.modelo.bbdd_utils.GestorPerros;
import UD11_TiendaMascota.modelo.bbdd_utils.GestorTortugas;
import UD11_TiendaMascota.modelo.pojos.Cocodrilo;
import UD11_TiendaMascota.modelo.pojos.Gato;
import UD11_TiendaMascota.modelo.pojos.Perro;
import UD11_TiendaMascota.modelo.pojos.Tortuga;

public class Controlador {
	
	private GestorGatos gestorGatos ;
	private GestorPerros gestorPerros ;
	private GestorTortugas gestorTortugas;
	private GestorCocodrilos gestorCocodrilos;
	
	public Controlador() {
		gestorGatos = new GestorGatos();
		gestorPerros = new GestorPerros();
		gestorTortugas = new GestorTortugas();
		gestorCocodrilos = new GestorCocodrilos();
	}
	
	public ArrayList<Gato> obtenerListaGatos(){
		ArrayList<Gato> gatos = gestorGatos.obtenerTodos();
		
	return gatos;	
	}
	
	public ArrayList<Perro> obtenerListaPerros(){
		ArrayList<Perro> perros = gestorPerros.obtenerTodos();
		
	return perros;	
	}
	
	public ArrayList<Tortuga> obtenerListaTortugas(){
		ArrayList<Tortuga> tortugas = gestorTortugas.obtenerTodos();
		
	return tortugas;	
	}
	
	public ArrayList<Cocodrilo> obtenerListaCocodrilos() {
        return gestorCocodrilos.obtenerTodos();
    }
	
	public Gato obtenerGatoPorId(int id) {
		 Gato gato = gestorGatos.obtenerPorId(id);
		
	 return gato ;	 
	}
	
	public Perro obtenerPerroPorId(int id) {
		Perro perro = gestorPerros.obtenerPorId(id);
		
	 return perro ;	 
	}
	
	public Tortuga obtenerTortugaPorId(int id) {
		Tortuga tortuga = gestorTortugas.obtenerPorId(id);
		
	 return tortuga ;	 
	}
	
	public Cocodrilo obtenerCocodriloPorId(int id) { 
        return gestorCocodrilos.obtenerPorId(id);
    }
}