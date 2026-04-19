package UD06_Calculadora_POO.operaciones;

public class Operaciones {
	
	public double suma(double num1 , double num2) {
		double resultado = num1 + num2 ;	
	return resultado;
	}
	
	public double resta(double num1 , double num2) {
		double resultado = num1 - num2 ;	
	return resultado;
	}
	
	public double multiplicar(double num1 , double num2) {
		double resultado = num1 * num2 ;	
	return resultado;
	}
	
	public double dividir(double num1 , double num2) {
		double resultado = num1 / num2 ;	
	return resultado;
	}
	
	public double raizCuadrada(double num) {
		double resultado = Math.sqrt(num)  ;	
	return resultado;
	}
	
	public double factorial(double num) {
		double factorial = 1;  
		int i = 2 ; 
		
			while(i<=num) {
				factorial = factorial * i ;
				i++ ;	
			}
	return factorial;
	}
	
	public double sumatorio(double num) {
		double resultado =0  ;
		
		for (int i = 0 ; i<= num ; i++) {
			resultado = resultado + i ;	
		}
	return resultado;
	}	
	
}
