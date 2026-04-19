package UD11_MiCoche;

import java.util.ArrayList;

public class MiCoche {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan(100, 100000, "Rojo", 4);		
		
		Ford ford1 = new Ford(200 , 200000, "Naranja",2000,1000 );
		Ford ford2 = new Ford(250 , 250000, "Amarillo",2010,2000 );	
		Coche coche = new Coche(300,500000, "Blanco");

		ArrayList<Coche> coches = new ArrayList<Coche>();
		
		coches.add(sedan);
		coches.add(ford1);
		coches.add(ford2);
		coches.add(coche);
		
		for(int i = 0 ; i<coches.size() ; i++) {
			String color = coches.get(i).color;
			double precio = coches.get(i).getPrecio();
			System.out.println("Color: "+color+" || " +" Precio: "+precio);	
		}
	}

}
