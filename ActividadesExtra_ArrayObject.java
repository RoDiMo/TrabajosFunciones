package funcionesEntrega;

class Letras {
	public  int num;
	public String letra;
	
	public Letras(int num, String letra) {
		this.num = num;
		this.letra = letra;
	}
}


/**
 * Crear una función a la que se le pasa un Array de Object (Object []) y muestra su contenido. 
 * @author Roberto Eduardo Diaz Morffi
 * @version 1.0
 * @since 28/12/2021
 */

public class ActividadesExtra_ArrayObject {

	public static void main(String[] args) {
		
		Letras objeto[] =  new Letras[6];
		
		objeto[0] = new Letras(1, "O");
		objeto[1] = new Letras(2, "B");
		objeto[2] = new Letras(3, "J");
		objeto[3] = new Letras(4, "E");
		objeto[4] = new Letras(5, "T");
		objeto[5] = new Letras(6, "O");

		
		arrayObjeto(objeto);

	
	}
	

	
	/**
	 * Metodo que recibe valores de un array de objetos (objeto[]) y muestra su contenido
	 * @param objeto array de objeto que almacena una serie de valores de la clase Letras
	 */
	
	public static void arrayObjeto (Letras[] objeto) {
		
	for (int i = 0; i < objeto.length; i++)
		
		System.out.println(objeto[i].num + " " + objeto[i].letra);
		

	}
}
