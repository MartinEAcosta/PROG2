package Clase2408.p2;
// Clase rectangulo hereda de figura
public class Rectangulo extends Figura{
	// recibe todos los atributos que tiene la clase figura por ej nombre
	
	private int lado1;
	private int lado2;
	//En la primera linea de el constructor creado se tiene que llamar al constructor padre de figura.
	public Rectangulo(int lado1, int lado2) {
		//utilizar this.setNombre("rectangulo") para poder dar un valor a la variable debido a que el atributo esta en privado en la clase figura
		super("Rectangulo");
		
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	// Esto funciona de manera que primeramente lo busca en la figura rectangulo luego si no lo cuentra viaja hasta figura y retorna el valor por default
	// Por lo cual se encarga de pisar la "indicacion" de Figura.
	public double getArea() {
		return lado1*lado2;
	}
	
	public double getPerimetro() {
		return 2*lado1+2*lado2;
	}
	
	public String getDatosCompletos() {
		return this.getNombre() + ":" + this.getArea() + ":" + this.getPerimetro();
	}
	
}
