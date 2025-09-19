/**
 * Creacion de un reloj que muestra un mensaje depende de la hora
 * Jorge Arrenberg 29/10
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Introducimos el nombre de usuario
		
		System.out.println("Nombre de usuario: ");
		String nombre = teclado.nextLine();
		
		//Introducimos la hora
		
		System.out.println("Introduzca la hora:");
		int hora = teclado.nextInt();
		while (hora<1||hora>24) { //En caso de que la hora no sea un valor correcto, la preguntamos hasta que lo sea y guardamos dicho valor
			System.out.println("Hora incorrecta, introduzca la hora:");
			hora = teclado.nextInt();
		}
		
		//Introducimos los minutos
		
		System.out.println("Introduzca los minutos:");
		int minutos = teclado.nextInt();
		while (minutos<0||minutos>59) {//En caso de que los minutos no sea un valor correcto, la preguntamos hasta que lo sea y guardamos dicho valor
			System.out.println("Minutos incorrectos, introduzca los minutos:");
			minutos = teclado.nextInt();
		}
		
		//Ponemos las condiciones
		
		if ((hora>=0)&&(hora<12)) {
			System.out.println("Buenos dias " + nombre);
		}if(((hora>=12)&&(minutos<=1))&&((hora<=16)&&(minutos<=30))){
			System.out.println("Buena sobremesa " +nombre);
		}if(((hora>=16)&&(minutos>30))&&((hora<=20)&&(minutos<=30))){
			System.out.println("Buena tardes " +nombre);
		}if(((hora>=20)&&(minutos>30))&&(hora<=24)){
			System.out.println("Buena noches " +nombre);
		}
		
		}

	
}
