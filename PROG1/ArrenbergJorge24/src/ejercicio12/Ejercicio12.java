package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int contador=1, exponenteNulo=1,valorAbsExp;
		double resultado;
		
		System.out.println("Introduzca la base:");
		int base = teclado.nextInt();
		resultado=base;
		
		System.out.println("Introduzca el exponente:");
		int exponente=teclado.nextInt();
		valorAbsExp=(int)Math.abs(exponente);
		
		if(exponente>0) {
			while(contador<exponente) {
				resultado=base*resultado;
				contador=contador+1;
			}System.out.println(base+" elevado a "+exponente+" = " +resultado);
			
		}else if (exponente<0) {
			while(contador<valorAbsExp) {
				resultado=base*resultado;
				contador=contador+1;
			}System.out.println(base+" elevado a "+exponente+" = "+ (1/resultado));
	
		}else {
			System.out.println(base+" elevado a "+exponente+" = " +exponenteNulo);
		}
		
	}

}
