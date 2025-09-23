package ejercicio3;

import java.time.LocalDate;

public class Colegio {

	public static void main(String[] args) {
		Personal personal1;
		try {
			personal1 = new Personal("77773198D", "JORGE", "ARRENBERG", LocalDate.of(2002, 10, 12), 1500.50,
					"622024489", "qopese9@gmail.com", 'H');
			System.out.println(personal1.toString());
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		} catch (NullPointerException ex2) {
			System.out.printf("Error. %s", ex2.getMessage());
		}
		
		Profesor profesor1 = null;
		try {
			profesor1 = new Profesor("77773198D", "RAFA", "ALVAREZ", LocalDate.of(1968, 8, 8), 2000.50,
					"666666666", "rafainformatica@gmail.com", 'H',"Programador","Programacion","Sostenibilidad",false,20);
			System.out.println(profesor1.toString());
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		} catch (NullPointerException ex2) {
			System.out.printf("Error. %s", ex2.getMessage());
		}
		System.out.println(profesor1.toString());
		
		PAS pas1 = null;
		try {
			pas1 = new PAS("77773198D", "JOSE", "PEREZ", LocalDate.of(1968, 8, 8), 2000.50,
					"666999666", "joseinformatica@gmail.com", 'H',true,false,true,2);
			System.out.println(pas1.toString());
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error. %s", ex1.getMessage());
		} catch (NullPointerException ex2) {
			System.out.printf("Error. %s", ex2.getMessage());
		}
		pas1.cambioIdioma("aleman");
		System.out.println(pas1.toString());
	}

}
