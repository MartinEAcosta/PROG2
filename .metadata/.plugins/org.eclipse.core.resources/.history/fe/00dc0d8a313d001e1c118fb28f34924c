package Clase1708;

public class Juego {

	private int puntos1;
	private int puntos2;
	private int MAXRONDAS;
	private int minimopuntaje;
	//podria llevar dados
	
	private static int MAXD = 10;
	private int puntajedefault = 7;
	
	
	public Juego() {
		//puntos1 = 0;
		//puntos2 = 0;
		//this.setRondas(MAXD); se podria hacer asi pero seria repeticion de codigo al pedo
		this(MAXD, puntajedefault);
	}
	
	public Juego(int MAXRONDAS, int minimopuntaje) {
		puntos1 = 0;
		puntos2 = 0;
		this.setRondas(MAXRONDAS);
		this.setMinimoPuntaje(minimopuntaje);
	}
	
	private void setMinimoPuntaje(int minimopuntaje2) {
		if(minimopuntaje >= 2)
			this.minimopuntaje = minimopuntaje;
		else
			this.minimopuntaje = puntajedefault;
	}

	public int getPuntos1() {
		return puntos1;
	}
	
	public int getPuntos2() {
		return puntos2;
	}
	
	public void setRondas(int MAXRONDAS) {
		if(MAXRONDAS >= 0)
			this.MAXRONDAS = MAXRONDAS;
		else
			this.MAXRONDAS = MAXD; //en caso de pasar un numero que sea menor = a 0 estableceria por defecto 10 rondas
	}
	
	public void jugar() {
		for(int i = 0; i < this.MAXRONDAS; i++) {
			int resultado1 = tirarDado() + tirarDado();
			int resultado2 = tirarDado() + tirarDado();
			
			if(resultado1 > resultado2 && resultado1 > puntajedefault)
				puntos1++;
			else
				if(resultado2 > resultado1 && resultado2 > puntajedefault)
					puntos2++;
		}
		if(puntos1 > puntos2)
			System.out.println("Gano jugador 1, con una cantidad de puntos de: " + puntos1 + " A: " + puntos2 + " Del jugador 2");
		else
			if(puntos2 > puntos1)
				System.out.println("Gano jugador 2, con una cantidad de puntos de: " + puntos2 + " A: " + puntos1 + " Del jugador 1");
			else
				System.out.println("Empate");
				
	}

	private int tirarDado() {
		
		return (int)(Math.random() * 6) + 1;
	}
	
}
