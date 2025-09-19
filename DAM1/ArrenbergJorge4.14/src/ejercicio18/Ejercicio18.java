/**
 * Programa que calcula la letra del DNI siguiendo una formula
 * Jorge Arrenberg 17/11/2024
 */

package ejercicio18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio18 {
	
	//[0-9]{8}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario su DNI

		System.out.println("Introduzca su DNI:");
		 String DNI = teclado.nextLine();
		 
		 String patron = "[0-9]{8}"; 
		 if (DNI.matches(patron)) {
			 int numDNI = Integer.valueOf(DNI);
				System.out.println("La letra de su DNI es: " + letraDNI(numDNI));
		 }
		 

		 else {
		     while(DNI.matches(patron)==false) {
		    	 System.out.println("Formato incorrecto, introduzca el DNI");
		    	 DNI=teclado.nextLine();
		     }
		 }
		
		teclado.close();
	}
	// Devuelve la letra del DNI
	public static char letraDNI(int numDNI) {
		char letraDNI=' ';
		// Calculamos el resto de dividir el numero del DNI entre 23
		int resto = (numDNI % 23);
		
		//Asignamos una letra dependiendo del resto de la operacion
		switch (resto) {
		case 0:
			letraDNI='T';
			break;
		case 1:
			letraDNI='R';
			break;
		case 2:
			letraDNI='W';
			break;
		case 3:
			letraDNI='A';
			break;
		case 4:
			letraDNI='G';
			break;
		case 5:
			letraDNI='M';
			break;
		case 6:
			letraDNI='Y';
			break;
		case 7:
			letraDNI='F';
			break;
		case 8:
			letraDNI='P';
			break;
		case 9:
			letraDNI='D';
			break;
		case 10:
			letraDNI='X';
			break;
		case 11:
			letraDNI='B';
			break;
		case 12:
			letraDNI='N';
			break;
		case 13:
			letraDNI='J';
			break;
		case 14:
			letraDNI='Z';
			break;
		case 15:
			letraDNI='S';
			break;
		case 16:
			letraDNI='Q';
			break;
		case 17:
			letraDNI='V';
			break;
		case 18:
			letraDNI='H';
			break;
		case 19:
			letraDNI='L';
			break;
		case 20:
			letraDNI='C';
			break;
		case 21:
			letraDNI='K';
			break;
		case 22:
			letraDNI='E';
			break;
		}
return letraDNI;
	}
}
