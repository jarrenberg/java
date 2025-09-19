package ejemploLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad = numAleatorio(100, 1);
		System.out.println(cantidad);
		// Creacion de la coleccion
		LinkedList<Integer> miLista = new LinkedList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			miLista.add(numAleatorio(100, 1));
		}
		// Mostrando su tamaño y el contenido
		System.out.println(miLista.size());
		System.out.println(miLista.toString());

		// Añadir un elemento con los cuatro metodos
		Integer n1 = 10, n2 = 13, n3 = 34, n4 = 43;

		// Metodo 1
		miLista.add(n1);
		

		// Metodo 2
		miLista.add(10, n2);
		System.out.println(miLista.toString());

		// Metodo 3ç
		miLista.addFirst(n3);
		System.out.println(miLista.toString());

		// Metodo 4
		miLista.addLast(n4);
		System.out.println(miLista.toString());

		// Simular el comportamiento de una cola
		System.out.println();
		System.out.println("Creamos una cola");
		LinkedList<Integer> cola = new LinkedList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			cola.add(numAleatorio(100, 1));
		}
		System.out.println(cola.toString());

		System.out.println("Añadimos tres elementos al fondo de la lista");
		// Añadimos tres elementos al fondo de la cola
		for (int i = 0; i < 3; i++) {
			cola.offer(numAleatorio(100, 1));
		}
		System.out.println(cola.toString());
		
		// Sacamos los 2 primeros elementos de la cola
		System.out.println("Sacamos los 2 primeros elementos de la lista");
		for (int i = 0; i < 2; i++) {
			cola.poll();
		}
		System.out.println(cola.toString());
		
		// Mostramos el primer numero en la cola
		System.out.println("Mostramos el primer numero en la cola");
		System.out.println(cola.peek());

		
		// Simular el comportamiento de una pila
		System.out.println();
		System.out.println("Creamos una pila");
		LinkedList<Integer> pila = new LinkedList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			pila.add(numAleatorio(100, 1));
		}
		System.out.println(pila.toString());
		
		// Añadimos 6 elementos a la pila
		System.out.println("Añadimos 6 elementos a la pila");
		for (int i = 0; i < 6; i++) {
			pila.push(numAleatorio(100, 1));
		}
		System.out.println(pila.toString());
		
		// Eliminamos 2 elemenots de la pila
		System.out.println("Eliminamos 2 elemenots de la pila");
		for (int i = 0; i < 2; i++) {
			pila.pop();
		}
		System.out.println(pila.toString());
		
		System.out.println("Ultimo elemento de la cola");
		System.out.println(pila.peekFirst());
		
		// Creando una lista sin duplicados
		System.out.println();
		System.out.println("Creando una lista sin duplicados");
		LinkedList<Integer> listaSinDuplicados = new LinkedList<Integer>();
		for (int i = 0; i < cantidad; i++) {
			Integer num = numAleatorio(100,1);
			if(num.compareTo(listaSinDuplicados.get(i))!=0) {
				listaSinDuplicados.add(num);
			}
		}
		System.out.println(listaSinDuplicados.size());
		System.out.println(listaSinDuplicados.toString());
		
		
	}

	public static int numAleatorio(int max, int min) {
		int num = (int) ((Math.random() * (max - min)) + 1);
		return num;
	}
}
