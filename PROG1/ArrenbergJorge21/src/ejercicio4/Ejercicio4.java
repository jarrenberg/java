/**
 * Ejercicio sobre la estructura if-else
 * Jorge Arrenberg 08/10/202
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del usuario:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca los apellidos del usuario:");
		String apellidos = teclado.nextLine();
		
		System.out.println("Valor del primer importe:");
		float importe1 = teclado.nextFloat();
		
		System.out.println("Valor del segundo importe:");
		float importe2 = teclado.nextFloat();
		
		System.out.println("Valor del tercer importe:");
		float importe3 = teclado.nextFloat();
		
		System.out.println("Valor del cuarto importe:");
		float importe4 = teclado.nextFloat();
		
		float suma = (importe1+importe2+importe3+importe4);
		
		float importeMedio = (suma/4);
		
		if (suma>300){
			System.out.println("Nombre: " +nombre);
			System.out.println("Apellidos: " +apellidos);
			System.out.println("Importe Gastado 1: " +importe1);
			System.out.println("Importe Gastado 2: " +importe2);
			System.out.println("Importe Gastado 3: " +importe3);
			System.out.println("Importe Gastado 4: " +importe4);
			System.out.println("Importe Medio: " +importeMedio);
			System.out.println("Sus compras han superado los 300 euros este mes, asi que dispone de descuento de 50€.");
		}else {
			System.out.println("Nombre: " +nombre);
			System.out.println("Apellidos: " +apellidos);
			System.out.println("Importe Gastado 1: " +importe1);
			System.out.println("Importe Gastado 2: " +importe2);
			System.out.println("Importe Gastado 3: " +importe3);
			System.out.println("Importe Gastado 4: " +importe4);
			System.out.println("Importe Medio: " +importeMedio);
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}
	}
}		
