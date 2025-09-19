/**
 * ejercicio sobre condicionales if-else y operaciones aritmeticas
 * Jorge Arrenberg 14/10/2024
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la nota de la asignatura 1");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Introduzca la nota de la asignatura 2");
		double nota2 = teclado.nextDouble();

		
		System.out.println("Introduzca la nota de la asignatura 3");
		double nota3 = teclado.nextDouble();

		
		System.out.println("Introduzca la nota de la asignatura 4");
		double nota4 = teclado.nextDouble();

		double media =(nota1+nota2+nota3+nota4)/4;
		double mediaarriba = Math.ceil(media);
		double mediaabajo = Math.floor(media);
		
		System.out.println("La nota media es: " +media);
		System.out.println("La nota media redondeade hacia arriba es: " +mediaarriba);
		System.out.println("La nota media redondeade hacia abajo es: " +mediaabajo);
		
		if (media >8) {
			System.out.println("Usted puede acceder a estudios superiores");
		}else {
			System.out.println("Usted no puede acceder a estudios superiores");
		}

	}

}
