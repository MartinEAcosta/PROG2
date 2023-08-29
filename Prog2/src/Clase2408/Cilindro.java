package Clase2408;

public class Cilindro extends Figura3d {
	
	private double radio;
	
	
	public Cilindro(double radio, double altura) {
		super("Cilindro",altura);
		this.radio = radio;
		
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getVolumen() {
		return this.superficieBase()*this.getAltura();
	}
	
	public double getSuperficie() {
		return Math.PI*radio*2*this.getAltura()+
				2*this.superficieBase(); 
	}
	
	public double superficieBase() {
		return Math.PI*radio*radio;
	}
	
}
