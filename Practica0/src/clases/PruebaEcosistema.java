package clases;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.tree.MutableTreeNode;

import clases.elementosEcosistema.Agua;
import clases.elementosEcosistema.ColoniaAbejas;
import clases.elementosEcosistema.ElementosEcosistema;
import clases.elementosEcosistema.PlantacionFlores;

public class PruebaEcosistema {

	public static void main(String[] args) {
		Agua agua = new Agua("Lago", new Point(100, 100), new Dimension(200, 100));
		ColoniaAbejas abejas = new ColoniaAbejas("Colonia 1", new Point(300, 200), new Dimension(150, 50));
		PlantacionFlores flores = new PlantacionFlores("Rosal", new Point(500, 300), new Dimension(100, 100));
		
		Ecosistema.getMundo().getElementos().add(agua);
		Ecosistema.getMundo().getElementos().add(abejas);
		Ecosistema.getMundo().getElementos().add(flores);
		
		for (int i = 0; i < 4; i++) {
			for (ElementosEcosistema ee : Ecosistema.getMundo().getElementos()) {
				if (ee instanceof ColoniaAbejas && i != 0) {
					((ColoniaAbejas) ee).evolucionar(1);
				}else if (ee instanceof PlantacionFlores && i != 0){
					((PlantacionFlores) ee).evolucionar(1);
				}
				
				System.out.println(ee.toString());
			}	
		}
	}

}
