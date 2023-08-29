package Clase2408;

public class Figura3d {

	private String nombre;
	private double volumen;
	private double altura;
	
	
	public Figura3d(String nombre,double altura) {
		this.nombre = nombre;
		this.altura = altura;
	}
	
	public double getSuperficie() {
		return 0;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return 0;
	}
	
	public double superficieBase() {
		return 0;
	}
	
}
