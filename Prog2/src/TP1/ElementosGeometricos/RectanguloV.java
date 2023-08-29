package TP1.ElementosGeometricos;

public class RectanguloV {
	private int ladox;
	private int ladoy;
	private int x;
	private int y;
	
	private int nladox,nladoy;
	
	public RectanguloV(int ladox,int ladoy, int x ,int y) {
		this.ladox = ladox;
		this.ladoy = ladoy;
		this.x = x;
		this.y = y;
		
	}
	
	public int getArea(int ladox, int ladoy) {
		//En caso de el rectangulo no ser inicializado en 0 busca su medida 
		return ladox*ladoy; 
	}
	public int getAncho(int x1, int x2) {
		return ladox;
	}
	
	public int getLargo(int y1, int y2) {
		return ladoy;
	}
	
	public boolean esUnCuadrado() {
		if(this.ladox == this.ladoy)
			return true;
		else
			return false;
	}
	
	public boolean estaAcostado() {
		if(this.ladox > this.ladoy)
			return true;
		else if(this.ladox == this.ladoy) {
			System.out.println("Se trata de un cuadrado, por lo cual sus lados son simetricos");
			return false;
		}
		else
			return false;
	}
	
	public void setRectangulo(int ladox,int ladoy, int x, int y) {
		this.ladox = ladox;
		this.ladoy = ladoy;
		this.x = x;
		this.y = y;
	}
	
	public int compararTamaño() {
		if(getArea(ladox,ladoy) > getArea(nladox,nladoy))
			return 1;
		else if(getArea(ladox,ladoy) < getArea(nladox,nladoy))
			return -1;
		else
			return 0;
	}
}
