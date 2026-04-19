package UD11_Mascota;

import java.util.ArrayList;

public class Inventario {

	ArrayList<Mascota> lstMascotas = new ArrayList<>();


	public void anadirMascota(Mascota mascota) {
		lstMascotas.add(mascota);
	}
	
	public void datosMascotas() {
		System.out.println("=====datos Mascotas=====");
		for(Mascota mascota : lstMascotas) {	
			mascota.muestra();
		}	
	}

	public void plabrasMascotas() {
		System.out.println("\n=====plabras Mascotas=====");
		for(Mascota mascota : lstMascotas) {	
			mascota.habla();
		}	
	}
	
	public void volarAves() {
		System.out.println("\n=====Volar Aves =====");
		for(Mascota mascota : lstMascotas) {	
			if(mascota instanceof Aves) {
				((Aves) mascota).volar();
			}
		}	
	}
}
