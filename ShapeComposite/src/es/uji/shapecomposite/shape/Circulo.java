package es.uji.shapecomposite.shape;

public class Circulo extends FormaComponent{
	private int x, y, radio;

	public Circulo(int x, int y, int radio){
		super();
		this.x=x;
		this.y=y;
		this.radio=radio;
	}
	

	@Override
	public void dibuja() {
		String tabulacion=obtenerTabulacion();
		System.out.println(tabulacion+"Circulo("+x+", "+y+", "+radio+")");
	}

	@Override
	public void desplazaRelativo(int x, int y) {
		x+=x;
		y+=y;
	}
}
