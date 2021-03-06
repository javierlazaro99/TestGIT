package clases.elementosEcosistema;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import clases.Ecosistema;

public class PlantacionFlores extends ElementosEcosistema implements Evolucionable {

	private long cantidad;
	private JPanel panel;

	public PlantacionFlores(String nombre, Point posicion, Dimension dimension) {
		super(nombre, posicion, dimension);
		cantidad = (long) Math.sqrt((dimension.getHeight() * dimension.getWidth()));
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Flores: " + this.nombre + " - " + this.cantidad + " unidades - Posicion " + this.puntoInicio.x 
				+ "," + this.puntoInicio.y + " - Tama�o " + this.dimRectangulo.height + "," + this.dimRectangulo.width;
	}

	public void evolucionar(int dias) {
		double factorCrecimiento = 0.75;   
		for (ElementosEcosistema ee : Ecosistema.getMundo().getElementos()) {    
			 int dist = Ecosistema.distancia( this, ee );   
			 if (ee instanceof ColoniaAbejas) {  
				 if (dist < 500) factorCrecimiento = factorCrecimiento / dist * 500;   
			 } else if (ee instanceof Agua) {  
				 if (dist < 500) factorCrecimiento = factorCrecimiento / dist * 500;      
			 } 
		}
		cantidad = (long) (cantidad * factorCrecimiento * dias);   
		if (cantidad > 5000) cantidad = 5000;	 
	}
	
	@Override
	public JPanel getPanel() {
		
		JLabel lNombre = new JLabel(nombre, SwingConstants.CENTER);
		JLabel lCantidad = new JLabel(Long.toString(cantidad), SwingConstants.CENTER);
		JLabel lFlores = new JLabel("Flores", SwingConstants.CENTER);
		
		if(panel == null) {
			JPanel pDevolver = new JPanel();
			
			pDevolver.setBackground(Color.green);
			pDevolver.setLayout(new GridLayout(3, 1));
			pDevolver.add(lNombre);
			pDevolver.add(lCantidad);
			pDevolver.add(lFlores);
			
			panel = pDevolver;
			return panel;
		}else {
			return panel;
		}
	}
}
