package TP1.ElementosGeometricos;

public class Main {

	public static void main(String[] args) {
		PuntoGeometrico zona = new PuntoGeometrico();
		
		
		zona.setCoordX(7.3);
		zona.setCoordY(2.5);
		System.out.println(zona.getCoordX());
		System.out.println(zona.getCoordY());
		
		Rectangulo nuevo = new Rectangulo();
		nuevo.setRectangulo(0, 0, 10, 5);
		System.out.println(nuevo.compararTamaño());
	}

}
