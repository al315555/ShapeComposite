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
		String tabulacion=obtenerTabulacion();
		
		System.out.println(tabulacion+"Forma("+nombre+") {");
		
		for(FormaComponent fc: forma){
			System.out.print(tabulacion);fc.dibuja();
		}
		System.out.println(tabulacion+"}");
	}
	
	@Override
	public void anade(FormaComponent fc){
		if(fc.padre==null){
			forma.add(fc);
			fc.setPadre(this);
		}
	}

	@Override
	public void elimina(FormaComponent fc){
		forma.remove(fc);
		fc.setPadre(null);
	}
}
