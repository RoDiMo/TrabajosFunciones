package funcionesEntrega;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Programa que devuelve la distancia euclidea entre dos puntos
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 23/12/2021
 *
 */

public class EA4_12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduzca los siguientes puntos para sacar la distancia euclidea que los separa");
		System.out.print("Punto x1: ");
		double x1 = sc.nextInt();
		System.out.print("Punto y1: ");
		double y1 = sc.nextInt();
		System.out.print("Punto x2: ");
		double x2 = sc.nextInt();
		System.out.print("Punto y2: ");
		double y2 = sc.nextInt();
		
		System.out.println("La distancia euclidea que separa a los puntos es: " + distancia(x1, y1, x2, y2));
		
		sc.close();

	}

	
	/**
	 * 
	 * Metodo que determina la distancia euclidea de un punto a partir de 4 valores pasados por parametro
	 * (x1, y1, x2, y2)
	 * @param x1 Posicion x1 del punto (x1, y1)
	 * @param y1 Posicion y1 del punto (x1, y1)
	 * @param x2 Posicion x2 del punto (x2, y2)
	 * @param y2 Posicion y2 del punto (x2, y2)
	 * @return
	 */
	static double distancia(double x1, double y1, double x2, double y2) {
		
		double dist = Math.sqrt(Math.pow((x1 - x2) , 2) + Math.pow((y1 - y2) , 2));
		
		return dist;
	}
	
}
