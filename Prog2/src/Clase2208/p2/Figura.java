package Clase2208.p2;

public class Figura {
	// en caso de ponerlo como protected la clase hija, conoce esta variable
	private String nombre;
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimetro() {
		return 0;
	}
	
	
}
