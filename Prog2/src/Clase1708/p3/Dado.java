package Clase1708.p3;

public class Dado {
	
	public static final int CARASXDEFECTO = 6;
	private int caras;
	 
	public Dado() {
		 this.caras = CARASXDEFECTO;
	 }
	
	public Dado(int caras) {
		this.caras = caras;
	}
	
	public int tirar() {
		
		return (int)(Math.random() * this.caras) + 1;
	}
}
