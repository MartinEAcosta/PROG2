package Clase1708.p3;

public class Jugador {

	private int puntos;
	private String nickname;
	
	public Jugador(String nickname) {
		this.nickname = nickname;
		this.puntos = 0;
	}
	
	public int tomarTurno(Dado dado1, Dado dado2) {
		return dado1.tirar() + dado2.tirar();
	}
	
	public void incrementarPuntos() {
		//this.puntos++;
		
		this.incrementarPuntos(1);
	}
	
	public void incrementarPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public String getNickname() {
		return this.nickname;
	}
}
