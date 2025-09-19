package practicaExamen2;

import java.util.Iterator;

public class PracticaExamen2 {

	public static void main(String[] args) {
		int  contCiudad=0;
		double resultadoMedia;
		double mediaMasCaliente=0;
		String [] ciudades = {"Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"};
		int [][] temperaturas = {{29, 17, 32, 28, 22, 18, 25, 12},{26, 26, 13, 20, 31, 16, 32, 27},{23, 32, 31, 10, 33, 34, 24, 21},{26, 36, 28, 11, 11, 39, 40, 13},{27, 12, 20, 10, 39, 34, 15, 17},{19, 32, 35, 39, 17, 14, 11, 34},
		{17, 24, 16, 22, 35, 22, 30, 21}, {15, 17, 31, 32, 22, 35, 38, 13},{39, 35, 14, 26, 19, 26, 13, 19},{20, 38, 30, 22, 34, 19, 10, 14},{36, 13, 33, 27, 31, 25, 10, 23},{27, 38, 36, 40, 36, 24, 22, 25}, {27, 13, 18, 28, 32, 40, 31, 40},
		{20, 17, 26, 21, 11, 36, 25, 12},{32, 23, 17, 23, 39, 26, 24, 23}};
		double medias []=new double [8];
		double temperaturaMinima[]=new double [8];
	
		for (int i = 0; i < 8; i++) {
			double tempMedia=0;
			int sumaTemps=0;
			for (int j = 0; j < 15; j++) {
				sumaTemps = temperaturas[j][i]+sumaTemps;
			}
			resultadoMedia=tempMedia(sumaTemps);
			medias[i]=resultadoMedia;
			System.out.printf("La temperatura media de %s es: %.2f\n",ciudades[i], resultadoMedia);
		}
		System.out.println("");
		

		System.out.println("La ciudad con la media mas alta es: " +ciudades[ciudadCaliente (medias)]);
		System.out.println();

		for (int i = 0; i < 8; i++) {
			int tempMinima=temperaturas[0][i];
			for (int j = 0; j < 15; j++) {
				int almacen = temperaturas[j][i];
				if(temperaturas[j][i]<tempMinima) {
					tempMinima=temperaturas[j][i];
				}
				
			}
			System.out.println("La temperatura minima de " +ciudades[i]+ " es: " +tempMinima);
		}
		
		
	}

	public static double tempMedia(int sumaTemps) {
		double media;
		media =((double)sumaTemps / 15.0);
		return media;

	}

	public static int ciudadCaliente(double[] medias) {
		int contCiudad = 0;
		double mediaAlta = medias[0];
		for (int i = 0; i < 8; i++) {
			if (mediaAlta < medias[i]) {
				mediaAlta = medias[i];
				contCiudad = i;
			}
		}
		return contCiudad;
	}



}
