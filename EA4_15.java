package funcionesEntrega;

import java.util.Scanner;

/**
 * Metodo que muestra la diferencia en minutos entre dos instantes de tiempo
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 28/12/2021
 *
 */
public class EA4_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora1, hora2, min1, min2;
		
		System.out.println("Introduce la primera hora y minuto: ");
		hora1 = sc.nextInt();
		min1 = sc.nextInt();
		
		System.out.println("Introduce la segunda hora y minuto: ");
		hora2 = sc.nextInt();
		min2 = sc.nextInt();
		
		System.out.println("La diferencia de minutos entre esas dos horas es de: " + diferenciaMin(hora1, min1, hora2, min2) + " minutos");
		
		sc.close();
	}

	/**
	 * Metodo al que se le introducen dos instantes de tiempo mediante cuatro parametros 
	 * (hora1, min1, hora2 y min2) y debe mostrar la diferencia de minutos que hay entre ellos
	 * 
	 * @param hora1 Primera hora introducida
	 * @param min1 Primer minuto introducido
	 * @param hora2 Segunda hora introducida
	 * @param min2  Segundo minuto introducido
	 * @return Contador que representa la diferencia de minutos
	 */
	public static int diferenciaMin(int hora1, int min1, int hora2, int min2) {
		
		int contador = 0;
		
		//Comprobamos que se introduzcan horas validas
		if (hora1 >= 24 || hora2 >= 24 || min1 > 60 || min2 > 60) {
			System.out.println("Por favor introduzca una hora válida");
		} else {
			
			//Contar e incrementar los minutos mientras los dos instantes de tiempo sean diferentes
			while (hora1 != hora2 || min1 != min2) {

				min1++;
				contador++;
				
				//Si se llegan a los 60 se reiniciara el valor de los minutos a 0 y se sumara una hora
				if (min1 == 60) {
					min1 = 0;
					hora1++;
					
					//Si se llegan a los 24 se reiniciara el valor de las horas a 0
					if (hora1 == 24) 
						hora1 = 0;
					if (hora2 == 24)
						hora2 = 0;
					
				}
			}

		}
		
		
		return contador;
	}
	
}
