/**
 * Programa que realiza la media de numeros positivos introducidos y mide el numero de positivos introducidos
 * empleando bucles while y condiciones if.
 * Jorge Arrenberg 19/10/2024
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero postivo");
		int num = teclado.nextInt();
		int contador = 0;
		float sumaConsecutiva = 0;
		float mediaNum;
		// En caso de que el primer numoero introducido sea 0, mostrara este resultado
		if (num == 0) {
			System.out.println("Abortando programa");
			System.out.println("La media de los numero introducidos es: 0");
			System.out.println("El numero de numeros introducidos es: 0");
		}
		// En caso de que el primer numero introducido sea negativo, volveremos a
		// preguntar por otro valor para num y no lo guardaremos hasta que sea positivo
		while (num < 0) {
			System.out.println(
					"El numero introducido es negativo y no se tendra en cuenta. Introduzca un numero positivo:");
			num = teclado.nextInt();
			if (num == 0) {
				System.out.println("Abortando programa");
				System.out.println("La media de los numero introducidos es: 0");
				System.out.println("El numero de numeros introducidos es: 0");
			}
		}
		// Una vez el primer numero es positivo vamos sumando los numeros introducidos y
		// por cada numero aumentamos el contador.
		// para calcular la media, dividemos la suma de los numeros introducidos entre
		// el contador que hemos introducido
		while (num > 0) {
			sumaConsecutiva = num + sumaConsecutiva;
			contador = contador + 1;
			mediaNum = (sumaConsecutiva / contador);
			System.out.println("Introduzca un numero postivo");
			num = teclado.nextInt();
			// Si el siguiente numero es negativo, volvemos a preguntar por otro valor para
			// num y no lo guardaremos hasta que sea positivo
			while (num < 0) {
				System.out.println(
						"El numero introducido es negativo y no se tendra en cuenta. Introduzca un numero positivo:");
				num = teclado.nextInt();
			}
			// Cuando se introduzca un 0, mostramos el resultado
			if (num == 0) {
				System.out.println("Abortando programa");
				System.out.println("La media de los numero introducidos es: " + mediaNum);
				System.out.println("El numero de numeros introducidos es: " + contador);
			}
		}
	}
}
