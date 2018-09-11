package clases.elementosEcosistema;

import java.awt.Dimension;
import java.awt.Point;

import clases.Ecosistema;

public class ColoniaAbejas extends ElementosEcosistema implements Evolucionable{
	
	private long poblacion;

	public ColoniaAbejas(String nombre, Point posicion, Dimension dimension) {
		super(nombre, posicion, dimension);
		poblacion = (long) Math.sqrt((dimension.getHeight()*dimension.getWidth()));
	}

	public long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}
	
	@Override
	public String toString() {
		return "Abejas: " + this.nombre + " - " + this.poblacion + " individuos - Posicion " + this.puntoInicio.x 
				+ "," + this.puntoInicio.y + " - Tamaño " + this.dimRectangulo.height + "," + this.dimRectangulo.width;
	}

	public void evolucionar(int dias) {
		double factorCrecimiento = 1.0;
		int numFlores = 0; 
		for (ElementosEcosistema ee : Ecosistema.getMundo().getElementos()) {    
			int dist = Ecosistema.distancia( this, ee );    
			if (ee instanceof ColoniaAbejas && ee!=this) {  
				if (dist < 500) factorCrecimiento = factorCrecimiento * dist / 500;    
			} else if (ee instanceof PlantacionFlores) {  
				if (dist < 500) factorCrecimiento = factorCrecimiento / dist * 500;    
				numFlores += ((PlantacionFlores)ee).getCantidad();       
			}
		}
		if (numFlores < 50) factorCrecimiento *= 0.1;    
		poblacion = (long) (poblacion * factorCrecimiento * dias);   
		if (poblacion > 5000) poblacion = 5000;   
	}
}
