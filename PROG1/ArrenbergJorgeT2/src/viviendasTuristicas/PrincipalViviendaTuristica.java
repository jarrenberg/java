/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 11/03/2025
 * Autor: Jorge Arrenberg
 */
package viviendasTuristicas;

import java.time.LocalDate;

public class PrincipalViviendaTuristica {

	public static void main(String[] args) {

		// 1. Crea un apartamento con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 1 ============");
		Apartamento ap = new Apartamento();
		System.out.println(ap.toString());
		System.out.println();

		// 2. Calcula el precio para una estancia de 3 días.
		// Evidencia: el precio de la estancia.
		System.out.println(" 2 ============");
		double precio = 0;
		try {
			precio = ap.calcularPrecio(3);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		System.out.printf("Precio de la estancia por 3 dias: %.2f€", precio);
		System.out.println();
		
		// 3. Crea un apartamento con precio por noche (valor solicitado al usuario) y
		// distancia al centro (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println(" 3 ============");
		System.out.println("Introduzca un precio por noche");
		double precioUser = Entrada.real();
		
		System.out.println("Introduca la distancia al centro:");
		int distanciaUser = Entrada.entero();
		
		Apartamento ap2 = new Apartamento(Vivienda.DIRECCION_DEFAULT,precioUser,Vivienda.DISPONIBLE_DEFAULT,Apartamento.HABITACION_DEFAULT,distanciaUser,Apartamento.ULTIMA_REFORMA_DEFAULT);
		System.out.println(ap2.toString());

		// 4. Calcula el precio para una estancia de 5 días.
		// Evidencia: el precio de la estancia.
		System.out.println(" 4 ============");
		double precio2 = 0;
		try {
			precio2 = ap2.calcularPrecio(5);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		System.out.printf("Precio de la estancia por 5 dias: %.2f€", precio2);
		System.out.println();

		// 5. Crea una casa rural con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 5 ============");
		CasaRural cr1 = new CasaRural ();
		System.out.println(cr1.toString());

		// 6. Crea una casa rural con precio por noche (valor solicitado al usuario) y
		// el resto por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 6 ============");
		System.out.println("Introduzca el precio por noche:");
		double precioUser2 = Entrada.real();
		CasaRural cr2 = new CasaRural (Vivienda.DIRECCION_DEFAULT,precioUser2,Vivienda.DISPONIBLE_DEFAULT,CasaRural.METROS_DEF,CasaRural.FECHA_CONSTRUCCION_DEFAULT,CasaRural.ADMITE_MASCOTAS_DEF);
		System.out.println(cr2.toString());

		// 7. Calcula el precio de una estancia de 10 días.
		// Evidencia: el precio de la estancia.
		System.out.println(" 7 ============");
		double precio3 = 0;
		try {
			precio3 = cr2.calcularPrecio(10);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		
		System.out.printf("Precio de la estancia por 10 dias: %.2f€", precio3);
		System.out.println();

		// 8. Modifica la fecha de construcción a 1/1/2023.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 8 ============");
		LocalDate f = LocalDate.of(2023, 01, 01);
		cr2.setFechaConstruccion(f);
		System.out.println(cr2.toString());
		

		// 9. Indica si la casa es pet friendly.
		// Evidencia. Indica si es "pet friendly".
		System.out.println(" 9 ============");
		if (cr2.esPetFriendly()){
			System.out.printf("La casa [ %s ] es pet friendly.\n",cr2.toString());
		}else {
			System.out.printf("La casa [ %s ] no es pet friendly.\n",cr2.toString());
		}

		// 10. Crea un hotel con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 10 ============");
		Hotel h1 = new Hotel();
		System.out.println(h1.toString());

		// 11. Crea un hotel con todos los valores solicitados al usuario. (el objeto
		// debe ser creado por un método)
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 11 ============");
		Hotel h2 = crearHotel();
		System.out.println(h2.toString());

		// 12. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println(" 12 ============");
		double precio4 = 0;
		try {
			precio4 = h2.calcularPrecio(1);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		
		System.out.printf("Precio de la estancia por 1 dias: %.2f€", precio4);
		System.out.println();

		// 13. Modifica el valor de Spa a sí.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println(" 13 ============");
		h2.setTieneSpa(true);
		System.out.println(h2.toString());

		// 14. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println(" 14 ============");
		double precio5 = 0;
		try {
			precio5 = h2.calcularPrecio(1);
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		
		System.out.printf("Precio de la estancia por 1 dias: %.2f€", precio5);
		System.out.println();

		// 15. Calcula el número de viviendas creadas.
		// Evidencia. El número de viviendas creadas.
		System.out.println(" 15 ============");
		System.out.printf("Numero de viviendas creadas: %d",Vivienda.getViviendasTuristicas());

	}
	
	public static Hotel crearHotel() {
		System.out.println("Introduce la direccion:");
		String direccion = Entrada.cadena();
		
		System.out.println("Introduce el precio por noche:");
		double precioNoche = Entrada.real();
		
		System.out.println("Escribe 1 si esta disponible o 0 si no:");
		int disp = Entrada.entero();
		boolean disponible;
		if(disp==1) {
			disponible = true;
		}else {
			disponible = false;
		}
		
		System.out.println("Introduce el numero de estrellas:");
		int estrellas = Entrada.entero();
		
		System.out.println("Introduce el numero de habitaciones:");
		int habitaciones = Entrada.entero();
		
		System.out.println("Escribe 1 si tiene SPA o 0 si no:");
		int spa1 = Entrada.entero();
		boolean spa;
		if(spa1==1) {
			spa = true;
		}else {
			spa = false;
		}
		
		Hotel resultado = new Hotel (direccion,precioNoche,disponible,estrellas,habitaciones,spa);
		return resultado;
	}

}
