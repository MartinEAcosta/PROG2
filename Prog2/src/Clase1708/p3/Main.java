package Clase1708.p3;

public class Main {

	public static void main(String[] args) {
		
		Jugador pepe = new Jugador("pp");
		Jugador kach = new Jugador("kach");
		Juego juego1 = new Juego(7,pepe,kach);
		
		juego1.jugar();
		
	}

}
