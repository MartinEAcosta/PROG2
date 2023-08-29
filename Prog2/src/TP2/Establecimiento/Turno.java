package TP2.Establecimiento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Turno {
	
	private String deporte;
	private LocalDate dia;
	private LocalTime hora;
	
	
	private Usuario user;
	private Cancha cx;
	
	private ArrayList<Turno> Turnos;
	
	private static final int precioFut = 400;
	private static final int precioPad = 100;
	private static final double descuento = 0.9;
	private static final int hs = 1;
	
	
	public Turno(Usuario user,String deporte,Cancha cx, LocalDate dia, LocalTime hora) {
		this.user = user;
		this.cx = cx;
		this.deporte = deporte;
		this.dia = dia;
		this.hora = hora;
		this.Turnos = new ArrayList<>();
	}
	
	public int getPrice(String tipo) {
		if(tipo == "f") {
			if(this.user.isSocio())
				return (int) (precioFut * descuento);
			else
				return precioFut;
		}
		else if(tipo == "p") {
			if(this.user.isSocio())
				return (int) (precioPad * descuento);
			else
				return precioPad;
		}
		return 0;
	}
	
	public void addTurno(Turno nuevo) {
		if(!this.Turnos.contains(nuevo)) {
			this.Turnos.add(nuevo);
			this.getPrice(getDeporte());
		}
		else
			System.out.println("Ya se encuentra añadido.");
	}
	
	public void removeTurno(Turno existente) {
		if(this.Turnos.contains(existente))
			this.Turnos.remove(existente);
		else
			System.out.println("El turno que estas intentando eliminar no existe.");
	}
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
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
	
	public LocalTime getHoraFin() {
		return this.getHora().plusHours(hs);
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public void coincideConOtro(Turno x) {
		for(Turno turn : Turnos) {
			if(x.getDia().isEqual(turn.getDia())){
				if(x.getHora().isAfter(turn.getHora()) && x.getHora().isBefore(turn.getHoraFin())){
					System.out.println("El turno que quieres elegir ya ha sido reservado.");
				}
				else if(x.getHora().equals(turn.getHora())) {
					System.out.println("La hora elegida coincide con otro turno.");
				}
				else {
					this.Turnos.add(x);
				}
			}
			this.Turnos.add(x);
		}
	}
	
}
