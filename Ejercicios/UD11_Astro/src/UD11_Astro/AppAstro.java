package UD11_Astro;

import java.util.ArrayList;

public class AppAstro {

	public static void main(String[] args) {
	
		ArrayList<Astro> lstAstros = new ArrayList<Astro>();
	
		Planeta pl1 = new Planeta("Planeta1",11,12,13,14,15,1,2,true);
		Planeta pl2 = new Planeta("Planeta2",21,22,23,24,25,2,3,false);
		Planeta pl3 = new Planeta("Planeta3",31,32,33,34,35,4,5,true);
		
		Satelite st1 = new Satelite("Satelite1",110,120,130,140,150,10,11,pl3);		
		Satelite st2 = new Satelite("Satelite2",210,220,230,240,250,20,21,pl1);	
		Satelite st3 = new Satelite("Satelite3",310,320,330,340,350,30,31,pl3);
		
		pl1.anadirSatelite(st2);
		pl3.anadirSatelite(st1);
		pl3.anadirSatelite(st3);
		
		lstAstros.add(pl1);
		lstAstros.add(pl2);
		lstAstros.add(pl3);
		
		lstAstros.add(st1);
		lstAstros.add(st2);
		lstAstros.add(st3);
		
		for(Astro astro : lstAstros ) {
			mostrarInfoCompleto(astro);	
		}
	}

	public static void mostrarInfoCompleto(Astro astro) {	
		if(astro instanceof Satelite ) {
			System.out.println("\nLista Satelites -------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			mostrarInfoAstro(astro);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		if(astro instanceof Planeta) {
			if(((Planeta) astro).isTieneSatelites()) {
				System.out.println("\nPlanetas Con Satelites -------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				mostrarInfoAstro(astro);
				ArrayList<Satelite> lstSat = ((Planeta) astro).getLstSatelites();
				for(int j = 0 ; j<lstSat.size() ; j++) {
					mostrarInfoAstro(lstSat.get(j));
				}
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}else {
				System.out.println("\nPlanetas SIN Satelites -------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				mostrarInfoAstro(astro);
				System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}
		}
	}
	
	public static void mostrarInfoAstro(Astro astro) {	
		astro.mustrar();	
	}
	
}
