package Clase2408;

public class PrismaRectangular extends Figura3d {

	private double l1,l2;
	
	
	public PrismaRectangular(double l1, double l2, double altura) {
		// ya que las formas van a tener todas altura las declaro en figura 3d y a travesdel super la paso
		super("PrismaRectangular",altura);
		this.l1 = l1;
		this.l2 = l2;
		
	}
	
	public double getVolumen() {
		return this.superficieBase()*this.getAltura();
	}
	
	public double getSuperficie() {
		return (l1*2+l2*2)*this.getAltura()+
				2*this.superficieBase(); 
	}
	
	public double superficieBase() {
		return l1*l2;
	}
	
}
