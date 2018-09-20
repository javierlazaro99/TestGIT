package clases.elementosEcosistema;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Agua extends ElementosEcosistema {
	
	protected long cantidad;
	private JPanel panel;
	
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

	@Override
	public JPanel getPanel() {
		
		JLabel lNombre = new JLabel(nombre, SwingConstants.CENTER);
		JLabel lCantidad = new JLabel(Long.toString(cantidad), SwingConstants.CENTER);
		JLabel lAgua = new JLabel("Agua", SwingConstants.CENTER);
		
		if(panel == null) {
			JPanel pDevolver = new JPanel();
			pDevolver.setPreferredSize(dimRectangulo);
			
			pDevolver.setBackground(Color.blue);
			
			pDevolver.setLayout(new GridLayout(3, 1));
			pDevolver.add(lNombre);
			pDevolver.add(lCantidad);
			pDevolver.add(lAgua);
			
			panel = pDevolver;
			return panel;
		}else {
			return panel;
		}
	}
}
