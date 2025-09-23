/**
 * Introduccion de numeros en un array y mostrar los numeros mayores e iguales
 * Jorge Arrenberg 28/10
 * 
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamannoArray = 100;
		int i, contadorMayor=0, contadorIgual=0;
		float [] numeros = new float[tamannoArray];
		float valor;
		
		// Rellenamos el array con numeros aleatorios de 0 a 1
		
		for (i = 0; i < tamannoArray; i++){
			numeros[i] = (float)Math.random();
			
		}
		
		//Pedimoa al usuario que introduzca un valor entre 0 y 1 y que ese valor no se guarde hasta que este entre dichos valores
		
		System.out.println("Introduzca un valor entre 0 y 1:");
		valor=teclado.nextFloat();
		while (valor<0||valor>1) {
			System.out.println("El numero introducido debe estar entre 0 y 1:");
			valor=teclado.nextFloat();
		}
		
		//Rrcorremos el array y mediante un contador vamos contando la cantidad de numeros mayores o iguales
		
		for (i = 0; i < tamannoArray; i++){
			if(valor<numeros[i]) {
				contadorMayor=contadorMayor+1;
			}
			if(valor==numeros[i]) {
				contadorIgual=contadorIgual+1;
			}
		}
		
		// Mostramos los contadores con el valor de numeros mayores e iguales al numero introducido
		
		System.out.println("El numero de numeros mayores al introducido son: " +contadorMayor);
		System.out.println("El numero de numeros iguales al introducido son: " +contadorIgual);
	}

}
