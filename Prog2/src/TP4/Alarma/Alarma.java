package TP4.Alarma;

public class Alarma {
	
	private boolean vidrioRoto;
	private boolean puertaAbierta;
	private boolean ventanaAbierta;
	private boolean movimientoDentro;
	
	private Timbre timbre;
	
	public Alarma(boolean vidrioRoto, boolean puertaAbierta, boolean ventanaAbierta, boolean movimientoDentro) {
		this.vidrioRoto = vidrioRoto;
		this.puertaAbierta = puertaAbierta;
		this.ventanaAbierta = ventanaAbierta;
		this.movimientoDentro = movimientoDentro;
	}
	
	public boolean hayMovimiento() {
		if(!vidrioRoto && !puertaAbierta && !ventanaAbierta && !movimientoDentro) {
			System.out.println("No se detecto ningun movimiento.");
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
	public void comprobar() {
		if(hayMovimiento()) {
			activarSenial();
		}
	}
	
	public void activarSenial() {
		this.timbre.hacerSonar();
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public boolean isVentanaAbierta() {
		return ventanaAbierta;
	}

	public boolean isMovimientoDentro() {
		return movimientoDentro;
	}
	
	
	
	
	
}
