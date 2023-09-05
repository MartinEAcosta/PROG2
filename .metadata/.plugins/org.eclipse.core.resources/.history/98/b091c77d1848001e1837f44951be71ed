package TP2.Peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Turno {

	private LocalDate dia;
	private LocalTime hora;
	private Peluquero pe;
	private Cliente cl;
	private int precio;
	
	private Peluquero Turnos;
	
	
	private static final int tiempoMinimo = 10;
	private static final int tiempoPredeterminado = 30;
	private static final double descuento = 0.1;
	private static final LocalTime comienzoHorario = LocalTime.of(8, 00);
	private static final LocalTime finalizaHorario = LocalTime.of(20, 30);
	
	public Turno(LocalDate dia, LocalTime hora, Peluquero pe, Cliente cl) {
		this.dia = dia;
		this.hora = hora;
		this.pe = pe;
		this.cl = cl;
		this.precio = 1200;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public void addTurno(Turno nuevo) {
		if(!this.Turnos.contains(nuevo)) {
			if(estaDentroHorario(nuevo)) {
				if(!nuevo.coincideConOtro(nuevo)) {
					this.Turnos.add(nuevo);
				}
			}
			else {
				System.out.println("No se ha podido añadir el turno, debido a que coincide con otro.");
				System.out.println("Por favor, busque otro horario.");
			}
		}
	}
	
	public void setHoraFin(Turno existente,int termina) {
		existente.getHoraFin(termina);
	}
	
	public LocalTime getHoraFin(int termina) {
		if(termina < tiempoMinimo) {
			return getHora().plusHours(termina);	
		}
		else {
			return getHora().plusMinutes(termina);
		}
		
	}
	
	public boolean estaDentroHorario(Turno nuevo) {
		if(nuevo.getHora().isAfter(comienzoHorario) && nuevo.getHoraFin(tiempoPredeterminado).isBefore(finalizaHorario)) {
				return true;
		}
		else {
			return false;
		}
	}
	
	public boolean coincideConOtro(Turno nuevo) {
		for(Turno existente : Turnos) {
			if(!this.Turnos.equals(nuevo)) {
				if(nuevo.getDia().equals(existente.getDia())) {
					if(nuevo.getHora().equals(existente)) {
						if(nuevo.getHora().isAfter(existente.getHora()) && nuevo.getHora().isBefore(existente.getHoraFin(tiempoPredeterminado))) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int cobrarCliente() {
		if(cl.esClienteFrecuente(cl)) {
			return (int) ((int) this.getPrecio()*descuento);
		}
		else {
			return this.getPrecio();
		}
	}
	
	// get primer turno y primer turno para un peluquero falta
	
}
