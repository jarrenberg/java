/**
 * Programa que muestra un menu donde se muestran opciones y se muestra la media, los multiplica o muestra el numMenor
 * Jorge Arrenberg 26/11/2024
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2,num3,num4;
		
		//Pedimos la accion al usuario
		
		System.out.println("Menu");
		System.out.println("0. SALIR");
		System.out.println("1. MULTIPLICAR");
		System.out.println("2. MEDIA");
		System.out.println("3. NUMENOR MENOR");
		int accion = teclado.nextInt();
		
		//Comprobamos que es correcto, y cuando lo sea lo guardamos en accion
		
		while (accion<0||accion>3) {
			System.out.println("Introduzca una accion valida");
			System.out.println("");
			System.out.println("Menu");
			System.out.println("0. SALIR");
			System.out.println("1. MULTIPLICAR");
			System.out.println("2. MEDIA");
			System.out.println("3. NUMENOR MENOR");
			accion = teclado.nextInt();
		}
		
		
		switch (accion) {
		
		//En caso de que el numero introducido sea 0
		
		case 0:
			System.out.println("Saliendo del programa");
			break;
			
			//En caso de que el numero introducido sea 1
			
		case 1:
			System.out.println("Introduzca un numero");
			num1=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num2=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num3=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num4=teclado.nextInt();
			
			System.out.println("El producto de los numeros introducidos es: " + producto(num1,num2,num3,num4));
			break;
			
			//En caso de que el numero introducido sea 2
			
		case 2:
			System.out.println("Introduzca un numero");
			num1=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num2=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num3=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num4=teclado.nextInt();
			
			System.out.println("La media de los numeros introducidos es: " + media(num1, num2,num3,num4));
			break;
			
			//En caso de que el numero introducido sea 3
			
		case 3:
			System.out.println("Introduzca un numero");
			num1=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num2=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num3=teclado.nextInt();
			System.out.println("Introduzca otro numero");
			num4=teclado.nextInt();
			
			int numMenor=numMenor(num1,num2);
			numMenor=numMenor(numMenor,num3);
			numMenor=numMenor(numMenor,num4);
			
			System.out.println("El numero mas pequeño entre los introducidos es:" + numMenor);
			break;
			
		}
		
		

	}
	//Devuelve el numero menor
	
	public static int numMenor (int num1, int num2) {
		int numMenor;
		if (num1<num2) {
			numMenor=num1;
		}else {
			numMenor=num2;
		}
		return numMenor;
	}
	
	
	//Devuelve el producto de 4 numeros
	
	public static int producto (int num1, int num2, int num3, int num4) {
		int producto=1;
		producto = num1;
		producto = producto*num2;
		producto= producto*num3;
		producto=producto*num4;

		return producto;
	}
	//Devuelve la media de los 4 numeros
	public static double media (int num1, int num2, int num3, int num4) {
		double media;
		media = (num1+num2+num3+num4)/4.0;
		return media;
	}

}
