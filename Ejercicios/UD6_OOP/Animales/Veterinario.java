package UD6_OOP.Animales;

public class Veterinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro perro1  = new Perro ("Momo", "Macho", "doberman") ;
		Perro perro2  = new Perro ("Dany", "Hembra", "chiwawa") ;
		
		
		System.out.println("Bienvenido a la clinica veterinaria....");
		
		System.out.println("\nPerrito, como te llamas? ");
		perro1.ladrar();
	
		System.out.println("\ncuantos anos tienes ? ");
		perro1.setEdad(2);
		System.out.println("Tengo  "+perro1.getEdad()+ " anos");
		
		
		perro1.setAltura(1);
		perro1.setEdad(27);
		perro1.setEsBacunado(false);
		perro1.setPeso(29);
		System.out.println(perro1.toString());
		
		perro2.setAltura(2);
		perro2.setEdad(25);
		perro2.setEsBacunado(true);
		perro2.setPeso(35);
		System.out.println(perro2.toString());
		
		
	}

}
