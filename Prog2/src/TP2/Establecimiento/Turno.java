package TP2.Establecimiento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Turno {
	
	private String deporte;
	private LocalDate dia;
	private LocalTime hora;
	
	
	private Usuario user;
	private Cancha Turno;
	
	private static final int precioFut = 400;
	private static final int precioPad = 100;
	private static final double descuento = 0.9;
	private static final int hs = 1;
	
	public Turno(Usuario user,String deporte,Cancha cx, LocalDate dia, LocalTime hora) {
		this.user = user;
		this.Turno = cx;
		this.deporte = deporte;
		this.dia = dia;
		this.hora = hora;
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
	
	
	
}
