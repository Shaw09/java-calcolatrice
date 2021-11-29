package org.generation.italy.utils;

public class CalcoliHelper {
	
	private CalcoliHelper() {
		
	}
	
	
	// int
	public static int add(int numero, int numero2) {
		return numero + numero2;
	}
	
	public static int subtract(int numero, int numero2) {
		return numero - numero2;
	}
	
	public static int multiply(int numero, int numero2) {
		return numero * numero2;
	}
	
	public static int min(int numero, int numero2) {
		if(numero < numero2) {
			return numero;
		} else {
			return numero2;
		}
	}
	
	public static int max(int numero, int numero2) {
		if(numero > numero2) {
			return numero;
		} else {
			return numero2;
		}
	}
	
	public static int valoreAssoluto(int numero) {
		if(numero >= 0) {
			return numero;
		} else {
			return -numero;
		}
	}
	
	
	// double
	public static double add(double numero, double numero2) {
		return numero + numero2;
	}

	public static double subtract(double numero, double numero2) {
		return numero - numero2;
	}

	public static double multiply(double numero, double numero2) {
		return numero * numero2;
	}

	public static double min(double numero, double numero2) {
		if(numero < numero2) {
			return numero;
		} else {
			return numero2;
		}
	}
	
	public static double max(double numero, double numero2) {
		if(numero > numero2) {
			return numero;
		} else {
			return numero2;
		}
	}
	
	public static double valoreAssoluto(double numero) {
		if(numero >= 0) {
			return numero;
		} else {
			return -numero;
		}
	}
}
