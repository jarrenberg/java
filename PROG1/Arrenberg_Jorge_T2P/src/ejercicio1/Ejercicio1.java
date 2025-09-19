/*
 * Programa en el que se manipula la clase cuentaBancaria, se usan sus metodos y se tratan las posibles excepciones
 * Jorge Arrenberg 28/01/2025
 */
package ejercicio1;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 2. DECLARA 10 VARIABLES REFERENCIA
		CuentaBancaria cuenta1, cuenta2, cuenta3, cuenta4, cuenta5, cuenta6, cuenta7, cuenta8, cuenta9, cuenta10;
		CuentaBancaria[] array = new CuentaBancaria[10];
		
		// 3. INSTANCIACION DE LAS 10 VARIABLES REFERENCIA
		System.out.println("3.INICIALIZANDO CUENTAS...");
		cuenta1 = crearCuenta();
		cuenta2 = crearCuenta();
		cuenta3 = crearCuenta();
		cuenta4 = crearCuenta();
		cuenta5 = crearCuenta();
		cuenta6 = crearCuenta();
		cuenta7 = crearCuenta();
		cuenta8 = crearCuenta();
		cuenta9 = crearCuenta();
		cuenta10 = crearCuenta();

		// 4. INDICA LA CUENTA MAS RECIENTE
		System.out.printf("\n4. LA FECHA MAS RECIENTE ES %s.\n", CuentaBancaria.getFechaMasModerna().toString());

		// 5. CREACION DE LA CUENTA CON MI APELLIDO CON SALDO 50€ Y MOSTRAR SU
		// INFORMACION
		System.out.printf("\n5. CREACION DE LA CUENTA CON MI APELLIDO CON SALDO 50€ Y MOSTRAR SU INFORMACION...\n");
		CuentaBancaria arrenberg;
		try {
			arrenberg = new CuentaBancaria(50.0);
		} catch (IllegalArgumentException ex1) {
			arrenberg = new CuentaBancaria();
			System.out.printf("Error.%s\n", ex1.getMessage());
		}
		System.out.printf("%s\n", arrenberg.toString());

		// 6. DECLARACION E INSTANCIACION DE UNA CUENTA POR DEFECTO CON MI NOMBRE Y
		// MOSTRAR SU INFORMACION
		System.out.printf(
				"\n6. DECLARACION E INSTANCIACION DE UNA CUENTA POR DEFECTO CON MI NOMBRE Y MOSTRAR SU INFORMACION...\n");
		CuentaBancaria jorge = new CuentaBancaria();
		System.out.printf("%s\n", jorge.toString());

		// 7. INGRESO DE 1000€ EN LA CUENTA CON MI PRIMER APELLIDO Y MOSTRAR EL
		// RESULTADO
		System.out.printf("\n7. INGRESO DE 1000€ EN LA CUENTA CON MI PRIMER APELLIDO Y MOSTRAR EL RESULTADO...\n");
		try {
			arrenberg.ingresar(1000.0);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}
		System.out.println(arrenberg.toString());

		// 8. EXTRAE 500€ DE LA CUENTA CON MI NOMBRE Y MOSTRAR EL RESULTADO
		System.out.printf("\n8. EXTRAE 500€ DE LA CUENTA CON MI NOMBRE Y MOSTRAR EL RESULTADO...\n");
		try {
			jorge.extraer(500.0);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}
		System.out.println(jorge.toString());

		// 9. TRANSFERENCIA DE 250€ DE LA CUENTA CON MI NOMBRE A LA CUENTA CON MI
		// APELLIDO Y MOSTRAR LA INFORMACION
		System.out.printf(
				"\n9. TRANSFERENCIA DE 250€ DE LA CUENTA CON MI NOMBRE A LA CUENTA CON MI APELLIDO Y MOSTRAR LA INFORMACION...\n");

		try {
			jorge.transferir(250.0, arrenberg);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}
		System.out.println(jorge.toString());
		System.out.println(arrenberg.toString());

		// 10.EMBARGA EL 50% DE LA CUENTA CON MI PRIMER APELLIDO Y MOSTRAR LA
		// INFORMACION
		System.out.printf("\n10.EMBARGA EL 50%% DE LA CUENTA CON MI PRIMER APELLIDO Y MOSTRAR LA INFORMACION...\n");
		try {
			arrenberg.embargar(50.0);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("Error.%s\n", ex1.getMessage());
		} catch (IllegalStateException ex2) {
			System.out.printf("Error.%s\n", ex2.getMessage());
		}
		System.out.println(arrenberg.toString());

		// 11. MUESTRA EL SALDO DE TODAS LAS CUENTAS Y EL NUMERO DE CUENTAS EMBARGADAS
		System.out.printf("\n11. MUESTRA EL SALDO DE TODAS LAS CUENTAS Y EL NUMERO DE CUENTAS CREADAS...\n");
		System.out.printf("SALDO GLOBAL DE LAS CUENTAS: %.2f\n", CuentaBancaria.getSaldoGlobal());
		System.out.printf("NUMERO DE CUENTAS EMBARGADAS: %d\n", CuentaBancaria.getNumCuentasEmbargadas());

	}

	// 1.METODO ANYO ALEATORIO
	// Devuelve un año aleatorio dentro de un rango
	public static int anyoAleatorio(int min, int max) {
		int anyo = (int) ((Math.random() * 100) + min);
		return anyo;
	}

	// Metodo que devuelve una cuenta bancaria creada tratando las excepciones
	public static CuentaBancaria crearCuenta() {
		CuentaBancaria cuentaRes;
		try {
			cuentaRes = new CuentaBancaria(CuentaBancaria.DEFAULT_SALDO, LocalDate.of(anyoAleatorio(1850, 1950), 1, 1),
					-50.);
		} catch (IllegalArgumentException ex1) {
			cuentaRes = new CuentaBancaria(); // En caso de que nos salte una excepcion con los valores que nos piden,
												// la creamos con los valores por defecto
			System.out.printf("Error.%s\n", ex1.getMessage());
		}
		return cuentaRes;
	}
}
