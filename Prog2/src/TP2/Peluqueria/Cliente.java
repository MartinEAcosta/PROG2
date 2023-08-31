package TP2.Peluqueria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {

	
	private String nombre;
	private String apellido;
	private boolean clienteFrecuente;
	private LocalDate ultVez;
	
	
	private static final int frecuencia = 1;
	private static int id = 0;
	
	public Cliente(String nombre,String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.clienteFrecuente = false;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esClienteFrecuente(Cliente cl) {
		LocalDate hoy = LocalDate.now();
		long tiempoTranscurrido = ultVez.until(hoy, ChronoUnit.WEEKS);
		clienteFrecuente = false;
		if(tiempoTranscurrido < frecuencia) {
			return true;
		}
		else {
			return false;
		}
	}

	public LocalDate getUltVez() {
		return ultVez;
	}

	public void setUltVez(LocalDate ultVez) {
		this.ultVez = ultVez;
	}
	
	
}
