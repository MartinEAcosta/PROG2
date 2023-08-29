package Clase2408.p2;

public class Circulo extends Figura{

	
	private double radio;
	
	public Circulo(double radio) {
		super("Circulo");
		this.setRadio(radio);
	}
	
	public void setRadio(double rr) {
		radio = Math.abs(rr);
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double getArea() {
		return Math.PI*radio*radio;
	}
	
	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
	
	public double getDiametro() {
		return 2*radio;
	}
	public String getDatosCompletos() {
		return this.getNombre() + ":" + this.getArea() + ":" + this.getPerimetro();
	}
}


