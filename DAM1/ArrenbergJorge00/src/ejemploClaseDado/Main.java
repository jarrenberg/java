package ejemploClaseDado;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Dado dado = new Dado(12);
		Dado dado1=new Dado();
		System.out.println(dado1.toString());
		int numRandom;
		
		for (int i = 0; i < dado1.getNumCaras()-1; i++) {
			System.out.printf("%s ",dado1.lanzar());
		}
		System.out.println();
		for (int i = 0; i < (dado.getNumCaras()); i++) {
			System.out.printf("%s ",dado.lanzar());
		}
		System.out.println("");
		System.out.println("");

		System.out.println("");
		System.out.println("NUMERO DE VECES QUE HA SALIDO EL 5 EN DADO: "+dado.getVecesCara(5));
		System.out.println("NUM DADOS CREADOS: "+Dado.getNumDados());
		System.out.println("NUM LANZAMIENTOS DADO1: "+dado1.getNumLanzamientos());
		System.out.println("NUM LANZAMIENTOS DADO: "+dado.getNumLanzamientos());
		System.out.println("NUM LANZAMIENTO HECHO POR LOS DADOS:"+Dado.getNumLanzamientosGlobal());
	}

}
