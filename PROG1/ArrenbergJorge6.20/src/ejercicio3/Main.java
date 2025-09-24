/*
 * Utilizacion de la clase empleado y sus metodos
 * Jorge Arrenberg 21/01/2025
 */
package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Cree un empleado con la información mínima (empleado1)
		System.out.printf("Creando empleado1 ...\n\n");
		Empleado empleado1 = new Empleado("77664422C", "Jorge", "Arrenberg Andrade");

		// Cree un empleado con toda la información (empleado2)
		System.out.printf("Creando empleado2 ...\n\n");
		Empleado empleado2 = new Empleado("12345678P", "Juan", "Benitez Suarez", 1400.50, 6.2, 12, 17, false, (byte) 0);

		// Para el empleado1, solicitar por teclado el sueldo base y horas extra
		// realizadas en el mes.
		// Modificar dicha información en el objeto teniendo en cuenta que no puede ser
		// negativa
		// (excepciones) y calcular su sueldo mostrando el resultado detallado.
		double sueldoBase = pedirDouble(teclado, "Introduzca el sueldo base del empleado1:");
		int horasExtras = pedirEntero(teclado, "Introduzca el numero de horas extras realizadas por el empleado1:");
		double pagoHoraExtra = pedirDouble(teclado, "Introduzca el pago por hora extra del empelado1:");
		double sueldoFinal = empleado1.sueldoFinal(
				empleado1.sueldoBruto(sueldoBase, empleado1.retencionIRPF(empleado1.getTipoIRPF())), horasExtras,
				pagoHoraExtra);
		System.out.printf("El sueldo final del empleado1 es: %.2f.\n", sueldoFinal);
		try {
			empleado1.setHorasExtrasRealizadas(horasExtras);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		try {
			empleado1.setPagoHoraExtra(pagoHoraExtra);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		try {
			empleado1.setSueldoBase(sueldoBase);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}

		// Clonar al empleado 2 (empleado3)
		System.out.printf("Creando empleado3 clonando al empleado2 ...\n\n");
		Empleado empleado3 = Empleado.copia(empleado2);

		// Para el empleado3, solicitar por teclado el sueldo base, horas extra
		// realizadas en el mes y
		// mostrar su información económica.
		sueldoBase = pedirDouble(teclado, "Introduzca el sueldo base del empleado3:");
		horasExtras = pedirEntero(teclado, "Introduzca el numero de horas extras realizadas por el empleado3:");
		pagoHoraExtra = pedirDouble(teclado, "Introduzca el pago por hora extra del empelado3:");
		try {
			empleado3.setHorasExtrasRealizadas(horasExtras);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		try {
			empleado3.setPagoHoraExtra(pagoHoraExtra);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}
		try {
			empleado3.setSueldoBase(sueldoBase);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		}

		// Mostrar todos los empleados y su número total.
		System.out.printf("\nNumero total de empleados: %d\n", Empleado.getCantidadEmpleados());
		empleado1.verTodoEmpleado();
		empleado2.verTodoEmpleado();
		empleado3.verTodoEmpleado();

	}

	// Devuelve un numero entero treatando excepciones
	public static int pedirEntero(Scanner tecla, String mensaje) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextInt();
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.println("Te has equivocado. Por favor, ingresa un número válido.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}

	// Devuelve un valor double tratando las posibles excepcionse
	public static double pedirDouble(Scanner tecla, String mensaje) {
		boolean correcto = false;
		double numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				System.out.println(mensaje);
				numero = tecla.nextDouble();
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.println("Te has equivocado. Por favor, ingresa un número válido.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);

		return numero;
	}
}
