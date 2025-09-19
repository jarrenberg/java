/**
 * Programa a la que se introducen tres valores y comprueba que cumplen la ecuacion de pitagoras
 * Jorge Arrenberg 17/11/2024
 */

package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los valores
		
		System.out.println("Introduzca un cateto:");
		float cateto1 = teclado.nextFloat();
		
		System.out.println("Introduzca otro cateto:");
		float cateto2 = teclado.nextFloat();
		
		System.out.println("Introduzca la hipotenusa:");
		float hipotenusa = teclado.nextFloat();
		
		//Mostramos el resultado del metodo
		
		if(calculoPitagoras(cateto1,cateto2,hipotenusa)==true) {
			System.out.println("La terna de valores introducido cumple la ecuacion de Pitagoras");
		}else {
			System.out.println("La terna de valores introducido no cumple la ecuacion de Pitagoras");
		}
		
		teclado.close();
	}
	//Devuelve si la terna de valores cumple la ecuacion de pitagoras
public static boolean calculoPitagoras (float cateto1, float cateto2, float hipotenusa) {
	boolean verificador;
	float ladoIzquierdo, ladoDerecho;
	ladoIzquierdo = (cateto1*cateto1)+(cateto2*cateto2);
	ladoDerecho = hipotenusa*hipotenusa;
	
	if(ladoDerecho==ladoIzquierdo) {
		verificador=true;
	}else {
		verificador=false;
	}
	return verificador;
}
}
