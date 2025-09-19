package ejercicio4;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import ejercicio5.Alumno;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		LinkedList<Persona> censo = new LinkedList<Persona>();

		// Añadimos personas al censo
		System.out.println("Añandiendo 10 personas al censo ...");
		censo = generarListaPersonas(10);

		// Mostramos la cantidad de personas con el sexo introducido por el usuario
		System.out.println("Introduzca un sexo:");
		String sexo = teclado.nextLine();

		try {
			System.out.printf("Las personas con el mismo sexo introducido por el usuario (%s) son: %d\n", sexo,
					personasMismoSexo(sexo, censo));
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Mostramos la cantidad de personas con el estado civil introducido por el
		// usuario
		System.out.println("Introduzca un estado civil:");
		String estadoCivil = teclado.nextLine();

		try {
			System.out.printf("Las personas con el mismo estado civil introducido por el usuario (%s) son: %d\n",
					estadoCivil, personasMismoEstadoCivil(estadoCivil, censo));
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Mostramos la cantidad de personas dentro del rango de edad introducido por el
		// usuario
		System.out.println("Introduzca la edad mínima:");
		int min = pedirEntero(teclado);

		System.out.println("Introduzca la edad máxima:");
		int max = pedirEntero(teclado);

		try {
			System.out.printf("Las personas dentro del rango de edad introducido por el usuario son: %d\n",
					personasMismoRangoEdad(min, max, censo));
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}

		// Mostramos el numero de personas con el mismo sexo y estadoCivil solicitado
		// por el usuario
		System.out.println("Introduzca un sexo:");
		sexo = teclado.nextLine();

		System.out.println("Introduzca un estado civil:");
		estadoCivil = teclado.nextLine();

		try {
			System.out.printf("Las personas con el mismo sexo y estado civil al introducido por el usuario son: %d\n",
					personasMismoSexoYEstadoCivil(sexo, estadoCivil, censo));
		} catch (IllegalArgumentException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		}
	}

	// Añade personas a una lista
	public static LinkedList<Persona> generarListaPersonas(int cantidad) {
		LinkedList<Persona> resultado = new LinkedList<Persona>();
		for (int i = 0; i < cantidad; i++) {
			String sexo, estadoCivil;
			if (i % 2 == 0) {
				sexo = "masculino";
				estadoCivil = "soltero";
			} else {
				sexo = "femenino";
				estadoCivil = "casado";
			}
			try {
				resultado.add(new Persona(String.format("Nombre %d", (i + 1)), sexo, estadoCivil, (i + 20)));
			} catch (NullPointerException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			} catch (IllegalArgumentException ex) {
				System.out.printf("Error. %s\n", ex.getMessage());
			}
		}
		return resultado;
	}

	// Devuelve el numero de personas con el mismo sexo que el indicado como
	// parametro
	public static int personasMismoSexo(String sexo, LinkedList<Persona> censo)
			throws NullPointerException, IllegalArgumentException {
		if (sexo == null) {
			throw new NullPointerException("El sexo no puede ser nulo");
		}
		if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("femenino")) {
			throw new IllegalArgumentException("Los sexos permitidos son 'masculino' y 'femenino'");
		}
		int personas = 0;
		for (Persona p : censo) {
			if (p.getSexo().equalsIgnoreCase(sexo)) {
				personas++;
			}
		}
		return personas;
	}

	// Devuelve el numero de personas con el mismo estado civil que el indicado como
	// parametro
	public static int personasMismoEstadoCivil(String estadoCivil, LinkedList<Persona> censo)
			throws NullPointerException, IllegalArgumentException {
		if (estadoCivil == null) {
			throw new NullPointerException("El estado civil no puede ser nulo");
		}
		if (!estadoCivil.equalsIgnoreCase("soltero") && !estadoCivil.equalsIgnoreCase("casado")
				&& !estadoCivil.equalsIgnoreCase("viudo") && !estadoCivil.equalsIgnoreCase("divorciado")) {
			throw new IllegalArgumentException(
					"Los estados civiles permitidos son 'soltero', 'casado', 'viudo' y 'divorciado'");
		}
		int personas = 0;
		for (Persona p : censo) {
			if (p.geteEstadoCivil().equalsIgnoreCase(estadoCivil)) {
				personas++;
			}
		}
		return personas;
	}

	// Devuelve el numero de personas que se encuentran en el rango de edad pasado
	// como parametro
	public static int personasMismoRangoEdad(int min, int max, LinkedList<Persona> censo)
			throws IllegalStateException, IllegalArgumentException {
		if ((min < 0 || min > 120) || (min % 10 != 0)) {
			throw new IllegalArgumentException("La edad minima debe ser multiplo de 10 y estar entre 0 y 120");
		}
		if ((max < 0 || max > 120) || (max % 10 != 0)) {
			throw new IllegalArgumentException("La edad maxima debe ser multiplo de 10 y estar entre 0 y 120");
		}
		if (min > max) {
			throw new IllegalStateException("La edad minima no puede ser mayor que la maxima");
		}
		int personas = 0;
		for (Persona p : censo) {
			if (p.getEdad() >= min && p.getEdad() <= max) {
				personas++;
			}
		}
		return personas;
	}

	// Devuelve el numero de personas que tienen el mismo sexo y estado civil a los
	// pasados como parametros
	public static int personasMismoSexoYEstadoCivil(String sexo, String estadoCivil, LinkedList<Persona> censo)
			throws NullPointerException, IllegalArgumentException {
		if (estadoCivil == null) {
			throw new NullPointerException("El estado civil no puede ser nulo");
		}
		if (!estadoCivil.equalsIgnoreCase("soltero") && !estadoCivil.equalsIgnoreCase("casado")
				&& !estadoCivil.equalsIgnoreCase("viudo") && !estadoCivil.equalsIgnoreCase("divorciado")) {
			throw new IllegalArgumentException(
					"Los estados civiles permitidos son 'soltero', 'casado', 'viudo' y 'divorciado'");
		}
		if (sexo == null) {
			throw new NullPointerException("El sexo no puede ser nulo");
		}
		if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("femenino")) {
			throw new IllegalArgumentException("Los sexos permitidos son 'masculino' y 'femenino'");
		}
		int personas = 0;
		for (Persona p : censo) {
			if (p.geteEstadoCivil().equalsIgnoreCase(estadoCivil) && p.getSexo().equalsIgnoreCase(sexo)) {
				personas++;
			}
		}
		return personas;
	}

	// Devuelve un entero
	private static int pedirEntero(Scanner tecla) {
		boolean correcto = false;
		int numero = 0;
		// Pedimos al usuario un numero hasta que la variable booleana correcto sea
		// cierto
		do {
			try {
				correcto = true;
				numero = tecla.nextInt();
			} catch (InputMismatchException excepcion1) { // Atrapamos los errores producidos por introducir caracteres
															// invalidos
				correcto = false;
				System.out.println("Se ha producido un error. Intenta de nuevo.");
				tecla.nextLine(); // Limpiar el buffer
			} catch (Exception exception) { // Atrapamos los errores desconocidos
				System.out.println("Se ha producido un error. Intenta de nuevo.");
			}
		} while (!correcto);
		tecla.nextLine();
		return numero;
	}

}
