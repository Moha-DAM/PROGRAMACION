package UD11_TiendaMascota.modelo.bbdd_utils;

import java.util.ArrayList;

public interface GestorInterfaz<T> {

	public ArrayList <T> obtenerTodos();
	public T obtenerPorId(int id);
}
