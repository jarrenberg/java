/**
 * Porgrama que calcula si un usuario es candidato a una beca o no
 * Jorge Arrenberg 21/11/2024
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Pedimos los datos al usuario
		
		System.out.println("Introduzca su edad:");
		byte edad = teclado.nextByte();
		
		System.out.println("Introduzca su nota académica:");
		float nota = teclado.nextFloat();
		
		System.out.println("Introduzca su nivel de renta:");
		int renta = teclado.nextInt();
		
		System.out.println("Introduzca su nivel de idioma (true=valido/false=invalido)");
		boolean idioma = teclado.nextBoolean();
		System.out.println(idioma);
		
		//Usamos el metodo para saber si con los datos introducidos el usuario es apto para la beca
		
		if (aptitudBeca(edad,nota,renta,idioma)==false) {
			System.out.println("Usted no es apto para la beca");
		}else {
			System.out.println("Usted es apto para la beca");
		}

	}
//Devuelve si un usuario es apto para recibir una beca
	public static boolean aptitudBeca (byte edad, float nota, int renta, boolean idioma) {
		boolean aptitudBeca = true;
		
		if((nota>=6 && nota<=8) && (renta<20000)) {
			aptitudBeca=true;
		}
		if(nota>9) {
			aptitudBeca=true;	
		}
		if(idioma==false) {
			aptitudBeca=false;
		}
		if(edad>30) {
			aptitudBeca=false;
		}
		if(nota<5) {
			aptitudBeca=false;
		}
		if((nota>=6 && nota<=8) && (renta>20000)) {
			aptitudBeca=false;
		}

		return aptitudBeca;
	}
	
	
}