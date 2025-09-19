package metodos;

import java.util.Scanner;

public class Aleatorios {

	public static void main(String[] args) {
		int notaEntera;
		double nota, notaDesplazamiento;	
		
		nota = notaAleatoria(40);
		System.out.println(nota);
		notaEntera = notaAleatoriaEntera(40);
		System.out.println(notaEntera);
		
		notaDesplazamiento = notaConDesplazamiento(45,5);
		System.out.println(notaDesplazamiento);
		
	}

	
	// Devuelve notas aleatorias entre 0 y 10
	public static double notaAleatoria(int intervalo) {
		double numero;
		numero = Math.random();
		numero = numero*intervalo;
		return numero;
	}

	// Devuelve una nota aleatoria entera
	public static int notaAleatoriaEntera(int intervalo) {
		int notaEntera;
		double notaDecimal =notaAleatoria(intervalo);
		notaEntera= (int) Math.round(notaDecimal);
		return notaEntera;
	}
	//Devuelve nota aleatoria con desplazamiento
		public static double notaConDesplazamiento(int intervalo, int desplazamiento) {
			double notaAleatoria;
			notaAleatoria=notaAleatoria(intervalo)+desplazamiento;
			return notaAleatoria;
		}
		
}
