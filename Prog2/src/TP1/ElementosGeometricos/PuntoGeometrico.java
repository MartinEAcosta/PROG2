package TP1.ElementosGeometricos;

public class PuntoGeometrico {
	//ATRIBUTOS
	private double X;
	private double Y;
	//CONSTRUCTOR
	public PuntoGeometrico() {
		this.X = 0;
		this.Y = 0;
	}
	//GET
	public double getCoordX() {
		return X;
	}
	
	public double getCoordY() {
		return Y;
	}
	//SET
	public void setCoordX(double X) {
		this.X = X;
	}
	
	public void setCoordY(double Y) {
		this.Y = Y;
	}
	//METODOS
	//LO HICE DOUBLE PORQUE PUEDE HABER UN PUNTO IRRACIONAL EJ 2.19
	public double incrementarX(double desplazamientoX) {
		double nuevoValorX = this.X + desplazamientoX;
		return nuevoValorX;
	}
	public double incrementarY(double desplazamientoY) {
		double nuevoValorY = this.Y + desplazamientoY;
		return nuevoValorY;
	}
	public void desplazarPunto(double incrementoX , double incrementoY) {
		this.setCoordX(this.getCoordX()+incrementoX);
		this.setCoordY(this.getCoordY()+incrementoY);
	}
	
	public double getDistanciaEuclidea(PuntoGeometrico puntoNuevo) {
		return Math.sqrt(
				Math.pow(
						(this.getCoordX() - puntoNuevo.getCoordX()),2)
						+
				Math.pow(
						(this.getCoordY() - puntoNuevo.getCoordY()), 2));
	}
}
