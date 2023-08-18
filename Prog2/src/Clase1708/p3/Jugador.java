package Clase1708.p3;

public class Jugador {

	private int puntos;
	private String nickname;
	private Cubilete cubilete;
	
	public Jugador(String nickname) {
		this.nickname = nickname;
		this.puntos = 0;
		// indicado x chatgpt funciona: this.cubilete = new Cubilete(2);
	}
	
	public int tomarTurno(Cubilete cubilete) {
		return cubilete.tirar();
	}
	
	public void incrementarPuntos() {
		//this.puntos++;
		
		this.incrementarPuntos(1);
	}
	
	public void incrementarPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public void resetearPuntos() {
		this.puntos = 0;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public String getNickname() {
		return this.nickname;
	}
}
