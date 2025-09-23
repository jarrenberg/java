/**
 * Ejercicio para practicar bucles for y estructuras iterativas en el que se nos pide introducir datos y distancias
 * para realizar operaciones aritmaticas y mostrar los resultados
 * Jorge Arrenberg 19/10/2024
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float mayorDistancia = 0;
		int numRegistros = 5;
		float sumaDistancias = 0;
		float mediaDistancias = 0;
		int letrasCiudad;
		int letrasCiudadLarga = 0;
		String ciudadLarga = " ";

		System.out.println("Introduzca el nombre");
		String nombre = teclado.nextLine();

		System.out.println("Introduzca el apellido");
		String apellidos = teclado.nextLine();

		System.out.println("Introduzca la edad (entre 17 y 45 años)");
		byte edad = teclado.nextByte();
		while (edad < 17 || edad > 45) {
			System.out.println("Esa edad no es correcta, vuelva a introducirla");
			edad = teclado.nextByte();
		}

		System.out.println("Introduzca el numero de rutas realizadas");
		int numRutas = teclado.nextInt();
		// Introduzco la siguiente condicion para que no se introduzcan numeros de ruta
		// negativas, y en caso de hacerlo se vuelva a pedir un valor hasta que sea
		// positivo
		// y se guarde en la variable numRutas
		while (numRutas < 0) {
			System.out.println("El numero de rutas no puede ser menor que 0, vuelva a introducir el numero de rutas");
			numRutas = teclado.nextInt();
		}

		System.out.println("Introduzca la distancia de la ultima ruta recorrida en KM");
		float distancia = teclado.nextFloat();
		// Introduzco la siguiente condicion para que no se introduzcan distancias
		// negativas, y en caso de hacerlo se vuelva a pedir un valor hasta que sea
		// positivo
		// y se guarde en la variable distancia
		while (distancia < 0) {
			System.out.println("La distancia no puede ser menor que 0, vuelva a introducir la distancia en KM");
			distancia = teclado.nextFloat();
		}

		for (int i = 0; i < numRegistros; i++) {
			System.out.println("Introduzca la distancia en KM de la ruta " + (i + 1)
					+ " (en caso de haber realizado menos de " + numRegistros
					+ " rutas, introduzca 0 en los numero de rutas que no haya realizado)" + ":");
			float distanciaRuta = teclado.nextFloat();
			// Introduzco la siguiente condicion para que no se introduzcan distancias
			// negativas, y en caso de hacerlo se vuelva a pedir un valor hasta que sea
			// positivo
			// y se guarde en la variable distanciaRuta
			while (distanciaRuta <= 0) {
				System.out.println(
						"La distancia de la ruta introducida es incorrecta, vuelva a introducir la distancia en KM");
				distanciaRuta = teclado.nextFloat();
			}
			if (distanciaRuta > mayorDistancia) {
				mayorDistancia = distanciaRuta;
			}
			sumaDistancias = sumaDistancias + distanciaRuta;
			if (numRegistros > 0) { // Incluyo esta condicion para que en caso de que el numRegistros fuera 0, no se
									// divida entre 0 porque da error
				mediaDistancias = (sumaDistancias / numRegistros);
			}
		}

		for (int i = 0; i < numRegistros; i++) {
			System.out.println("Introduzca en numero de participantes que participaron en la ruta " + (i + 1) + ":");
			int participantes = teclado.nextInt();
			teclado.nextLine();
			// Introduzco esta condicion para que en caso de de introducir particiapantes
			// menores que 1, nos vuelva a pedir un valor para estos y lo guarde en la
			// variable participantes
			while (participantes < 1) {
				System.out.println(
						"El numero de participantes no puede ser menor a 1. Vuelva a introducir el numero de particantes de la ruta "
								+ (i + 1) + ":");
				participantes = teclado.nextInt();
				teclado.nextLine();
			}
		}
		for (int i = 0; i < numRegistros; i++) {
			System.out.println("Introduzca la ciudad donde se realizo la ruta " + (i + 1) + ":");
			String ciudad = teclado.nextLine();
			letrasCiudad = ciudad.length();
			// para que la ciudad mas larga se guarde, calculo su longitud con el metodo
			// .length y en caso de que la longitud de esa palabra sea
			// la mayor, guardo el nombre de la ciudad en la variable ciudadLarga
			if (letrasCiudad > letrasCiudadLarga) {
				letrasCiudadLarga = letrasCiudad;
				ciudadLarga = ciudad;
			}

		}

		System.out.println("------------------------------------------------------");
		System.out.println("Nombre: " + nombre + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Numero de rutas realizadas: " + numRutas);
		System.out.println("");
		System.out.println("Distancia media (5 ultimas rutas): " + mediaDistancias + " km.");
		System.out.println("Distancia mas larga de las ultimas 5 rutas: " + mayorDistancia + " km.");
		System.out.println("Ciudad de la ruta mas larga: " + ciudadLarga);
		System.out.println("------------------------------------------------------");
	}

}
