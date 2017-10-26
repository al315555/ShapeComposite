package es.uji.shapecomposite.shape;

public abstract class FormaComponent {

	protected FormaComponent padre=null;
	
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
	
	/**
	 * 
	 * **/
	public int profundidad(){return padre!=null?padre.profundidad()+1:0;}
	
	protected void setPadre(FormaComponent padre){this.padre=padre;}
	
	protected String obtenerTabulacion(){
		String tabulacion="";
		for(int i=0;i<this.profundidad();i++)
			tabulacion+="\t";
		return tabulacion;
	}
}
