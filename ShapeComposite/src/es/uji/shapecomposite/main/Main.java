package es.uji.shapecomposite.main;

import es.uji.shapecomposite.shape.Circulo;
import es.uji.shapecomposite.shape.FormaComponent;
import es.uji.shapecomposite.shape.FormaNode;
import es.uji.shapecomposite.shape.Rectangulo;

public class Main {

public static void main(String[] args) {
		
		//Crea la forma principal
		
		FormaComponent formaPrin = new FormaNode("Principal");
		formaPrin.anade(new Rectangulo(10,10,20,20));
		formaPrin.anade(new Circulo(10,10,20));
		
		
		// Crea la forma interior
		
		FormaComponent formaInt = new FormaNode("Interna");
		FormaComponent r1 = new Rectangulo(2,2,3,3);
		FormaComponent r2 = new Rectangulo(3,3,4,4);
		formaInt.anade(r1);
		formaInt.anade(r2);
		formaInt.anade(new Circulo(1,1,20));
		
		// Añade la forma interior a la principal
		
		formaPrin.anade(formaInt);
		
		System.out.println("\nDibujo INICIAL: ");
		formaPrin.dibuja();
		
		System.out.println("\nDibujo tras desplazar: ");
		formaPrin.desplazaRelativo(100,100);
		formaPrin.dibuja();
		
		System.out.println("\nDibujo tras eliminar: ");
		formaInt.elimina(r1);
		formaInt.elimina(r2);
		formaPrin.dibuja();
	}

}
