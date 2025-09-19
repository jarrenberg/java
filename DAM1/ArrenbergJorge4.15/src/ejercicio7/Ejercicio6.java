/**
 * Programa al que se le intrducen datos y se le realiza una audotoria. La empresa aprobrara la auditoria si cumple las condidicones
 * Jorge Arrenberg 22/11/2024
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedimos los datos al usuario

		System.out.println("Introduzca el salario del jefe");
		int salarioJefe = teclado.nextInt();

		System.out.println("Introduzca el salario del encargado");
		int salarioEncargado = teclado.nextInt();

		System.out.println("Introduzca el salario de los oficinistas");
		int salarioOficinistas = teclado.nextInt();

		System.out.println("Introduzca el numero de oficinistas");
		int numeroOficinistas = teclado.nextInt();

		System.out.println(
				"Introduzca 'true ' si los proyectos estan terminados y 'false' si los proyectos no estan terminados");
		boolean proyectosTerminados = teclado.nextBoolean();

		System.out.println("Introduzca el presupuesto de la empresa");
		int presupuestoEmpresa = teclado.nextInt();

		// Mostramos por pantalla el resultado de la auditoria
		
		if(auditoriaValida(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados,
				presupuestoEmpresa)==false) {
		System.out.println("Has suspendido la auditoria");
		}

	}

//Devuelve el resultado de la auditoria a la empresa
	public static boolean auditoriaValida(int salarioJefe, int salarioEncargado, int salarioOficinistas,
			int numeroOficinistas, boolean proyectosTerminados, int presupuestoEmpresa) {
		boolean apruebaAuditoria = true;
		if (proyectosTerminados == false) {
			apruebaAuditoria = false;
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
		}
		if (proyectosTerminados == true) {
			int gastoTotal = (salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas));
			if (gastoTotal > 20000) {
				apruebaAuditoria = false;
				System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoTotal
						+ "€ y excede el límite mensual de 20.000 euros");
			}
			if (gastoTotal <= 20000) {
				if (presupuestoEmpresa > 100000) {
					apruebaAuditoria = false;
					System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de "
							+ presupuestoEmpresa + "€ excede el límite establecido de 100.000 euros");
				} else {
					apruebaAuditoria = true;
					System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
				}
			}
		}
		return apruebaAuditoria;
	}
}
