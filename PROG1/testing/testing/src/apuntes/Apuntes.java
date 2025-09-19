package apuntes;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Apuntes {
	// Ejemplo de tipo ENUM
	public class TiposEnumerados {
		public enum Dias {
			LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
		}

		public static void main(String[] args) {
			Dias diaActual = Dias.MARTES;
			Dias diaSiguiente = Dias.MIERCOLES;

			System.out.println("Hoy es: " + diaActual);
			System.out.println("Mañana es " + diaSiguiente);
		}
		// * Metodo para saber si un numero es primo

		public static boolean esPrimo(int num) {
			boolean esPrimo = true;
			int i = 2;
			while ((i < num) && (esPrimo == true)) {
				if (num % i == 0) {
					esPrimo = false;
				}
				i++;
			}
			if (num == 1) {
				esPrimo = false;
			}
			if (num == 2) {
				esPrimo = true;
			}
			return esPrimo;

		}

		public static void main1(String[] args) {
			Scanner teclado = new Scanner(System.in);
			String frase2 = "";
			// Cuando se pida un numero y luego una cadena de texto

			System.out.println("Introduzca un numero");
			float num = teclado.nextFloat();
			teclado.nextLine(); // Ponemos teclado.nextLine() para poder introducir luego la frase
			System.out.println("Introduce una frase");
			String frase = teclado.nextLine();

			// Para cambiar el tipo de variable que vamos a guardar realizamos un "casteo"
			// El metodo Math.random nos devuelve un valor double, pero para guardarlo en
			// una variable int realizamos un casteo
			int num1 = (int) Math.random(); // El casteo lo realizamos introduciendo entre parentesis el tipo de
											// variable que queremos que devuelva
			// Usar el metodo Math.pow(base, exponente) para realizar una potencia

			// Como redodndear un float a solo dos decimales
			System.out.printf("El porcentaje de descuento es: %.2f\n", num); // usas printf y para darle el formato
																				// usamos "%2f" y usamos "\n" para bajar
																				// de linea

			// numero real = numero con decimales + enteros

			// Operadores de asignacion
			/**
			 * ! !op Devuelve true si el operando es false y viceversa. & op1 & op2 Devuelve
			 * true si op1 y op2 son true | op1 | op2 Devuelve true si op1 u op2 son true ^
			 * op1 ^ op2 Devuelve true si sólo uno de los operandos es true && op1 && op2
			 * Igual que &, pero si op1 es false ya no se evalúa op2 || op1 || op2 Igual que
			 * |, pero si op1 es true ya no se evalúa op2
			 * 
			 */

			// Comparación de cadenas
			System.out.println("cadena1.equals(cadena2) es: " + frase.equals(frase2));
			System.out.println("cadena1.equalsIgnoreCase(cadena2) es: " + frase.equalsIgnoreCase(frase2));

			// Obtención de subcadenas
			System.out.println("cadena1.substring(0,5) es: " + frase.substring(0, 5)); // Coge desde la posicion 0 a la
																						// 4, la 5 no la llega a coger

			// Pasar a minúsculas
			System.out.println("cadena1.toLowerCase() es: " + frase.toLowerCase());
			System.out.println();

			// Conversiones de tipo con cadenas de caracteres (String)
			/**
			 * numero=Byte.parseByte(cadena); numero=Short.parseShort(cadena);
			 * numero=Integer.parseInt(cadena); numero=Long.parseLong(cadena);
			 * numero=Float.parseFloat(cadena); numero=Double.parseDouble(cadena);
			 * 
			 */

			/**
			 * cad1.compareTo(cad2) Permite comparar dos cadenas entre sí
			 * lexicográficamente. Retornará 0 si son iguales, un número menor que cero si
			 * la cadena (cad1) es anterior en orden alfabético a la que se pasa por
			 * argumento (cad2), y un número mayor que cero si la cadena es posterior en
			 * orden alfabético. cad1.equals(cad2) Cuando se compara si dos cadenas son
			 * iguales, no se debe usar el operador de comparación "==", sino el método
			 * equals(). Retornará true si son iguales, y false si no lo son.
			 * cad1.compareToIgnoreCase(cad2) cad1.equalsIgnoreCase(cad2) El método
			 * compareToIgnoreCase() funciona igual que el método compareTo(), pero ignora
			 * las mayúsculas y las minúsculas a la hora de hacer la comparación. Las
			 * mayúsculas van antes en orden alfabético que las minúsculas, por lo que hay
			 * que tenerlo en cuenta. El método equalsIgnoresCase() es igual que el método
			 * equals() pero sin tener en cuenta las minúsculas. cad1.toLowerCase() Genera
			 * una copia de la cadena con todos los caracteres a minúscula.
			 * cad1.toUpperCase() Genera una copia de la cadena con todos los caracteres a
			 * mayúsculas. cad1.trim() Genera una copia de la cadena eliminando los espacios
			 * en blanco anteriores y posteriores de la cadena. Si solo quieres eliminar los
			 * espacios anteriores o solo los posteriores, dispones también de los métodos
			 * stripLeading y stripTrailing. cad1.indexOf(cad2) cad1.indexOf(cad2,num) Si la
			 * cadena o carácter pasado por argumento está contenida en la cadena invocante,
			 * retorna su posición, en caso contrario retornará -1. Opcionalmente se le
			 * puede indicar la posición a partir de la cual buscar, lo cual es útil para
			 * buscar varias apariciones de una cadena dentro de otra. cad1.contains(cad2)
			 * Retornará true si la cadena pasada por argumento está contenida dentro de la
			 * cadena. En caso contrario retornará false. cad1.startsWith(cad2) Retornará
			 * true si la cadena comienza por la cadena pasada como argumento. En caso
			 * contrario retornará false. cad1.endsWith(cad2) Retornará true si la cadena
			 * acaba por la cadena pasada como argumento. En caso contrario retornará false.
			 * cad1.replace(cad2,cad3) Generará una copia de la cadena cad1, en la que se
			 * sustituirán todas las apariciones de cad2 por cad3. El reemplazo se hará de
			 * izquierda a derecha, por ejemplo: reemplazar "zzz" por "xx" en la cadena
			 * "zzzzz" generará "xxzz" y no "zzxx".
			 */
			// Estructura del switch
			int var = 0;
			switch (var) {
			case 0:
				System.out.println("cero");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			default:
				System.out.println("otro");// En caso de que no se introduzca 0,1 o 2 entrmos en el caso de default
			}

			// para llenar un array unidimensional con valores dados
			int[] numeros = { 2, 4, 6, 5 }; // array de tamaño 4

			// para llenar un array unidimensional con valores dados
			int[][] ejemplo = { { 2, 5, 6 }, { 5, 7, 8 }, { 9, 5, 7 }, { 5, 4, 7 } }; // array bidimensional de 4x3

			// Ejemplo de comprobacion de expresiones regulares para que cumpla el patron
			System.out.println("Introduzca su DNI:");
			String DNI = teclado.nextLine();

			String patron = "[0-9]{8}"; // Patron de un DNI
			if (DNI.matches(patron)) {// Comprobacion de que el DNI cumple el patron
				int numDNI = Integer.valueOf(DNI);// convierte de String a integer
				System.out.println("La letra de su DNI es: " + (numDNI));
			}

			else {
				while (DNI.matches(patron) == false) {
					System.out.println("Formato incorrecto, introduzca el DNI");
					DNI = teclado.nextLine();
				}
			}

			// Para pasar de numero int a String
			int valorInt = 25;
			String textoInt = Integer.toString(valorInt);
			System.out.printf("Entero: %d - Cadena: \"%s\"\n", valorInt, textoInt);

			// En una expresion regular, el caracter ^ hace que sea el rango opuesto

			String patron1 = "[^abc]"; // El patron incluye todos los valores menos a, b y c

			/**
			 * Cuantificadores de expresiones regulares
			 * 
			 * "?" = una vez o ninguna "*" = cero o muchas veces "+" = una o muchas veces
			 * patron{n,m} {n(numero minimo de veces q aparece),m(numero maximo q aparece)}
			 * 
			 */
			/**
			 * "[a-z]" indica que el conjunto representa a todas las letras minúsculas de
			 * alfabeto latino (sin incluir la eñe, que no está entre los caracteres
			 * estándar). Sería equivalente a escribir "[abcdefghijklmnopqrstuvwxyz]";
			 * "[A-Z]" hace referencia a todas las letras mayúsculas. Equivalente a
			 * "[ABCDEFGHIKLMNOPQRSTUVWXYZ]"; "[a-zA-Z]" se refiere al conjunto de todas las
			 * letras minúsculas y mayúsculas. En este caso hemos unido dos rangos y sería
			 * equivalente a "[abcdefghijklmnopqrstuvwxyzABCDEFGHIKLMNOPQRSTUVWXYZ]";
			 * "[A-Fu-z]" hace referencia al conjunto de todas las letras mayúsculas entre
			 * 'A' y 'F' y las minúsculas entre 'u y 'z'. Equivalente a "[ABCDEFuvwxyz]";
			 * "[0-9]" indica el conjunto de los diez posibles caracteres numéricos del
			 * sistema decimal. De este modo podemos indicar que se permite la presencia de
			 * un dígito numérico entre 0 y 9, cualquiera de ellos, pero solo uno. Sería
			 * equivalente a haber escrito "[0123456789]"; "[a-zA-Z0-9_]" hace referencia a
			 * cualquier letra mayúscula o minúscula, o dígito, o el carácter '_'
			 * (underscore o "guion bajo" o "subrayado"). En este caso se han incluido tres
			 * rangos y un carácter. Sería equivalente a haber escrito
			 * "[abcdefghijklmnopqrstuvwxyzABCDEFGHIKLMNOPQRSTUVWXYZ0123456789_]".
			 */

		}
	}

	/**
	 */
	// Devuelve un numero aleatorio dentro de un rango
	public static int aforoAleatorio(int min, int max) {
		int aforo = (int) ((Math.random() * 100) + min);
		while (aforo > max || aforo < min) {
			aforo = (int) ((Math.random() * 100) + min);
		}
		return aforo;
	}

	// NUMERO ENTERO EN INTERVALO (5.18 EJERCICIO 3)
	/*
	 * public static int pedirEnteroEnIntervalo(Scanner tecla, String mensaje, int
	 * min, int max) { boolean correcto = false; int numero = 0; // Pedimos al
	 * usuario un numero hasta que la variable booleana correcto sea // cierto do {
	 * try { correcto = true; System.out.println(mensaje); numero = tecla.nextInt();
	 * //En caso de que el numero no cumpla los requisitos de estar dentro del
	 * intervalo volvera a pedirlo if (numero < min || numero > max) { correcto =
	 * false; System.out.println("Error. Las horas van desde " + min + " hasta " +
	 * max); tecla.nextLine(); } } catch (InputMismatchException excepcion1) {//
	 * Atrapamos los errores producidos por introducir caracteres // invalidos
	 * correcto = false;
	 * System.out.println("Te has equivocado. Por favor, ingresa un número válido."
	 * ); tecla.nextLine(); // Limpiar el buffer } catch (Exception exception) {
	 * //Atrapamos errores desconocidos
	 * System.out.println("Se ha producido un error. Intenta de nuevo."); } } while
	 * (!correcto);
	 * 
	 * return numero; }
	 */

	/**
	 * Formas de crear objetos LocalDate y LocalTime LocalDate.of(int year,int
	 * month,int dayOfMonth) LocalDate.parse("2019-12-4") LocalTime.of(int hora,int
	 * minutos,int segundos) LocalTime.parse("10:25:45")
	 * LocalDateTime.parse("2020-11-28T19:34:50.63");
	 * 
	 * Duracion entre dos obejtos localtime en minutos: Duration tiempoHasta =
	 * Duration.between(horaUsuario, inicio); long mins = tiempoHasta.toMinutes();
	 */

	/*
	 * Formateado de fechas y horas LocalTime hora = LocalTime.now();
	 * DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");
	 * //System.out.println(hora); System.out.println(hora.format(f));
	 * 
	 * DateTimeFormatter formato = DateTimeFormatter.ofPattern("'Hoy es' d 'del mes'
	 * M 'del año' yyyy. 'Y son las' kk 'horas'.");
	 * System.out.println(hora.format(formato));
	 */
	/*
	 * USO DE CHRONOUNIT //
	 * 
	 * LocalDate hoy = LocalDate.now(); System.out.println("Fecha actual: " + hoy);
	 * 
	 * // Añadir una semana a la fecha actual LocalDate semanaSig = hoy.plus(1,
	 * ChronoUnit.WEEKS); System.out.println("Una semana después: " + semanaSig);
	 * 
	 * // Añadir un mes a la fecha actual LocalDate mesSig = hoy.plus(1,
	 * ChronoUnit.MONTHS); System.out.println("Un mes después: " + mesSig);
	 * 
	 * // Añadir un año LocalDate sigYear = hoy.plus(1, ChronoUnit.YEARS);
	 * System.out.println("Un año después: " + sigYear);
	 * 
	 * // Añadir una década LocalDate sigDecada = hoy.plus(1, ChronoUnit.DECADES);
	 * System.out.println("Una década después: " + sigDecada);
	 */

	/*
	 * MANEJO DE EXCEPCIONES try{
	 * 
	 * código que puede generar excepciones;
	 * 
	 * }catch (Tipo_excepcion_1 objeto_excepcion){
	 * 
	 * instrucciones para manejar excepción de Tipo_excepcion_1;
	 * 
	 * }catch (Tipo_excepcion_2 objeto_excepcion){
	 * 
	 * instrucciones para manejar excepción de Tipo_excepcion_2;
	 * 
	 * }catch (...){ ... }finally{
	 * 
	 * instrucciones que se ejecutan siempre
	 * 
	 * }
	 */

	/*
	 * METODO PARA VALIDAR LA LETRA DE UN DNI
	 */
	private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	private char calcularLetraDni(int numeroDni) {
		// Cálculo y devolución de la letra NIF
		return LETRAS_DNI.charAt(numeroDni % 23);
	}

	private boolean isDniValido(String dni) {
		boolean valido = true;
		char letraCalculada;
		char letraObtenida;
		int dniNumero;

		if (dni == null) { // El dni debe ser un objeto String no vacío
			valido = false;
		} else if (!dni.matches("[0-9]{8}[" + LETRAS_DNI + "]")) {
			valido = false; // No se cumple el patrón de 8 números + 1 letra
		} else {
			// Extraemos la letra (char)
			letraObtenida = dni.charAt(8);
			// Convertimos el DNI a entero
			dniNumero = Integer.parseInt(dni.substring(0, 8));
			// Calculamos la letra de DNI (char) a partir del número (int)
			letraCalculada = calcularLetraDni(dniNumero);
			// Si las letras coinciden el DNI es válido.
			valido = letraObtenida == letraCalculada;
		}
		return valido;
	}

	public void setDni(String dni) throws IllegalStateException {
		if (isDniValido(dni)) {
			// this.dni = dni;
		} else
			throw new IllegalStateException("DNI no válido");
	}

	/*
	 * EJEMPLO DE CONSTRUCTOR
	 */

	/*
	 * public Persona (String nombre, String apellido1, String apellido2, String
	 * dni) throws IllegalArgumentException { // Comprobación de que los valores de
	 * entrada son válidos if (nombre==null || nombre.isEmpty()) throw new
	 * IllegalArgumentException
	 * ("el parámetro nombre es null o contiene la cadena vacía"); if
	 * (apellido1==null ||apellido1.isEmpty()) throw new IllegalArgumentException
	 * ("el parámetro apellido1 es null o contiene la cadena vacía"); if
	 * (apellido2==null ||apellido2.isEmpty()) throw new IllegalArgumentException
	 * ("el parámetro apellido2 es null o contiene la cadena vacía"); if (dni==null
	 * ||dni.isEmpty()) throw new IllegalArgumentException
	 * ("el parámetro dni es null o contiene la cadena vacía"); if
	 * (!isDniValido(dni)) throw new IllegalArgumentException
	 * ("el DNI no es válido"); }
	 */
	/*
	 * EJEMPLO DE CONSTRUCTOR DE COPIA
	 */
	/*
	 * public Rectangulo (Rectangulo r) throws NullPointerException { // Si r es
	 * null se lanzará una NullPointerException this (r.x1, r.y1, r.x2, r.y2,
	 * r.nombre, r.color); // Llamada al constructor con seis parámetros }
	 */
	/*
	 * 
	 */
	// Metodo que devuelve los dias del mes
	public static int diasMes(int mes, int anno) {
		int diasMes = 0;
		LocalDate fecha = LocalDate.of(anno, mes, 1);
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			diasMes = 31;
			break;
		case 4, 6, 9, 11:
			diasMes = 30;
			break;
		case 2:
			if (fecha.isLeapYear()) {
				diasMes = 29;
			} else {
				diasMes = 28;
			}
			break;
		}
		return diasMes;
	}
	/*
	 * 
	 * 1. Caracteres Especiales
	 * 
	 * 
	 * 
	 * . : Cualquier carácter (excepto salto de línea).
	 * 
	 * 
	 * 
	 * \d : Un dígito (equivalente a [0-9]).
	 * 
	 * 
	 * 
	 * \D : No es un dígito (equivalente a [^0-9]).
	 * 
	 * 
	 * 
	 * \w : Un carácter alfanumérico (equivalente a [a-zA-Z0-9_]).
	 * 
	 * 
	 * 
	 * \W : No es un carácter alfanumérico (equivalente a [^a-zA-Z0-9_]).
	 * 
	 * 
	 * 
	 * \s : Un espacio en blanco (espacio, tabulación, salto de línea, etc.).
	 * 
	 * 
	 * 
	 * \S : No es un espacio en blanco.
	 * 
	 * 
	 * 
	 * 2. Cuantificadores
	 * 
	 * 
	 * 
	 * : 0 o más repeticiones del patrón anterior.
	 * 
	 * 
	 * 
	 * + : 1 o más repeticiones del patrón anterior.
	 * 
	 * 
	 * 
	 * ? : 0 o 1 repetición del patrón anterior.
	 * 
	 * 
	 * 
	 * {n} : Exactamente n repeticiones del patrón anterior.
	 * 
	 * 
	 * 
	 * {n,} : n o más repeticiones del patrón anterior.
	 * 
	 * 
	 * 
	 * {n,m} : Entre n y m repeticiones del patrón anterior.
	 * 
	 * 
	 * 
	 * 3. Grupos y Capturas
	 * 
	 * 
	 * 
	 * () : Define un grupo de captura.
	 * 
	 * 
	 * 
	 * (?:...) : Define un grupo sin captura (no se almacena el resultado).
	 * 
	 * 
	 * 
	 * | : Operador OR (alternativa). Por ejemplo, a|b coincide con "a" o "b".
	 * 
	 * 
	 * 
	 * 4. Anclas
	 * 
	 * 
	 * 
	 * ^ : Inicio de una cadena (o de una línea en modo multilínea).
	 * 
	 * 
	 * 
	 * $ : Fin de una cadena (o de una línea en modo multilínea).
	 * 
	 * 
	 * 
	 * \b : Límite de una palabra (posición entre un carácter alfanumérico y no
	 * alfanumérico).
	 * 
	 * 
	 * 
	 * \B : No es un límite de palabra.
	 * 
	 * 
	 * 
	 * 5. Clases de Caracteres
	 * 
	 * 
	 * 
	 * [abc] : Cualquier carácter dentro de los corchetes (en este caso, "a", "b" o
	 * "c").
	 * 
	 * 
	 * 
	 * [^abc] : Cualquier carácter excepto los que están dentro de los corchetes.
	 * 
	 * 
	 * 
	 * [a-z] : Cualquier carácter en el rango de "a" a "z".
	 * 
	 * 
	 * 
	 * [A-Za-z0-9] : Cualquier carácter alfanumérico.
	 * 
	 * 
	 * 
	 * 6. Escapes
	 * 
	 * 
	 * 
	 * \\ : Escapa un carácter especial. Por ejemplo, \\d busca un dígito.
	 * 
	 * 
	 * 
	 * \. : Escapa el punto para que coincida con un punto literal.
	 * 
	 * Validar un correo electrónico:
	 * 
	 * java
	 * 
	 * Copy
	 * 
	 * 
	 * 
	 * String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
	 * 
	 * 
	 * 
	 * Validar un número de teléfono (10 dígitos):
	 * 
	 * java
	 * 
	 * Copy
	 * 
	 * 
	 * 
	 * String regex = "^\\d{10}$";
	 * 
	 * 
	 * 
	 * Validar una fecha (formato YYYY-MM-DD):
	 * 
	 * java
	 * 
	 * Copy
	 * 
	 * 
	 * 
	 * String regex = "^\\d{4}-\\d{2}-\\d{2}$";
	 * 
	 * 
	 * 
	 * Buscar palabras completas:
	 * 
	 * java
	 * 
	 * Copy
	 * 
	 * 
	 * 
	 * String regex = "\\bword\\b";
	 * 
	 * 
	 * 
	 * Extraer números de una cadena:
	 * 
	 * java
	 * 
	 * Copy
	 * 
	 * 
	 * 
	 * String regex = "\\d+";
	 * 
	 */
	
	//Mostrar el dia de la semana en español
	// f.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es",
	// "ES")).toUpperCase();

	/*
	 * El método compare de la interfaz Comparator en Java se utiliza para comparar
	 * dos objetos y determinar su orden. Retorna un valor entero que indica si el
	 * primer objeto es menor, igual o mayor que el segundo según el criterio de
	 * ordenación definido.
	 * 
	 * 
	 * int compare(T o1, T o2); Valores de retorno: Negativo (< 0): Indica que o1 es
	 * menor que o2 (debe aparecer antes en el orden).
	 * 
	 * Cero (0): Indica que o1 y o2 son iguales según el criterio de comparación.
	 * 
	 * Positivo (> 0): Indica que o1 es mayor que o2 (debe aparecer después en el
	 * orden).
	 */
}