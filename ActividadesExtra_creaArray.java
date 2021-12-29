package funcionesEntrega;

import java.util.Scanner;

/**
 * Crea una función creaArray a la que se le pasa la longitud y devuelve un array de enteros de dicha longitud.
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 28/12/2021
 */

public class ActividadesExtra_creaArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero para determinar la longitud del array");
		int num = sc.nextInt();

		System.out.println("Se ha creado un Array de longitud: " + creaArray(num));
		
		sc.close();
	}

	
	/**
	 * Metodo que recibe la longitud de un array por parametros y debe devolver una array de enteros dedicha longitud
	 * @param num Longitud del array
	 * @return Valor correspondiente a la longitud del array
	 */
	public static int creaArray(int num) {
		int arrayEnteros[];
		arrayEnteros = new int [num];
		int longitudArray = arrayEnteros.length;
		
		return longitudArray;
	}
	

}


