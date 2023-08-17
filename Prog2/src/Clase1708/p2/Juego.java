package Clase1708.p2;

public class Juego {

	//private int puntos1;
	//private int puntos2;
	private Jugador jugador1;
	private Jugador jugador2;
	private int MAXRONDAS;
	private int minimopuntaje;
	
	private Dado dado1;
	private Dado dado2;
	
	public static final int MAXD = 10;
	private int puntajedefault = 7;
	
	
	public Juego(int puntajedefault,Jugador j1,Jugador j2) {
		//this.setRondas(MAXD); se podria hacer asi pero seria repeticion de codigo al pedo
		this(MAXD, puntajedefault,j1,j2);
	}
	
	public Juego(int MAXRONDAS, int minimopuntaje, Jugador j1, Jugador j2) {
		this.jugador1 = j1;
		this.jugador2 = j2;
		// estoy creando los dados dentro del juego, es decir esta compuesto por el objeto dado tmb
		this.dado1 = new Dado();
		this.dado2 = new Dado();
				
		this.setRondas(MAXRONDAS);
		this.setMinimoPuntaje(minimopuntaje);
	}
	
	private void setMinimoPuntaje(int minimopuntaje) {
		this.minimopuntaje = puntajedefault;
		if(minimopuntaje >= 2)
			this.minimopuntaje = minimopuntaje;
		else
			this.minimopuntaje = puntajedefault;
	}
	
	public void setRondas(int MAXRONDAS) {
		if(MAXRONDAS >= 0)
			this.MAXRONDAS = MAXRONDAS;
		else
			this.MAXRONDAS = MAXD; //en caso de pasar un numero que sea menor = a 0 estableceria por defecto 10 rondas
	}
	
	public void jugar() {
		for(int i = 0; i < this.MAXRONDAS; i++) {
			//LO QUE ME PERMITIO HACER ES ACCEDER A EL METODO TIRAR DE LA CLASE DADOS
			int resultado1 = dado1.tirar() + dado2.tirar();
			int resultado2 = dado1.tirar() + dado2.tirar();
			
			if(resultado1 > resultado2 && resultado1 > puntajedefault)
				this.jugador1.incrementarPuntos();
			else
				if(resultado2 > resultado1 && resultado2 > puntajedefault)
					this.jugador2.incrementarPuntos();
		}
		int puntos1 = jugador1.getPuntos();
		int puntos2 = jugador2.getPuntos();
		
		if(puntos1 > puntos2)
			System.out.println("Gano jugador 1 : "+ jugador1.getNickname() + ", con una cantidad de puntos de: " + puntos1 + " A: " + puntos2 + " Del jugador 2");
		else
			if(puntos2 > puntos1)
				System.out.println("Gano jugador 2 : " + jugador2.getNickname() + ", con una cantidad de puntos de: " + puntos2 + " A: " + puntos1 + " Del jugador 1");
			else
				System.out.println("Empate");
				
	}

	
}
