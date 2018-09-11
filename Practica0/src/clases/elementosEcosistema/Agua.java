package clases.elementosEcosistema;

import java.awt.Dimension;
import java.awt.Point;

public class Agua extends ElementosEcosistema {
	
	protected long cantidad;
	
	public Agua(String nombre, Point posicion, Dimension dimension) {
		super(nombre,posicion,dimension);
		cantidad = (long) Math.sqrt((dimension.getHeight()*dimension.getWidth()));
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Agua: " + this.nombre + " - " + this.cantidad + "m3 - Posicion " + this.puntoInicio.x 
				+ "," + this.puntoInicio.y + " - Tamaño " + this.dimRectangulo.height + "," + this.dimRectangulo.width;
	}

	

}
