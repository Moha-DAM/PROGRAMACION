package UD11_Multimedia;

public class ListaMultimedia {

	private Multimedia [] multimedias ;
	private int contadorMulti ;
	
	public ListaMultimedia(int numMulti) {		
		multimedias = new Multimedia[numMulti];
		contadorMulti = 0 ;
	}
	
	public int size() {	
		return contadorMulti;
	}
	
	public boolean add(Multimedia m) {
		boolean anadido = false ;
		
		if(contadorMulti >= multimedias.length) {
			System.out.println("La lista esta llena , No hay espacio!!");
		}else {		
				multimedias[contadorMulti]= m ;
				System.out.println("La Multimedia anadida con Excito en posicion "+contadorMulti);
				contadorMulti++;
				anadido = true ;
		}
		
	 return anadido ;	
	}
	
	public Multimedia get(int posicion) {
		Multimedia multimedia = null ;
		
			if(posicion>=0 && posicion<contadorMulti) {
				multimedia = multimedias[posicion] ;
			}
			
	 return multimedia ;	
	}

	public String toString() {
		String mensaje = "";

		for(int i=0 ; i<contadorMulti ; i++) {
			mensaje =  mensaje + "\nMultimedia "+(i+1)+" : "+multimedias[i].toString();
			
		}
	return mensaje ;
	}
	
	
	
	
}
