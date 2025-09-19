/**
 * Porgrama para practicar la estructura do-while
 * Jorge Arrenberg 15/10/2024
 */
package ejercicio2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		System.out.println("Números del 1 al 100:");
		int cont = 1;
		do {
			System.out.print(cont + ", ");
			cont=cont+1;
		}while (cont<101);
	}
}
