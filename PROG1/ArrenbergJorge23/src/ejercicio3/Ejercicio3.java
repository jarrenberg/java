/**
 * Porgrama para practicar la estructura do-while
 * Jorge Arrenberg 15/10/2024
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Números del 100 al 1:");
		int cont = 100;
		do {
			System.out.print(cont + ", ");
			cont=cont-1;
		}while (cont>0);
	}
}
