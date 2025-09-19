package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int nota, contador10=0;
		String afirma10="No.";
		do {
			System.out.println("Introduzca una nota");
			nota=teclado.nextInt();
			if(nota<(-1)) {
				System.out.println("Una nota no puede ser negativa, vuelva a introducirla:");
				nota=teclado.nextInt();
			}if(nota>10) {
				System.out.println("Una nota no puede ser mayor que 10, vuelva a introducirla:");
				nota=teclado.nextInt();
			}
			if (nota==10) {
				contador10=contador10+1;
			}
		}while (nota!=(-1));
		if(contador10>0) {
			afirma10= "Si.";
		}
		System.out.println("¿Se ha introducido algun 10?: " +afirma10);
		System.out.println("¿Cuantos 10 se han introducido?:"+contador10);
	}	

}
