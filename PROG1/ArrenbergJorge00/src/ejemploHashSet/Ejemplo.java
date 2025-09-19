package ejemploHashSet;

import java.util.HashSet;

public class Ejemplo {
	public static void main(String[] args) {

		// Creacion de la coleccion HashSet
		int cantidad = numAleatorio(10, 1);
		HashSet<Integer> miLista = new HashSet<Integer>(cantidad);
		for (int i = 0; i < cantidad; i++) {
			miLista.add((Integer) numAleatorio(10, 1));
		}

		// Mostrando su tamaño y el contenido
		System.out.println(miLista.size());
		System.out.println(miLista.toString());

		// Comprobar si un elemento esta en la lista
		Integer num = (Integer)(numAleatorio(10,1));
		if(miLista.contains(num)) {
			System.out.printf("El numero %d esta en la lista\n", num);
		}else {
			System.out.printf("El numero %d no esta en la lista\n", num);
		}
		
		// Eliminando el numero anterior de la lista
		if(miLista.remove(num)) {
			System.out.printf("El numero %d estaba en la lista y ha sido eliminado\n",num);
		}else {
			System.out.printf("El numero %d no estaba en la lista y no ha sido eliminado\n", num);
		}

	}

	public static int numAleatorio(int max, int min) {
		int num = (int) ((Math.random() * (max - min)) + 1);
		return num;
	}
}
