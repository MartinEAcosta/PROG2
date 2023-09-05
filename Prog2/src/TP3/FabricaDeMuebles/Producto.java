package TP3.FabricaDeMuebles;

public class Producto {

	private String nombre;
	private double peso;
	private String color;
	private String tipoMadera;
	private int costoFab;
	private int valorVenta;

	
	private static final double precioVenta = 1.35;
	
	public Producto(String nombre, double peso, String color,String tipoMadera,int costoFab) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.costoFab = costoFab;
		valorVenta = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCostoFab() {
		return costoFab;
	}

	public void setCostoFab(int costoFab) {
		this.costoFab = costoFab;
	}

	public int getValorVenta() {
		return (int) (valorVenta*precioVenta);
	}
	
	public int getValorVenta(int valorPorcentaje) {
		return (int) (valorVenta*valorPorcentaje);
	}

	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}

}
