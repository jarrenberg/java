/**
 * Programa donde se le introduce un radio y calcula la circunferencia, el area y el volumen hasta que se le introduce un comando de salida
 * Jorge Arrenberg 12/11/2024
 */

package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		// Creamos variables para guardar los valores de la accion y el radio

		int accion;
		double radio;
		do {

			// Mostramos el menu y guardamo el comando en la variable accion

			accion = menu();

			// Pedimos el radio y guardamos el radio en la variable radio

			radio = pideRadio();

			// Mostramos el resultado dependiendo de la accion introducida

			switch (accion) {
			case 1:
				if (accion == 1) {
					System.out.println("La circunferencia es: " + circunferencia(radio) + " cm.");
				}
				break;
			case 2:
				if (accion == 2) {
					System.out.println("El area es: " + area(radio) + " cm.");
				}
				break;
			case 3:
				if (accion == 3) {
					System.out.println("El volumen es: " + volumen(radio) + " cm.");
				}
				break;

			case 4:
				if (accion == 4) {

					System.out.println("La circunferencia es: " + circunferencia(radio));
					System.out.println("El area es: " + area(radio));
					System.out.println("El volumen es: " + volumen(radio));
					break;
				}
			}
			System.out.println("");
		} while (accion != 5); // Todo el proceso anterior se repetira mientras no se introduzca un 5
		System.out.println("Fin el programa");
		
	}

	// Muestra el menú y devuelve el número elegido
	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		// Mostramos el menu
		System.out.println("Introduzca un comando:");
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("3.Volumen");
		System.out.println("4.Todas");
		System.out.println("5-Salir");
		// Guardames la accion y verificamos que sea correcta
		int comando = teclado.nextInt();
		
		while (comando < 1 || comando > 5) {
			System.out.println("Vuelva a introducir un comando:");
			comando = teclado.nextInt();
		}
		return comando;
	}

	// Pide que se introduzca el radio y lo devuelve
	public static double pideRadio() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el radio:");
		double radio = teclado.nextDouble();
		
		return radio;
	}

	// Calcula la circunferencia y la devuelve
	public static double circunferencia(double radio) {
		double circunferencia = ((radio * 2) * Math.PI);
		return circunferencia;
	}

	// Calcula el área y la devuelve
	public static double area(double radio) {
		double area = ((Math.pow(radio, 2)) * Math.PI);
		return area;
	}

	public static double volumen(double radio) {
		double volumen = (Math.pow(radio, 3) * Math.PI);
		volumen = ((volumen * 4) / 3);
		return volumen;
	}
	
}

