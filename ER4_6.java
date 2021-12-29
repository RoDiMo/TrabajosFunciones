package funcionesEntrega;

import java.util.Scanner;

/**
 * 
 * Programa que comprueba mediante un booleano si un numero es primo
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 22/12/2021
 *
 */

public class ER4_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		
		System.out.println("El número es primo: " + esPrimo(num));

	}

	
	/**
	 * Metodo que determina si un numero pasado por paramtro es primo o no
	 * @param sc Valor introducido por teclado
	 * @return True o False, en dependencia de si el numero es primo o no
	 */
	
	public static boolean esPrimo(int num) {
		boolean primo = true;
		
		

		int i = 2;
		
		//Si el numero es 0 o 1 el numero no es primo (El primer numero primo es 2)
		if (num == 0 || num == 1) {
			primo = false;
		} else {
			//Si se encuentra algun divisor entre 2 y el numero significa que el numero no es primo
			while (i < num && primo == true) {
				if(num % i == 0) {
					primo = false;
					
				}
				i++;
			}
		}
		
		return primo;
	}
	
}
