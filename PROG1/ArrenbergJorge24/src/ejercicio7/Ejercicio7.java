package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int contador=1;
		int contadorNeg=0;
		int contadorPos=0;
		
		do {
			System.out.println("Introduzca un numero:");
			int num = teclado.nextInt();
			contador++;
			while(num==0) {
				System.out.println("Introduzca un numero no nulo:");
				num = teclado.nextInt();
			}if(num>0) {
				contadorPos=((contadorPos)+1);
			}else {
				contadorNeg=((contadorNeg)+1);
			}
				
		}while (contador<101);
		System.out.println("El numero de numeros positivos introducidos es: " +contadorPos);
		System.out.println("El numero de numeros positivos introducidos es: " +contadorNeg);
	}

}
