package TP1.Electrodomesticos;

public class Electrodomestico {
	private String nombre;
	private double preciobase;
	private String color;
	private double consumo;
	private double peso;
	
	public static int bajoconsumo = 45;
	public static int gestorgama = 3;
	

	public Electrodomestico() {
		this.color = "Gris";
		this.consumo = 10;
		this.preciobase = 100;
		this.peso = 2;
	}
	
	//Get
	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}
	public double getPrecioBase() {
		return preciobase;
	}
	public double getConsumo() {
		return consumo;
	}
	public double getPeso() {
		return peso;
	}
	
	// Set
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecioBase(double preciobase) {
		this.preciobase = preciobase;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean esBajoConsumo() {
		if(consumo < bajoconsumo)
			return true;
		else
			return false;
	}
	
	public double calcularBalance() {
		double balance = preciobase/peso;
		return balance;
	}
	
	public void calcularGama() {
		double balance = calcularBalance();
		if(balance > gestorgama)
			System.out.println("El producto es catalogado como Gama Alta");
		else
			System.out.println("El producto pertenece a Gama Media o Baja");
	}
}

