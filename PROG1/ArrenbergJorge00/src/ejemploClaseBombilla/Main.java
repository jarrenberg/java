package ejemploClaseBombilla;

public class Main {

	public static void main(String[] args) {

		System.out.printf("Numero de bombillas creadas: %d.\n", Bombilla.numBombillasCreadas());
		System.out.printf("Numero de bombillas encendidas: %d.\n", Bombilla.numBombillasEncendidas());

		// Declarando variables b1,b2,b3 de tipo referencia a objetos bombilla
		System.out.println("Declarando variables b1,b2,b3 de tipo referencia a objetos bombilla");
		Bombilla b1;
		Bombilla b2;
		Bombilla b3;

		// Creacion de b1
		System.out.printf("\nCreacion de b1:\n");
		b1 = new Bombilla(false);
		System.out.println(b1.toString());

		// Creacion de b2 y uso de metodos
		System.out.printf("Creacion de b2:\n");
		b2 = new Bombilla(true);
		System.out.println(b2.toString());

		// Conmutamos 3 veces
		for (int i = 0; i < 3; i++) {
			System.out.println("Conmutando estado de b2:");
			b2.interruptor();
			System.out.println(b2.toString());
		}

		// Encendiendo b2
		System.out.println("Encendiendo b2:");
		try {
			b2.encender();
		} catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (Exception ex2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		System.out.println(b2.toString());

		// Volviendo a encender b2
		System.out.println("Encendiendo b2:");
		try {
			b2.encender();
		} catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (Exception ex2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		System.out.println(b2.toString());

		// Apagando b2
		System.out.println("Apagando b2:");
		try {
			b2.apagar();
		} catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (Exception ex2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		System.out.println(b2.toString());

		// Encendiendo b2
		System.out.println("Encendiendo b2:");
		try {
			b2.encender();
		} catch (IllegalStateException ex) {
			System.out.printf("Error. %s\n", ex.getMessage());
		} catch (Exception ex2) {
			System.out.println("Ha ocurrido un error desconocido");
		}
		System.out.println(b2.toString());
		
		//Creacion de b3
		System.out.println("Creacion de b3:");
		b3=new Bombilla (true);
		System.out.println(b3.toString());
		
		System.out.printf("Numero de bombillas creadas: %d.\n", Bombilla.numBombillasCreadas());
		System.out.printf("Numero de bombillas encendidas: %d.\n", Bombilla.numBombillasEncendidas());

	}

}
