/**
 * Prgrama para practicar el bulce for con condiciones
 * Jorge Arrenberg 16/10/2024
**/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double positivos = 0;
		int contadorpositivos= 0;
		double negativos = 0;
		int contadornegativos = 0;
		int ceros = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un número:");
			double num = teclado.nextDouble();
			if (num >= 0) {
				if (num == 0) {
					ceros = ceros + 1;
				} else {
					contadorpositivos=contadorpositivos+1;
					positivos = positivos + num;
				}
			}else {
				contadornegativos=contadornegativos+1;
				negativos = negativos+num;
			}
		}
		//Pongo la condicion que el contadorpositivos debe ser mayor a 0 para que en caso de no haber ningun numero positivo,
		//no se divida entre 0
		if (contadorpositivos>0){
			System.out.println("La media de los número positivos es: "+ (positivos/contadorpositivos) );
		//Pongo la condicion que el contadornegativos debe ser menor a 0 para que en caso de no haber ningun numero negativo,
		//no se divida entre 0
		}
		if(contadornegativos>0) {
			System.out.println("La media de los número negativos es: "+ (negativos/contadornegativos) );
		}
		System.out.println("El numero de ceros es: "+ ceros );
	}

}


