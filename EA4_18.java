package funcionesEntrega;

import java.util.Scanner;

/**
 * EJERCICIOS 4.18 Y 4.19
 * Metodo que muestra una serie de numeros aleatorios 
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 28/12/2021
 */

public class EA4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantNum, max, min;
		
		System.out.println("Introduce la cantidad de numeros que quieres que aparezcan");
		cantNum = sc.nextInt();
		
		System.out.println("Introduce los valores minios y maximos que los numeros pueden adoptar");
		min = sc.nextInt();
		max = sc.nextInt();
		
		System.out.println("EJERCICIO 4.18");
		System.out.println("--------------------------");
		numerosRandom(cantNum, min, max);
		System.out.println(" ");
		System.out.println("EJERCICIO 4.19");
		System.out.println("--------------------------");
		numerosRandom(cantNum);
		
		
		sc.close();

	}

	/**
	 * EJERCICIO 4.18
	 *  Metodo que muestra una serie de numeros aleatorios a partir de tres parametros 
	 * (int cantNum, int min, int max)	
	 * @param cantNum Cantidad de numeros que se mostraran
	 * @param min Valor del minimo que pueden adoptar los numeros
	 * @param max Valor del maximo que pueden adoptar los numeros
	 */
	public static void numerosRandom(int cantNum, int min, int max) {
		
		int i;
		for (i = cantNum; i > 0; i--) {

			System.out.println((int) (Math.random() * (max-min+1)+ min)); 
		}
		
	}
	
	/**
	 * EJERCICIO 4.19
	 * Metodo que muestra una serie de numeros aleatorios reales, comprendidos entre 0 y 1
	 * @param cantNum Cantidad de numeros que se mostraran
	 */
	
	public static void numerosRandom(int cantNum) {
		
		int i;
		for (i = cantNum; i > 0; i--) {

			System.out.println (Math.random()); 
		}
		
	}
	
	
	
	
}
