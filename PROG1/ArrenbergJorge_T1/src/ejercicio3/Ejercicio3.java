/**
 * Programa que calcula el dia mas lluvioso de cada municipio, el municipio donde llovio mas cada dia,
 * el dia mas lluvioso en el conjunto de municipios y que te dice si llovio un dia en un municipio
 */

package ejercicio3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int municipio=0;
		int [][] tabla = {{0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22},{24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29}, {17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32},
				{2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32},{0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3},{18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36},
				{1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64},{7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0},{3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 7, 130, 43},{4, 33, 1, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 10, 20, 31}};
		
		String[]ciudades = {"MIJAS", "UBRIQUE", "PUJERRA", "OJEN", "MALAGA", "RONDA", "COIN", "TORROX", "ARDALES", "MARBELLA"};
		
		//Mostramos el dia con mas precipitaciones del municipio
		for (int i = 0; i <10; i++) {
			System.out.println("La precipitacion maxima en " + ciudades[i]+ " fue " +diaPrecMax(tabla,i));
			
		}
		
		//Mostramos en que municipio llovio mas cada dia
		
	
		
		//Mostramos el dia mas lluviioso en global
		System.out.println("");
		System.out.println("El dia mas lluvioso fue " + diaMasPrecipitaciones(tabla));
		
		//Pregunjtamos al usario un dia y un municipio y mostramos si llovio
		
		System.out.println("Introduzca un municipio");
		String ciudad = teclado.nextLine();
		System.out.println("Introduzca un dia");
		int dia = teclado.nextInt();
		dia=dia-16;
		
		if(ciudad.equalsIgnoreCase("mijas")) {
			municipio = 0;
		}
		if(ciudad.equalsIgnoreCase("ubrique")) {
			municipio = 1;
		}
		if(ciudad.equalsIgnoreCase("pujerra")) {
			municipio = 2;
		}
		if(ciudad.equalsIgnoreCase("ojen")) {
			municipio = 3;
		}
		if(ciudad.equalsIgnoreCase("malaga")) {
			municipio = 4;
		}
		if(ciudad.equalsIgnoreCase("ronda")) {
			municipio = 5;
		}
		if(ciudad.equalsIgnoreCase("coin")) {
			municipio = 5;
		}
		if(ciudad.equalsIgnoreCase("torrox")) {
			municipio = 7;
		}
		if(ciudad.equalsIgnoreCase("ardales")) {
			municipio = 8;
		}
		if(ciudad.equalsIgnoreCase("marbella")) {
			municipio = 9;
		}
		
		if(afirmaLluvia(tabla,municipio,dia)==true) {
			System.out.println("Ese dia llovio");
		}else {
			System.out.println("Ese dia no llovio");
		}

	}
	
		
	
	//Devieñve el dia mas lluvioso de cada municipio
	public static int diaPrecMax (int [][]tabla, int i) {
		int precMax=0;
		int diaPrecMax=0;
		for (int j = 0; j < 16; j++) {
			int precipitaciones = tabla[i][j];
			if(precipitaciones>precMax) {
				precMax = precipitaciones;
				diaPrecMax=j+16;
			}
			
		}
		return diaPrecMax;
	}
	
	//Devuelve el dia mas lluvioso de todos los municipios
	
	public static int diaMasPrecipitaciones (int [][]tabla) {
		int diaMasPrec=0;
		int mediaMax=0;
		
		for (int i = 0; i < 16; i++) {
			int suma=0;
			for (int j = 0; j < 10; j++) {
				suma = suma+ tabla[j][i];
			
			}
			int media=suma/10;
			if(media>mediaMax) {
				mediaMax=media;
				diaMasPrec=i+16;
			}
		}
		
		return diaMasPrec;
	}
	
	//Devuelve una afirmacion o negacion sobre si llovio ese dia
	
	public static boolean afirmaLluvia (int [][] tabla, int x, int y) {
		boolean afirmaLluvia;
		if(tabla[x][y]>0) {
			afirmaLluvia=true;
		}else {
			afirmaLluvia=false;
		}
		return afirmaLluvia;
	}
}

