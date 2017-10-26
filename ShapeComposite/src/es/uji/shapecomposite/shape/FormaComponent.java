package es.uji.shapecomposite.shape;

public abstract class FormaComponent {

	/**
	 * Muestra por pantalla el nombre de la clase del objecto y su posicion
	 * **/
	public abstract void dibuja();

	/**
	 * Cambia la posición del objeto -> default:(0,0)
	 * **/
	public abstract void desplazaRelativo(int x, int y);

	/**
	 * 
	 * **/
	public void anade(FormaComponent fc) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * **/
	public void elimina(FormaComponent fc){
		throw new UnsupportedOperationException();
	}
}
