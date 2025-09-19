/*
 * Clase de testeo para las Clases derivadas de Empleados y Empresa donde se prueban sus constructores y metodos
 * Jorge Arrenberg 09/03/2025 
 * 
 */

package ejercicio4;

public class Programa {

	public static void main(String[] args) {

		Empleados e1 = null, e2 = null, e3=null;
		try {
			e1 = new Empleados("Walter", "12345678X", 1000, 25, "612345678", "Calle Rosa");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.printf("Informacion Empleado: [%s]\n", e1.toString());
		System.out.printf("Sueldo Neto: %.2f\n", e1.sueldoNeto());
		System.out.println();
		try {
			e2 = new Empleados("Marcos", "12345678G", 500, 45, "712345678", "Calle Corto");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		System.out.printf("Informacion Empleado: [%s]\n", e2.toString());
		System.out.printf("Sueldo Neto: %.2f\n", e2.sueldoNeto());
		System.out.println();
		try {
			e3 = new Empleados("Marcos", "12345678G", 500, -4, "712345678", "Calle Corto");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		
		Empresa em1 = null;
		try {
			em1 = new Empresa ("MALAGATRON", "E12345678", "609876543", "Calle Caneibol");
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
		
		System.out.printf("\nAñadiendo empleado ...\n");
		em1.anyadirEmpleado(e1);
		System.out.printf("Numero de empleados: %d\n", em1.getNumEmpleados());
		System.out.printf("Informacion parcial de la plantilla:\n%s",em1.infoPlantillaParcial());
		System.out.printf("Informacion total de la plantilla:\n%s",em1.infoPlantillaTotal());
		
		System.out.printf("\nAñadiendo empleado ...\n");
		em1.anyadirEmpleado(e2);
		System.out.printf("Numero de empleados: %d\n", em1.getNumEmpleados());
		System.out.printf("Informacion parcial de la plantilla:\n%s",em1.infoPlantillaParcial());
		System.out.printf("Informacion total de la plantilla:\n%s",em1.infoPlantillaTotal());
		
		System.out.printf("\nEliminando empleado ...\n");
		em1.eliminarEmpleado();
		System.out.printf("Numero de empleados: %d\n", em1.getNumEmpleados());
		System.out.printf("Informacion parcial de la plantilla:\n%s",em1.infoPlantillaParcial());
		System.out.printf("Informacion total de la plantilla:\n%s",em1.infoPlantillaTotal());
	}

}
