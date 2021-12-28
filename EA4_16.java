package funcionesEntrega;

import java.util.Scanner;

/**
 * Metodo que muestra los divisores primos de un numero introducido por teclado.
 * @author Roberto
 * @version 1.0
 * @since 28/12/2021
 */

public class EA4_16 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();
		
		divisoresPrimos(num1);
		sc.close();
		
		
	}
	
	/**
	 * Metodo que recibe un numero por parametro y muestra cuales son sus divisores primos
	 * @param num Numero del que sacaremos sus divisores primos
	 * @return El total de divisores primos encontrados
	 */
	public static void divisoresPrimos(int num) {
		
		int i, x, contador = 0, contadorDivisores = 0; 
		
		//Determinar los divisores del numero introducido por parametro
		for (i = num; i > 0; i--) {
			if (num % i == 0) {
				
				//Determinar si el divisor es primo. Cada vez que encuentre un divisor el contador sumara 1
				for (x = i; x > 0; x--) {
					if (i % x == 0) 
						contador++;
					
				}
				
				//Si el numero de divisores es 2(contador = 2) significa que el numero es primo(solo se divide por el mismo y 1)
				if (contador == 2 && i != 1) {
					System.out.println(i + " Es un divisor primo de " + num);
					contadorDivisores++;
				}
				
			}
			
			contador = 0;
				
		}
		
	}

}
