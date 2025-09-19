/**
 * Ejercicio sobre la estructura if-else anidados
 * Jorge Arrenberg 09/10/202
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre del usuario:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca los apellidos del usuario:");
		String apellidos = teclado.nextLine();
		
		System.out.println("Introduzca el ciclo formativo:");
		String ciclo = teclado.nextLine();
		
		System.out.println("Introduzca la nota del usuario:");
		int nota = teclado.nextInt();
		
		if (nota<5) {
			System.out.println("Nombre:" +nombre);
			System.out.println("Apellidos:"+apellidos);
			System.out.println("Ciclo formativo:" +ciclo);
			System.out.println("Nota:" +nota+ "(Suspenso)");
		}else {
			if(nota==5) {
				System.out.println("Nombre:" +nombre);
				System.out.println("Apellidos:"+apellidos);
				System.out.println("Ciclo formativo:" +ciclo);
				System.out.println("Nota:" +nota+ "(Suficiente)");
			}if(nota==6) {
				System.out.println("Nombre:" +nombre);
				System.out.println("Apellidos:"+apellidos);
				System.out.println("Ciclo formativo:" +ciclo);
				System.out.println("Nota:" +nota+ "(Bien)");
			}if(nota>=7 && nota<9) {
				System.out.println("Nombre:" +nombre);
				System.out.println("Apellidos:"+apellidos);
				System.out.println("Ciclo formativo:" +ciclo);
				System.out.println("Nota:" +nota+ "(Notable)");
			}if(nota>=9 && nota<=10) {
				System.out.println("Nombre:" +nombre);
				System.out.println("Apellidos:"+apellidos);
				System.out.println("Ciclo formativo:" +ciclo);
				System.out.println("Nota:" +nota+ "(Sobresaliente)");
			}
		}System.out.println("Gracias por usar el programa");

	}

}
