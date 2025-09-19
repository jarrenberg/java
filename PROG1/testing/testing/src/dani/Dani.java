package dani;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dani {
	public static void main(String[] args) {
		// Crear un objeto LocalTime con la hora 8:00
		LocalTime horaInicioClases = LocalTime.of(8, 0);
		Scanner teclado = new Scanner(System.in);

		// 2. Lectura de teclado de una hora determinada (hora y minutos):
		int horaValida = -1;
		int minutoValido = -1;
		int salir = 0; //Nota de Jorge: Borra esta variable porque no la usas

		System.out.println(" HORARIO DE CLASES ");
		System.out.println("--------------------");
		System.out.println(" ");
		// Nota de Jorge: Tu forma de pedir datos da un resultado correto, pero podrias
		// optimizarlo utilizando un metodo
		/*
		 * public static int numEnIntervalo(Scanner teclado,String mensaje,int max,int min) { 
		 * System.out.println(mensaje);
		 * int num; 
		 * boolean esCorrecto=true;
		 *  
		 * do{
		 * try{ 
		 * System.out.printf(" Introduzca un numero entre %d y %d ",min,max); 
		 * num = teclado.nextInt();
		 * 
		 * if (num < min || num > max) {
		 * System.out.printf(" Error: El numero debe estar entre %d y %d.",min,max);
		 * teclado.nextLine(); //Limpiar el buffer 
		 * esCorrecto=false;
		 *  }
		 *  } catch(InputMismatchException e) {
		 *  esCorrecto=false;
		 * System.out.println(" Error: Debe introducir un numero entero.");
		 * teclado.nextLine(); // Limpiar el buffer 
		 * }
		 * 
		 * }while(esCorrecto==false);
		 *  return num; }
		 */
		// El metodo de arriba te sirve para pedir un numero entero dentro de un
		// intervalo que tu le especifiques como parametros, por lo qu elo puedes copiar
		// y pegar en cualquier codigo que necesite un numero intero dentro de un
		// intervalo. Ejemplo de uso del metodo:
		// int horaValida = numEnIntervalo(teclado,"Introduzca la hora:",1,23);
		// int minutoValido = numEnIntervalo(teclado, "Introduce los minutos:"1,59);

		// Solicitar la hora válida
		while (horaValida < 0 || horaValida > 23) {
			try {
				System.out.print(" Introduzca la hora (entre 0 y 23): ");
				horaValida = teclado.nextInt();

				if (horaValida < 0 || horaValida > 23) {
					System.out.println(" Error: La hora debe estar entre 0 y 23.");
				}
			} catch (InputMismatchException e) {
				System.out.println(" Error: Debe introducir un numero entero.");
				teclado.nextLine(); // Limpiar el buffer
			}
		}
		// Solicitar los minutos válidos
		while (minutoValido < 0 || minutoValido > 59) {
			try {
				System.out.print(" Introduzca los minutos (entre 0 y 59): ");
				minutoValido = teclado.nextInt();

				if (minutoValido < 0 || minutoValido > 59) {
					System.out.println(" Error , Los minutos deben estar entre 0 y 59 ");
				}
			} catch (InputMismatchException e) {
				System.out.println(" Error , debe introducir un numero entero ");
				teclado.nextLine(); // Limpiar el buffer

			}

		}

		// 3. Creación de un segundo objeto de la clase LocalTime con la hora y minuto
		// válidos que se han introducido por teclado.

		LocalTime horaUsuario = LocalTime.of(horaValida, minutoValido);
		

		// Nota de Jorge: para mostrar cada asignatura solo puedes usar la hora introducida por el usuario (horaUsuario) y la de inicio (horaInicioClases)
		// Para eso no hace falta usar la variable diferenciaHoras, sino que debes saber en que hora estas empleando metodos de la clase LocalTime.
		// Dentro del enunciado del ejrcicio Rafa nos dice que metodos hará falta usar en este ejercicio, asi que te metes en la documentacion de la clase
		// LocalTime y miramos q hace cada metodo.
		
		// Ej: sabemos que estamos en programacion porque la hora del usuario es posterior que la hora de inicio y es anterior que la hora de inicio +2
		// sabemos que estamos en sistemas informaticos porque la hora del usuario es posterior que la hora de inicio +2 y anteriora  la hora de inicio -4;
		// sabemos que estamos en entornos de desarrollo porque la hora del usuario es posterior que la hora de inicio + 4 y  anterior la hora de inicio +6
		// sabemos que las clases han terminado porque la hora del usuario es posterior que la hora de inicio + 6
		// y sabemos q no han empezado las clases porque lahora del usuario es anterior a la hora de inicio
		
		// Al hacer esto tienes que tratar las posibles excepciones que nos lanzan los metodos utilizados de la clase LocalDate con un try/catch
		
		String claseActual;
		int diferenciaHoras = horaUsuario.getHour() - horaInicioClases.getHour();

		// Determinar en qué clase se encuentra según el rango de horas
		// Determinar la clase según la diferencia de horas
		if (diferenciaHoras >= 0 && diferenciaHoras < 2) {
			claseActual = "PROGRAMACION";
		} else if (diferenciaHoras >= 2 && diferenciaHoras < 4) {
			claseActual = "SISTEMAS INFORMATICOS";
		} else if (diferenciaHoras >= 4 && diferenciaHoras < 6) {
			claseActual = "ENTORNOS DE DESARROLLO";
		} else {
			claseActual = "NO HAY CLASE";
		}

		// Usar un switch para mostrar el resultado

		switch (claseActual) {

		case "PROGRAMACION":
			System.out.println("La clase actual es: PROGRAMACION");
			break;
		case "SISTEMAS INFORMATICOS":
			System.out.println("La clase actual es: SISTEMAS INFORMATICOS");
			break;
		case "ENTORNOS DE DESARROLLO":
			System.out.println("La clase actual es: ENTORNOS DE DESARROLLO");
			break;
		default:
		case "No hay clases":

			LocalTime finClases = LocalTime.of(14, 0); //Solo puedes usar dos objetos localtime, horaInicioClases y horaUsuario, por lo que este sobraria
			System.out.println(" NO HAY CLASES" + horaUsuario.isAfter(finClases));
			System.out.println("Hora introducida:" + horaUsuario.getHour() + ":" + horaUsuario.getMinute()); //Debes usar DateTimeFormatter para mostrar la hora como pide Rafa
			//Nota de Jorge: Rafa dice en la retroalimentacion que muestres la horaUsuario con el formato H:mm
			//Esto debes  hacerlo creando un formato con la clase DateTimeFormatter, que viene en los apuntes del tema 5
			// en el apartado de trabajar con fechas y horas

		}
	}
}
