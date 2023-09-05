package TP4.Alarma;

public class AlarmaLuminosa extends Alarma {
	
	private Timbre timbre;
	private Luz luz;
	
	public AlarmaLuminosa(boolean vidrioRoto, boolean puertaAbierta, boolean ventanaAbierta, boolean movimientoDentro) {
		super(vidrioRoto, puertaAbierta, ventanaAbierta,movimientoDentro);
	}
	
	public void activarSenial() {
		this.timbre.hacerSonar();
		this.luz.encender();
	}
}
