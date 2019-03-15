package Util;


import java.util.Vector;

import excepciones.myException;

public class Calculadora {
	
	public static double suma (double a,double b){
		if (b == 5)
			try {
				throw new myException ("no quiero sumar 5 en el 2 operador");
			} catch (myException e) {
				System.out.println(e);	
				return 0;
			}
		return a +b;
	}

	public static double suma (double a,double b, double c) throws myException {
		if (c == 5) throw new myException ("no quiero sumar 5 el 3 operador");
		
		return a + b + c;
	}
	
	public static double suma (Vector<Double> n) {
		double total = 0;
		
		for (Double numero : n) {
			total+=numero;
		}
		return total;
		
	}
	
	public static String suma (String cad , String  b) {
		return cad + b;
	}
	
	public static int factorial (int num) {
		
		if (num == 1 || num == 0) {
			return 1;
		} else {
			return num*factorial(num-1);
		}
	}
		
	public static int potencia (int base , int exponente) {
		
		if ( exponente == 0 ) {
			return 1;
		}else{
			return base*potencia(base,exponente -1);
		}
		
		
	
	}
}
