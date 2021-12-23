package funcionesEntrega;

import java.util.Scanner;

public class ER4_12 {

	/**
	 * 
	 * Programa que calcule el enésimo términ ode la serie de fibonacci
	 * @author Roberto Eduardo Diaz Morffi
	 * @version 1.0
	 * @since 23/12/2021
	 *
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num = sc.nextInt();

		
		System.out.println("El enésimo valor de la serie de fibonacci es: " + fibo(num));
		sc.close();
		

	}

	/**
	 * 
	 * @param num Número al que se le sacara el enesimo valor de la serie de fibonacci
	 * @return Enesimo valor de la serie de fibonacci
	 */
	public static int fibo(int num) {
		
		int res;
		if (num == 0 || num == 1)
			res = 1;
		else 
			res = fibo(num -1) + fibo(num - 2);
			
		return res;
	}
	
}
