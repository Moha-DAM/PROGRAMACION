package UD11_Mascota;

public class AppMascota {

	public static void main(String[] args) {
		
		Inventario inventario  = new Inventario();
		
		Perro perro1 = new Perro("Perro1", 20, Estado.vivo, 2003, "raza1", true);
		Perro perro2 = new Perro("Perro2", 50, Estado.muerto, 1982, "raza2", false);
		
		Gato gato1 = new Gato("Gato1", 6, Estado.vivo, 2013, "blanco", true);
		Gato gato2 = new Gato("Gato2", 10, Estado.vivo, 2002, "gris", false);
		
		Loro loro1 = new Loro("Loro1", 6, Estado.muerto, 2022, Pico.corto , true , "Brazil", true);
		Loro loro2 = new Loro("Loro2", 8, Estado.vivo, 2020, Pico.amarillo , false , "Peru", false);

		Canario canario1 = new Canario("Canario1", 16, Estado.muerto, 2015, Pico.ganchudo , true , "Naranja", true);
		Canario canario2 = new Canario("Canario2", 10, Estado.vivo, 2010, Pico.ganchudo , true , "Rojo", false);

		inventario.anadirMascota(perro1);
		inventario.anadirMascota(perro2);
		inventario.anadirMascota(gato1);
		inventario.anadirMascota(gato2);
		inventario.anadirMascota(loro1);
		inventario.anadirMascota(loro2);
		inventario.anadirMascota(canario1);
		inventario.anadirMascota(canario2);
		
		inventario.datosMascotas();
		inventario.plabrasMascotas();
		inventario.volarAves();
		
	}

}
