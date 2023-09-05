package TP2.Peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Peluquero {

	private String nombre;
	private int edad;
	private boolean ocupado;
	
	private ArrayList<Turno> Turnos;
	

	private static final LocalTime comienzoHorario = LocalTime.of(8, 00);
	private static final LocalTime finalizaHorario = LocalTime.of(20, 30);
	private static final int tiempoPredeterminado = 30;
	
	public Peluquero(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.Turnos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//---------------------------------
	
	public void addTurno(Turno nuevo) {
		if(!this.Turnos.contains(nuevo)) {
			if(estaDentroHorario(nuevo)) {
				if(!coincideConOtro(nuevo)) {
					this.Turnos.add(nuevo);
				}
			}
			else {
				System.out.println("No se ha podido añadir el turno, debido a que coincide con otro.");
				System.out.println("Por favor, busque otro horario.");
			}
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
	
	public boolean estaDentroHorario(Turno nuevo) {
		if(nuevo.getHora().isAfter(comienzoHorario) && nuevo.getHoraFin(tiempoPredeterminado).isBefore(finalizaHorario)) {
				return true;
		}
		else {
			return false;
		}
	}
	
	
}
