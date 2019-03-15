package Main;

import java.sql.SQLException;
import java.util.Vector;

import Util.Calculadora;
import excepciones.myException;

public class test {

	public static void main(String[] args) {
		/*
		Calculadora c = new Calculadora ();
		
		System.out.println(c.suma(2.4, 4.5));
		System.out.println(c.suma(2.4, 4.5,8));
		
		Vector<Double> numeros = new Vector();
		
		numeros.add(8.0);
		numeros.add(55.4);
		numeros.add(6.7);
		numeros.add(1.21);
		
		System.out.println(c.suma(numeros));
		
		System.out.println(c.suma("ana", " y luis"));
		
		System.out.println(c.factorial(4));
		
		System.out.println(c.potencia(3, 3));

		*/
		
		System.out.println(Calculadora.potencia(2,10));

		System.out.println(Calculadora.suma(4, 5));
		
		try {
			System.out.println(Calculadora.suma(3, 5, 5));
		} catch (myException e) {
			System.out.println(e);
		}
	}
	

}
