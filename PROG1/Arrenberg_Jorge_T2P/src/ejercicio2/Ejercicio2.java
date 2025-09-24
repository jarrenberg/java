package ejercicio2;

import java.time.LocalDate;
import java.util.Iterator;

public class Ejercicio2 {
	public static final LocalDate FECHA_DEFAULT = LocalDate.now();

	private final byte[] hora = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
			24 };

	private LocalDate fecha;
	private int[] consumo;
	private double[] precio;
	private double[] costeHora;

	public Ejercicio2(int[] consumo, double[] precio, double[] costeHora) throws IllegalArgumentException{
		// Ponemos las condiciones
		if (consumo == null || consumo.length > hora.length) {
			throw new IllegalArgumentException("Has introducido unos valores errnoeos en consumo.");
		}
		if (precio == null || precio.length > hora.length) {
			throw new IllegalArgumentException("Has introducido unos valores errnoeos en precio.");
		}

		if (costeHora == null || costeHora.length > hora.length) {
			throw new IllegalArgumentException("Has introducido unos valores errnoeos en el coste por hora.");
		}
		//Guardamos los resultados si pasan las restricciones
		this.fecha = FECHA_DEFAULT;
		this.consumo = consumo;
		this.precio = precio;
		this.costeHora = costeHora;
	}

	// Metodo que devuelve el coste de las horas pares
	public double costeHorasPares() {
		double costeHorasPares = 0;
		for (int i = 0; i < hora.length; i++) {
			if (i % 2 == 1) {
				costeHorasPares = (costeHorasPares + (precio[i] * (consumo[i]) / 1000.0));
			}
		}
		return costeHorasPares;
	}

	// Metodo que devuelve la hora del dia con el precio mas alto
	public int horaPrecioMasAlto() {
		int horaPrecioMasAlto = 0;
		double precioMasAlto = precio[0];
		for (int i = 0; i < hora.length; i++) {
			if (precio[i] >= precioMasAlto) {
				horaPrecioMasAlto = (i + 1);
				precioMasAlto = precio[i];
			}
		}
		return horaPrecioMasAlto;
	}

//Precios mas baratos = 15,14,13
	public String tresHorasMasBaratas() {
		int horaBarata1 = 0;
		int horaBarata2 = 0;
		int horaBarata3 = 0;
		double precioBarato1 = precio[0];
		double precioBarato2 = precio[1];
		double precioBarato3 = precio[2];
		// Falso
		for (int i = 0; i < hora.length; i++) {
			if (precio[i] <= precioBarato1) {
				horaBarata1 = i;
				precioBarato1 = precio[i];
			} else if (precio[i] <= precioBarato2 && precioBarato1 < precioBarato2) {
				horaBarata2 = i;
				precioBarato2 = precio[i];
			} else if (precio[i] <= precioBarato3 && precioBarato2 < precioBarato3) {
				horaBarata3 = i;
				precioBarato3 = precio[i];
			}
		}
		String horasBaratas = String.format("%d, %d,%d", hora[horaBarata1], hora[horaBarata2], hora[horaBarata3]);
		return horasBaratas;
	}

	public static void main(String[] args) {
		double[] precio = { 0.176913085, 0.162418527, 0.163008205, 0.161324055, 0.160931245, 0.156762018, 0.151811078,
				0.140889361, 0.133800035, 0.125667033, 0.108986202, 0.092593459, 0.085345099, 0.083556969, 0.077146071,
				0.08592403, 0.105271229, 0.115156177, 0.125293963, 0.144438618, 0.15376299, 0.148261656, 0.131731964,
				0.114278129 };
		double[] costeHora = { 0.02582931041, 0.012181389525, 0.011247566145, 0.010486063575, 0.00997773719,
				0.009248959062, 0.010171342226, 0.009439587187, 0.018865804935, 0.036569106603, 0.026047702278,
				0.060741309104, 0.099512385434, 0.065842891572, 0.077146071, 0.01941883078, 0.021159517029,
				0.034201384569, 0.07392343817, 0.045787041906, 0.05427833547, 0.07487213628, 0.034118578676,
				0.027883863476 };
		int[] consumo = { 146, 75, 69, 65, 62, 59, 67, 67, 141, 291, 239, 656, 1166, 788, 1000, 226, 201, 297, 590, 317,
				353, 505, 259, 244 };
		//Declaramaos e instanciamos el objeto
		Ejercicio2 factura = new Ejercicio2(consumo, precio, costeHora);
		//Mostramos los datos que nos piden
		System.out.printf("El coste de las horas pares del dia es: %f.\n", factura.costeHorasPares());
		System.out.printf("La hora del dia con el precio mas alto es: %d.\n", factura.horaPrecioMasAlto());
		System.out.printf("Las 3 horas mas baratas del dia son: %s.\n", factura.tresHorasMasBaratas());

	}
}
