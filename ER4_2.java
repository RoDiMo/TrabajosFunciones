package funcionesEntrega;

import java.util.Scanner;

/**
 * 
 * Programa que muestra todos los numeros comprendidos entre 2 enteros
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 22/12/2021
 *
 */

public class ER4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		enteros(sc);
		
		sc.close();

	}
	
	/**
	 * Metodo que muestra los numeros comprendidos entre 2 enteros
	 * @param sc Introduce un valor pasado por teclado
	 */
	
	public static void enteros(Scanner sc) {
		System.out.println("Introduce dos números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for(int i = num1 + 1; i < num2; i++) 
			System.out.println(i);
		
		
	}

}
