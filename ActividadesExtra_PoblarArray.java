package funcionesEntrega;

import java.util.Scanner;


/**
 * Crear una función a la que se le pasa un Array tipo entero y se llena con numeros aleatorios
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 28/12/2021
 */

public class ActividadesExtra_PoblarArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la longitud del array");
		int longitudArray = sc.nextInt();
		
		System.out.println("Introduzca la cantidad de valores que decea introducir al array");
		int num = sc.nextInt();
		
		Integer [] poblar = new Integer[longitudArray];
		
		System.out.println(" ");
		System.out.println("Valores introducidos al array");
		System.out.println("-------------------------------------");
		poblarArray(poblar, num);

	}
	
	/**
	 * Metodo al que se le pasa un array entero y se le agregan una serie de numeros aleatorios 
	 * @param poblar Array con una longitud establecida con anterioridad
	 * @param num Cantidad de valores con los que se llenara el array
	 */
	
	public static void poblarArray(Integer[] poblar, int num) {
	try { 
		 for(int i = 0; i < num; i++) {
		
			 poblar[i] = (int) (Math.random()*12 +1);
			 
		 }
	
		 for(int i = 0; i < num; i++) {
				
			 System.out.print(poblar[i] + " ");
			 
		 }
		 
	} catch(ArrayIndexOutOfBoundsException e){
		System.out.println("La cantidad de valores introducidos sobrepasa a la longitud del array: " + e.getClass());
	}
		
		
	}

}
