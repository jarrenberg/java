package ejemploClaseBombo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Bombo bombo1=new Bombo(10);
		Bombo bombo2=new Bombo(70);
		Bombo bombo3=new Bombo();
		for(int i = 0; i<bombo1.listado.length;i++) {
		System.out.print(bombo1.extraerBola()+" ");
		}
		System.out.printf("\nBombos creados:%d\n",Bombo.bombosCreados);
	}

}
