package funcionesEntrega;

import java.util.Scanner;

public class ER4_6 {

	/**
	 * Programa que comprueba si el caracter introducido es una vocal
	 * @author Roberto Eduardo Diaz Morffi
	 * @version 1.0
	 * @since 22/12/2021
	 *
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" La letra es vocal: " + vocal(sc));
		
		
		

	}

	/**
	 * Metodo que determina si el caracter pasado porteclado es una vocal
	 * @param sc Parametro que se pasa por teclado
	 * @return
	 */
	public static boolean vocal(Scanner sc) {
		
		boolean vocal = false;
		
		System.out.println("Introduzca una letra y te dire si es vocal");
		String cadena = sc.next();
		char letra = cadena.charAt(0);
		
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
			letra == 'a' ||	letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') 
			vocal = true;
		else 
			vocal = false;
		
		return  vocal;
	}
	
}
