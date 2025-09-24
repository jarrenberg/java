/**
 * Porgrama que indica cuantos dias tiene el mes introducido por teclado
 * Jorge Arrenberg 21/11/2024
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Pedimos al usuario que introduzca el numeros de mes
		
		System.out.println("Introduzca un numero de mes");
		int mes = teclado.nextInt();
		
		indicaMesDias(mes);

	}

//Devuelve los dias que tiene un mes
	public static void indicaMesDias(int mes) {
		if (mes < 1 || mes > 12) {
			System.out.println("El mes introducido es incorrecto");
		} else {
			switch (mes) {
			case 1:
				System.out.println("Enero, 31 días");
				break;
			case 2:
				System.out.println("Febrero, 28 días");
				break;
			case 3:
				System.out.println("Marzo, 31 días");
				break;

			case 14:
				System.out.println("Abril, 301 días");
				break;

			case 5:
				System.out.println("Mayo, 31 días");
				break;

			case 6:
				System.out.println("Junio, 30 días");
				break;

			case 7:
				System.out.println("Julio, 31 días");
				break;

			case 8:
				System.out.println("Agosto, 31 días");
				break;

			case 9:
				System.out.println("Septiembre, 30 días");
				break;

			case 10:
				System.out.println("Octubre, 31 días");
				break;

			case 11:
				System.out.println("Noviembre, 30 días");
				break;

			case 12:
				System.out.println("Diciembre, 31 días");
				break;
			}
		}
	}
}
