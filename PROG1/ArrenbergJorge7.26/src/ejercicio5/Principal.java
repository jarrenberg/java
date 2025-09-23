/*
 * Clase de testeo para las Clases derivadas de Vehiculo donde se prueban sus constructores y metodos
 * Jorge Arrenberg 09/03/2025 
 * 
 */

package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		Terrestre t1, t2;
		try {
			System.out.println("Creando vehiculo terrestre 1");
			t1 = new Terrestre("1234ABC", "Generico", 3);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo terrestre por defecto ...");
			t1 = new Terrestre("1234ABC", "Generico", 3);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo terrestre por defecto ...");
			t1 = new Terrestre("1234ABC", "Generico", 3);
		}
		System.out.println(t1.toString());
		System.out.println();

		try {
			System.out.println("Creando vehiculo terrestre 2");
			t2 = new Terrestre("1234AdBC", "Prueba", 3);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo terrestre por defecto ...");
			t2 = new Terrestre("1234ABC", "Prueba", 5);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo terrestre por defecto ...");
			t2 = new Terrestre("1234ABC", "Prueba", 5);
		}
		System.out.println(t2.toString());

		System.out.printf("\n\n");
		Acuatico ac1, ac2;
		try {
			System.out.println("Creando vehiculo acuatico 1");
			ac1 = new Acuatico("NAFTA", "ACUATICO GENERICO", 7);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo acuatico por defecto ...");
			ac1 = new Acuatico("PRUEBA", "Generico", 3);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo acuatico por defecto ...");
			ac1 = new Acuatico("PREUBA", "Generico", 3);
		}
		System.out.println(ac1.toString());
		System.out.println();

		try {
			System.out.println("Creando vehiculo acuatico 2");
			ac2 = new Acuatico("a", "ACUATICO 2", 3);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo acuatico por defecto ...");
			ac2 = new Acuatico("PREUBA", "Generico", 3);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo acuatico por defecto ...");
			ac2 = new Acuatico("PREUBA", "Generico", 3);
		}
		System.out.println(ac2.toString());
		System.out.printf("\n\n");

		Aereo a1, a2;
		try {
			System.out.println("Creando vehiculo aereo 1");
			a1 = new Aereo("TENG098765", "AEREO GENERICO", 100);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo aereo por defecto ...");
			a1 = new Aereo("TENG098765", "Generico", 50);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo aereo por defecto ...");
			a1 = new Aereo("TENG098765", "Generico", 50);
		}
		System.out.println(a1.toString());
		System.out.println();

		try {
			System.out.println("Creando vehiculo aereo 2");
			a2 = new Aereo("ABCD12345", "ACUATICO 2", 3);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo aereo por defecto ...");
			a2 = new Aereo("TENG098765", "Prueba", 50);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando vehiculo terrestre por defecto ...");
			a2 = new Aereo("TENG098765", "Prueba", 50);
		}
		System.out.println(a2.toString());
		System.out.printf("\n\n");

		// Preguntar a rafa por que me falla la matricula del coche y el metodo
		// verificar matricula 7.26
		try {
			System.out.println("Creando coche 1");
			t1 = new Coches("1234ABC", "Generico", 3, true);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando coche por defecto ...");
			t1 = new Coches("1234ABC", "Generico", 3, true);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando coche por defecto ...");
			t1 = new Coches("1234ABC", "Generico", 3, true);
		}
		System.out.println(t1.toString());
		System.out.println();

		try {
			System.out.println("Creando coche 2");
			t2 = new Coches("1234AdBC", "Prueba", 3, false);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando coche por defecto ...");
			t2 = new Coches("1234ABC", "Prueba", 5, false);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando coche por defecto ...");
			t2 = new Coches("1234ZYX", "Prueba", 5, false);
		}
		System.out.println(t2.toString());

		System.out.printf("\n\n");

		try {
			System.out.println("Creando moto 1");
			t1 = new Motos("1234ABC", "Generico", 3, "Verde");
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando moto por defecto ...");
			t1 = new Motos("1234ABC", "Generico", 3, "Verde");
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando moto por defecto ...");
			t1 = new Motos("1234ABC", "Generico", 3, "Verde");
		}
		System.out.println(t1.toString());
		System.out.println();

		try {
			System.out.println("Creando moto 2");
			t2 = new Motos("1234ABC", "Prueba", 3, "");
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando moto por defecto ...");
			t2 = new Motos("1234ABC", "Prueba", 5, "Verde");
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando moto por defecto ...");
			t2 = new Motos("1234ZYX", "Prueba", 5, "Verde");
		}
		System.out.println(t2.toString());

		System.out.printf("\n\n");

		try {
			System.out.println("Creando barco 1");
			ac1 = new Barcos("NAFTA", "ACUATICO GENERICO", 7, false);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando barco por defecto ...");
			ac1 = new Barcos("PRUEBA", "Generico", 3, false);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando barco por defecto ...");
			ac1 = new Barcos("PREUBA", "Generico", 3, false);
		}
		System.out.println(ac1.toString());
		System.out.println();

		try {
			System.out.println("Creando barco 2");
			ac2 = new Barcos("a", "ACUATICO 2", 3, true);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando barco por defecto ...");
			ac2 = new Barcos("PREUBA", "Generico", 3, true);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando barco por defecto ...");
			ac2 = new Barcos("PREUBA", "Generico", 3, true);
		}
		System.out.println(ac2.toString());
		System.out.printf("\n\n");

		try {
			System.out.println("Creando submarino 1");
			ac1 = new Submarinos("NAFTA", "ACUATICO GENERICO", 7, 500);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando submarino por defecto ...");
			ac1 = new Submarinos("PRUEBA", "Generico", 3, 500);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando submarino por defecto ...");
			ac1 = new Submarinos("PREUBA", "Generico", 3, 500);
		}
		System.out.println(ac1.toString());
		System.out.println();

		try {
			System.out.println("Creando submarino 2");
			ac2 = new Submarinos("ABCD", "ACUATICO 2", 3, -77);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando submarino por defecto ...");
			ac2 = new Submarinos("ABCD", "Generico", 3, 760);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando submarino por defecto ...");
			ac2 = new Submarinos("ABCD", "Generico", 3, 760);
		}
		System.out.println(ac2.toString());
		System.out.printf("\n\n");

		try {
			System.out.println("Creando avion 1");
			a1 = new Aviones("TENG098765", "AEREO GENERICO", 100, 65.7);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando avion por defecto ...");
			a1 = new Aviones("TENG098765", "Generico", 50, 65.7);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando avion por defecto ...");
			a1 = new Aviones("TENG098765", "Generico", 50, 65.7);
		}
		System.out.println(a1.toString());
		System.out.println();

		try {
			System.out.println("Creando avion 2");
			a2 = new Aviones("ABCD123456", "ACUATICO 2", 3 , -5);
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando avion por defecto ...");
			a2 = new Aviones("TENG098765", "Prueba", 50,65.7);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Generando avion por defecto ...");
			a2 = new Aviones("TENG098765", "Prueba", 50,65.7);
		}
		System.out.println(a2.toString());
		System.out.printf("\n\n");

	}

}
