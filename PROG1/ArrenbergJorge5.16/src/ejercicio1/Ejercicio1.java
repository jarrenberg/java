/**
 * Programa que usa los metodos de la clase CuentaBancaria para mostrar los datos y realizar acciones
 * Jorge Arrenberg 10/12/2024
 */

package ejercicio1;

import java.time.LocalDate;

import libtarea3.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		double saldo = (-200);
		LocalDate fechaInvalida = LocalDate.of(2027, 9, 01);

		// Creacion de cuenta con fecha no valida
		try {
			System.out.println("Intentando crear una cuenta con una fecha no valida (01/09/2027)");
			cuentaPrivada = new CuentaBancaria(1000, fechaInvalida);
		} catch (java.lang.IllegalArgumentException excepcion1) {
			System.out.println("Error.Parametros de creacion de cuenta invalidos. Fecha no valida:" + fechaInvalida);
		} catch (Exception excepcion2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		System.out.printf(" %n");

		// Creacion de cuenta con saldo no valido
		System.out.println("Intentado crear una cuenta con un saldo no valido");
		try {

			cuentaPrivada = new CuentaBancaria(saldo);
		} catch (java.lang.IllegalArgumentException excepcion1) {
			System.out.println("Error. Parametros de creacion de la cuenta inválidos. Saldo " + saldo);
		} catch (Exception excepcion2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		System.out.printf(" %n");
		
		// Creacion de una cuentaPrivada valida con saldo de 100.000€, creada el
		// 1/07/2021 y con limite de descubierto de -200€

		System.out.printf("Creando cuenta privada válida con un constructor de tres parametros  %n");
		LocalDate fecha = LocalDate.of(2021, 7, 1);
		cuentaPrivada = new CuentaBancaria(1000, fecha, -200);
		System.out.printf("Cuenta Privada creada: Id: %d - Saldo: %.2f - Embargada: %b %n", cuentaPrivada.getId(),
				cuentaPrivada.getSaldo(), cuentaPrivada.isEmbargada());
		System.out.printf(" %n");

		// Creacion de una cuentaConjunta valida con saldo de 100.000€, creada el
		// 1/07/2021 y con limite de descubierto de -200€

		System.out.printf("Creando cuenta privada válida con un constructor de dos parametros %n");
		cuentaConjunta = new CuentaBancaria(200, fecha);
		System.out.printf("Cuenta Conjunta creada: Id: %d - Saldo: %.2f - Embargada: %b %n", cuentaConjunta.getId(),
				cuentaConjunta.getSaldo(), cuentaConjunta.isEmbargada());
		System.out.printf("%n");
		// Creacion de una cuentaFamiliar valida
		System.out.printf("Creando cuenta privada válida con un constructor sin parametros %n");
		cuentaFamiliar = new CuentaBancaria();
		System.out.printf("Cuenta Familiar creada: Id: %d - Saldo: %.2f - Embargada: %b %n", cuentaFamiliar.getId(),
				cuentaFamiliar.getSaldo(), cuentaFamiliar.isEmbargada());
		System.out.printf(" %n");

		// Mostramos informacion de la cuentaPrivada por pantalla

		System.out.printf("Prueba de los getters de la Cuenta Privada %n");
		System.out.printf("------------------------------------------ %n");
		System.out.printf("Id: %d %n", cuentaPrivada.getId());
		System.out.printf("Fecha de creacion: " + cuentaPrivada.getFechaCreacion() + "%n");
		System.out.printf("Limite de descubierto %.2f %n", cuentaPrivada.getLimiteDescubierto());
		System.out.printf("Esta embargada: %b %n", cuentaPrivada.isEmbargada());
		System.out.printf("Esta en descubierto: %b %n", cuentaPrivada.isDescubierta());
		System.out.printf("Numero de dias que lleva la cuenta abierta: %d %n %n", cuentaPrivada.getDiasCuenta());

		// Realizamos operaciones con las cuentas

		System.out.printf("Realizacion de operaciones sobre las cuentas %n");
		System.out.printf("------------------------------------------ %n");
		System.out.printf("Ingresamos 100€ en la Cuenta Familiar %n");
		cuentaFamiliar.ingresar(100);
		System.out.printf("Extraemos 100€ en la Cuenta Conjunta %n");
		cuentaConjunta.extraer(100);
		System.out.printf("Transferimos 1100€ en la Cuenta Privada a la Familiar %n  %n");
		cuentaPrivada.transferir(1100, cuentaFamiliar);

		//Mostramos el estado final de las cuentas
		
		System.out.printf("Estado final de las cuentas \n");
		System.out.printf("------------------------------------------ %n");
		System.out.printf("Estado final de la Cuenta Privada: Id: %d - Saldo: %.2f - Embargada: %b %n", cuentaPrivada.getId(),
				cuentaPrivada.getSaldo(), cuentaPrivada.isEmbargada());
		System.out.printf("Estado final de la Cuenta Conjunta: Id: %d - Saldo: %.2f - Embargada: %b %n", cuentaConjunta.getId(),
				cuentaConjunta.getSaldo(), cuentaConjunta.isEmbargada());
		System.out.printf("Estado final de la Cuenta Familiar: Id: %d - Saldo: %.2f - Embargada: %b %n", cuentaFamiliar.getId(),
				cuentaFamiliar.getSaldo(), cuentaFamiliar.isEmbargada());

	}

}
