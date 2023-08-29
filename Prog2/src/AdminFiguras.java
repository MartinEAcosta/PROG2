
import Clase2208.p2.Figura;
import Clase2208.p2.MedioCirculo;
import Clase2208.p2.Rectangulo;
import Clase2208.p2.Circulo;
public class AdminFiguras {
	
	public void imprimir(Figura rr) {
		System.out.println("Figura: " + rr.getNombre() +
							"Area: "+ rr.getArea() + 
							" Perimetro: "+ rr.getPerimetro());
	}
	
	public static void main(String[] args) {
		
		AdminFiguras aa =new AdminFiguras();
		Rectangulo rr1 = new Rectangulo(10,10);
		aa.imprimir(rr1);
		Circulo cc1 = new Circulo(10);
		aa.imprimir(cc1);
		
		MedioCirculo mc1 = new MedioCirculo(10);
		System.out.println(mc1.getArea());
		System.out.println(mc1.getPerimetro());
		mc1.getRadio();
		
		System.out.println(mc1.getDatosCompletos());
		System.out.println(cc1.getDatosCompletos());
		System.out.println(rr1.getDatosCompletos());
	}

}
