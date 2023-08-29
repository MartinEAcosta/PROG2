package Clase2408.p2;

public class MedioCirculo extends Circulo{
	
	public MedioCirculo(double radio) {
		super(radio);
		this.setNombre("MedioCirculo");
	}
	
	public double getArea() {
		//Esto sirve directamente para que entre al getArea del padre (Circulo) y haga el calculo
		return super.getArea()/2;
	}
	
	public double getPerimetro() {
		return super.getPerimetro()/2+this.getDiametro();
	}
	public String getDatosCompletos() {
		return this.getNombre() + ":" + this.getArea() + ":" + this.getPerimetro();
	}
}
