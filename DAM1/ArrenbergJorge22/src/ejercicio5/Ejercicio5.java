/**
 * ejercicio sobre estructura switch
 * Jorge Arrenberg 14/10/2024
 */


package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduzca un numero");
		int num2 = teclado.nextInt();
		
		System.out.println("Indique la operacion que quiera realizar (Introduzca el numero)");
		System.out.println("(1) SUMA");
		System.out.println("(2) RESTA");
		System.out.println("(3) MULTIPLICACION");
		System.out.println("(4) DIVISION");
		int operacion =teclado.nextInt();
		
		switch (operacion) {
		case 1: 
			int suma = num1+num2;
			System.out.println("Resultado: " +suma);
			break;
			
		case 2:
			int resta = num1-num2;
			System.out.println("Resultado: " +resta);
			break;
			
		case 3:
			int producto = num1*num2;
			System.out.println("Resultado: " +producto);
			break;
			
		case 4:;
			if (num2==0) {
				System.out.println("No se puede dividir entre 0");
			}else {
				double division = num1/num2 ;
				System.out.println("Resultado: "+division);
			}
			break;
		default:
			System.out.println("El numero introducido es incorrecto");
			break;
		}
	}

}
