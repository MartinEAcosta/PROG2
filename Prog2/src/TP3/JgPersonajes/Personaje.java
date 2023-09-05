package TP3.JgPersonajes;

public class Personaje {
	
	private String tipo;
	private String nombreReal;
	private String nombreSuperHeroe;
	private int edad;
	private int visionNoc;
	private int velocidad;
	private int fuerza;
	private int peso;
	private double altura;
	

	public Personaje(String tipo,String nombreReal, String nombreSuperHeroe, int edad, int visionNoc,
					int velocidad, int fuerza, int peso, double altura) {
		this.tipo = tipo;
		this.nombreReal = nombreReal;
		this.nombreSuperHeroe = nombreSuperHeroe;
		this.edad = edad;
		this.visionNoc = visionNoc;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.peso = peso;
		this.altura = altura;
	}


	public String getNombreReal() {
		return nombreReal;
	}


	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}


	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}


	public void setNombreSuperHeroe(String nombreSuperHeroe) {
		this.nombreSuperHeroe = nombreSuperHeroe;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getVisionNoc() {
		return visionNoc;
	}


	public void setVisionNoc(int visionNoc) {
		this.visionNoc = visionNoc;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getValorCaracteristica(String caracteristica) {
		switch(caracteristica) {
		case "visionNoc":
			return this.visionNoc;
		case "velocidad":
			return this.velocidad;
		case "fuerza":
			return this.fuerza;
		case "peso":
			return this.peso;
		default: 
			System.out.println("La caracteristica enviada por parametros no coincide con ninguna.");
			return 0;
		}
	}
	
	public void getAllCaracteristicas(Personaje p) {
		System.out.println("Nombre : " + p.getNombreReal());
		System.out.println("Nombre SuperHeroe : " + p.getNombreSuperHeroe());
		System.out.println("Edad : " + p.getEdad());
		System.out.println("Altura : " + p.getAltura());
		System.out.println("Fuerza : " + p.getFuerza());
		System.out.println("Peso : "+ p.getPeso());
		System.out.println("Velocidad : " + p.getVelocidad());
		System.out.println("Vision nocturna : " + p.getVisionNoc());
	}
	
}
