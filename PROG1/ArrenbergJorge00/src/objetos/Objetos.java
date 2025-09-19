package objetos;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class Objetos {

	public static void main(String[] args) {
		Point punto = new Point (5,4);
		Dimension dimension = new Dimension (4,5);
	
		//(declaracion)=(instanciacion)
	
		Rectangle rectangulo1 = new Rectangle();
		Rectangle rectangulo2 = new Rectangle(5,3);
		Rectangle rectangulo3 = rectangulo2;
		rectangulo3.x=5;
		
		Rectangle rectangulo4 = new Rectangle (5,4,4,5);
		Rectangle rectangulo5 = new Rectangle ();
		rectangulo5.setBounds(5,4,4,5);
		Rectangle rectangulo6 = rectangulo5;
		boolean contiene = rectangulo6.contains(6,5);
		if(contiene == true) {
			System.out.println("esta");
		}else {
			System.out.println("no esta");
		}
		
		Rectangle rectangulo7 = new Rectangle (punto, dimension);
		
		
		System.out.println(rectangulo1);
		System.out.println(rectangulo2);
		System.out.println(rectangulo3);
		System.out.println(rectangulo4);
		System.out.println(rectangulo7);
		
	}

}
