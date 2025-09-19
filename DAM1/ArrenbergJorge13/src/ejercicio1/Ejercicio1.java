/**
 * Ejercicio sobre realizar operaciones simples
 * Jorge Arrenberg Andrade 4/10/2024
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		String nombre = teclado.nextLine();
		
		System.out.println("¿Cómo te apllidas?");
		String apellidos = teclado.nextLine();
		
		System.out.println("¿Cual es tu fecha de nacimiento? (DD/MM/AAAA)");
		String cumple = teclado.nextLine();
		
		System.out.println("¿Cual es tu salario bruto?");
		float  salarioBruto = teclado.nextFloat();
		
		System.out.println("¿Cuantos años llevas trabajando en la empresa?");
		int  annosTrabajados = teclado.nextInt();

		double salarioNeto = salarioBruto - (salarioBruto*0.15);
		double aumento = annosTrabajados*2;
		double aumentoPercent = salarioNeto*(aumento/100);
		double salarioTotal = salarioNeto + aumentoPercent;
		
		System.out.println("Estimado " +nombre+" "+apellidos+ ", su salario es " +salarioBruto+ "€, teniendo en cuenta un IRPF del 15%, su salario neto es " +salarioNeto+"€.");
		System.out.println("Debido a sus " +annosTrabajados+ " años trabajando en la empresa, su salario incrementara un 2% anual. El aumento es de " + aumento+ "% y el salario total es " +salarioTotal+ "€." );
	}

}
