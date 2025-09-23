package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println("Este programa calcula el producto y la suma de los 10 primeros numeros natruales");
		int num = 1, contenedorSuma = 0, contenedorProducto=1;
		while (num < 11) {
			contenedorSuma=contenedorSuma+num;
			contenedorProducto= contenedorProducto*num;
			num++;
		}
		System.out.println("El producto de los 10 primeros numeros naturales es: " +contenedorProducto);
		System.out.println("La suma de los 10 primeros numeros naturales es: " +contenedorSuma);
	}

}
