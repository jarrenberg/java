/**
 *Introduccion de datos en array y comprobar numeros mayor, menor, numeros entre 0 y 100 y numeros entre 100 y 200
 * Jorge Arrenberg 29/10
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numMayor = 0,numMenor=999999, filaMayor=0 , columnaMayor=0, filaMenor=0, columnaMenor=0, contadorHasta100=0, contadorHasta200=0;

		int[][] valores = new int[5][10];

		//Introducimos los valores en el array
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Introduzca un valor en la fila " + (i + 1) + " en la columna " + (j + 1));
				int num = teclado.nextInt();
				valores[i][j] = num;

			}

		}
		
		//Mostramos los valores del array en columnas de 10 y 5 filas
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//Recorremos el array y ponemos condicones

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				
				//Recorremos el array buscando un numero mayor al de la variable, y en caso de que se cumpla la condicion guardamos el valor y la posicion
				
				if(valores[i][j]>numMayor) {
					numMayor=valores[i][j];
					filaMayor=i;
					columnaMayor=j;
				}
				//Recorremos el array buscando un numero menor al de la variable, y en caso de que se cumpla la condicion guardamos el valor y la posicion
				
				if(valores[i][j]<numMenor) {
					numMenor=valores[i][j];
					filaMenor=i;
					columnaMenor=j;
				}
				
				//Usamos un contador que suma 1 cada vez que un numero del array esta entre 0 y 100
				
				if(valores[i][j]>=0&&valores[i][j]<=100) {
					contadorHasta100=contadorHasta100+1;
				}
				
				//Usamos un contador que suma 1 cada vez que un numero del array esta entre 100 y 200
				
				if(valores[i][j]>100&&valores[i][j]<=200) {
					contadorHasta200=contadorHasta200+1;
				}

			}
		}
		//Mostramos los numeros mayores y menores, sus posiciones y los contadores de cuantos numeros hay entre 0 y 100 y entre 100 y 200
		
		System.out.println("El numero mayor es " + numMayor+ " y se encuentra en la fila " +(filaMayor + 1)+ " y en la columna " + (columnaMayor +1));
		System.out.println("El numero menor es " + numMenor+ " y se encuentra en la fila " +(filaMenor+ 1) + " y en la columna " +(columnaMenor + 1));
		System.out.println("El numero de valores entre 0 y 100 son: " +contadorHasta100);
		System.out.println("El numero de valores entre 100 y 200 son: " +contadorHasta200);
		
	}

}
