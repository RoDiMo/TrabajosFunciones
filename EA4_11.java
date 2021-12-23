package funcionesEntrega;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Programa que devuelve la superficie y volumen de una circunferencia
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 23/12/2021
 *
 */

public class EA4_11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		volumenRadio(sc);
		
		sc.close();
		

	}
	
	/**
	 * Metodo que devuelve la superficie y volumen de una circunferencia
	 * @param sc Valor introducido por teclado
	 */
	
	public static void volumenRadio(Scanner sc) {

		System.out.println("Introduzca el radio de la circunferencia");
		float radio = sc.nextFloat();
		
		float superficie = (float) ((4 * Math.PI) * Math.pow(radio, 2));
		float volumen = (float) (((4 * Math.PI) / 3) * Math.pow(radio, 2));
		
		System.out.println("La superficie de la circunferencia es: " + superficie);
		System.out.println("El volumen de la circunferencia es: " + volumen );
		
	}



}
