package clases;

import java.util.ArrayList;

import clases.elementosEcosistema.ElementosEcosistema;

public class Ecosistema {

	private ArrayList<ElementosEcosistema> ListaElementosEco;
	private static Ecosistema mundo = new Ecosistema();

	public Ecosistema() {
		ListaElementosEco = new ArrayList<ElementosEcosistema>();
	}
	
	public ArrayList<ElementosEcosistema> getElementos() {
		return ListaElementosEco;
	}

	public void setListaElementosEco(ArrayList<ElementosEcosistema> listaElementosEco) {
		ListaElementosEco = listaElementosEco;
	}

	public static Ecosistema getMundo() {
		return mundo;
	}

	public static int distancia(ElementosEcosistema e1, ElementosEcosistema e2) {
		int distX = e2.getPuntoInicio().x - e1.getPuntoInicio().x;
		int distY = e2.getPuntoInicio().y - e1.getPuntoInicio().y;
		
		return (int) Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
	}
	
	
	
	
}
