package TP1.ElementosGeometricos;

public class Rectangulo {
	private int x1, x2, y1, y2;
	private int nx1, nx2,ny1,ny2;
	private int ladox,ladoy;
	
	public static int alturaMinima = 3;
	//defino un rectangulo por default
	public Rectangulo () {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 10;
		this.y2 = 5;
	
	//defino los puntos default para un nuevo rectangulo el cual creara el usuario
		this.nx1 = 0;
		this.nx2 = 0;
		this.ny1 = 0;
		this.ny2 = 0;
	}
	
	//METODOS
	
	public int getArea(int x1, int x2, int y1, int y2) {
		//En caso de el rectangulo no ser inicializado en 0 busca su medida 
		int ancho = getAncho(x1,x2);
		int largo = getLargo(y1,y2);
		return ancho*largo; 
	}
	public int getAncho(int x1, int x2) {
		int mideX = (x2-x1);
		return mideX;
	}
	
	public int getLargo(int y1, int y2) {
		int mideY = (y2-y1);
		return mideY;
	}
	
	public boolean esUnCuadrado() {
		if(getAncho(x1,x2) == getLargo(y1,y2))
			return true;
		else
			return false;
	}
	
	public boolean estaAcostado() {
		if(getAncho(x1,x2) > getLargo(y1,y2))
			return true;
		else if(getAncho(x1,x2) == getLargo(y1, y2)) {
			System.out.println("Se trata de un cuadrado, por lo cual sus lados son simetricos");
			return false;
		}
		else
			return false;
	}
	
	public void setRectangulo(int nx1 ,int ny1, int nx2, int ny2) {
		if(nx1 < nx2 && ny1 < ny2 && ny1 != alturaMinima) {
			this.nx1 = nx1;
			this.nx2 = nx2;
			this.ny1 = ny1;
			this.ny2 = ny2;
		}
	}
	
	public int compararTamaño() {
		if(getArea(this.x1,this.x2,this.y1,this.y2) > getArea(this.nx1,this.nx2,this.ny1,this.ny2))
			return 1;
		else if(getArea(this.x1,this.x2,this.y1,this.y2) < getArea(this.nx1,this.nx2,this.ny1,this.ny2))
			return -1;
		else
			return 0;
	}
	
	
}
