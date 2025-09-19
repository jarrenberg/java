/**
 * Programa que pide la fecha y verifica si es correcta
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos los datos al usuario

		System.out.print("Introduzca un dia: ");
		int dia = teclado.nextInt();

		System.out.print("Introduzca un mes: ");
		int mes = teclado.nextInt();

		System.out.print("Introduzca un año: ");
		int anno = teclado.nextInt();

		// Mostramos el resultado de la verificacion de la fecha

		if (verificadorFecha(dia, mes, anno) == true) {
			System.out.println("La fecha introducida es correcta");
		} else {
			System.out.println("La fecha introducida es incorrecta");
		}
		
		teclado.close();
	}

	// Verifica que la fecha introducida es correcta

	public static boolean verificadorFecha(int dia, int mes, int anno) {
		boolean verificador = false;
		if (anno >=1) {
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
					&& (dia > 0 && dia <= 31)) {
				verificador = true;
			}
			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia <= 30)) {
				verificador = true;
			}
			if ((anno%4!=0)&&(mes == 2) && (dia > 0 && dia <= 28)) {
				verificador = true;
			}
			if ((anno%4==0)&&(mes == 2) && (dia > 0 && dia <= 29)) {
				verificador = true;
			}
		} else {
			verificador = false;
		}
		return verificador;
	}

}
