package funcionesEntrega;

import java.util.Scanner;

public class EA4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantNum, max, min;
		
		System.out.println("Introduce la cantidad de numeros que quieres que aparezcan");
		cantNum = sc.nextInt();
		
		System.out.println("Introduce los valores minios y maximos que los numeros pueden adoptar");
		min = sc.nextInt();
		max = sc.nextInt();
		
		numerosRandom(cantNum, min, max);
		
		
		sc.close();

	}

	public static void numerosRandom(int cantNum, int min, int max) {
		
		int i;
		for (i = cantNum; i > 0; i--) {

			System.out.println((int) (Math.random() * (max-min+1)+ min)); 
		}
		
	}
	
}
