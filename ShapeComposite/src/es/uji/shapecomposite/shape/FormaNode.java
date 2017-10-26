package es.uji.shapecomposite.shape;

import java.util.LinkedList;
import java.util.List;

public class FormaNode extends FormaComponent{

	private List<FormaComponent> forma;
	private String nombre;

	public FormaNode(String nombre){
		super();
		this.forma= new LinkedList<FormaComponent>();
		this.nombre=nombre;
	}

	@Override
	public void desplazaRelativo(int x, int y) {
		for(FormaComponent fc: forma)
			fc.desplazaRelativo(x, y);
	}

	@Override
	public void dibuja() {
		System.out.println("Forma("+nombre+") {");
		for(FormaComponent fc: forma){
			fc.dibuja();
		}
		System.out.println("}");
	}

	@Override
	public void anade(FormaComponent fc){
		forma.add(fc);
	}

	@Override
	public void elimina(FormaComponent fc){
		forma.remove(fc);
	}
}
