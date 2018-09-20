package clases.elementosEcosistema;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

public abstract class ElementosEcosistema {

	protected String nombre;
	protected Point puntoInicio;
	protected Dimension dimRectangulo;
	
	public ElementosEcosistema(String nombre, Point puntoInicio, Dimension dimRectangulo) {
		this.nombre = nombre;
		this.puntoInicio = puntoInicio;
		this.dimRectangulo = dimRectangulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Point getPuntoInicio() {
		return puntoInicio;
	}

	public void setPuntoInicio(Point puntoInicio) {
		this.puntoInicio = puntoInicio;
	}

	public Dimension getDimRectangulo() {
		return dimRectangulo;
	}

	public void setDimRectangulo(Dimension dimRectangulo) {
		this.dimRectangulo = dimRectangulo;
	}
	
	public abstract JPanel getPanel();
}
