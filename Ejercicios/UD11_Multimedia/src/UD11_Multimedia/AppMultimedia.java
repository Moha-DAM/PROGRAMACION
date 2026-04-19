package UD11_Multimedia;

public class AppMultimedia {

	public static void main(String[] args) {
	
// Peliculas ---------------------------------------------------------------------------------
		System.out.println("---> Anadimos las Peliculas :");
		ListaMultimedia listaPeliculas = new ListaMultimedia(10);
		
		Pelicula pl1 = new Pelicula("Mama","Med",Formato.midi,100, "Momo", "mimi");
		Pelicula pl2 = new Pelicula("Baba","Bed",Formato.dvd, 120, "Bomo", "Bibi");
		Pelicula pl3 = new Pelicula("Lala","Led",Formato.mov, 100, "Lolo", "Lili");
		
		listaPeliculas.add(pl1);
		listaPeliculas.add(pl2);
		listaPeliculas.add(pl3);
			
		System.out.println("\n=======Lista de las Peliculas======");
		System.out.println(listaPeliculas.toString());

// Discos ---------------------------------------------------------------------------------
		System.out.println("\n---> Anadimos los Discos :");
		ListaMultimedia listaDiscos = new ListaMultimedia(20);
		
		Disco dsc1 = new Disco("Papa","Pep",Formato.mp3 ,10, Genero.andalosi) ;
		Disco dsc2 = new Disco("Koko","Kiki",Formato.avi ,5, Genero.pop) ;
		Disco dsc3 = new Disco("Coco","cucu",Formato.mp3 ,3, Genero.rock) ;
		
		listaDiscos.add(dsc1);
		listaDiscos.add(dsc2);
		listaDiscos.add(dsc3);
		
		System.out.println("\n=======Lista de los 3 Discos======");
		System.out.println(listaDiscos.toString());
		
		System.out.println("\n---> Anadimos el Discos 4 :");
		Disco dsc4 = new Disco(dsc2.getTitulo(),dsc2.getAutor(),null ,0, null) ;
		listaDiscos.add(dsc4);
		
		System.out.println("\n=======Lista de TODOS los Discos======");
		System.out.println(listaDiscos.toString());
	}

	
	
	
}
