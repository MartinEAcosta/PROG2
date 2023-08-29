package TP2.Agenda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {
	
	private String ubicacion;
	private String tema;
	private LocalDate fecha;
	private LocalTime inicio;
	private Duration duracion;
	private ArrayList<Persona> Personas;
	
	public Reunion(String ubicacion, String tema,LocalDate fecha, LocalTime inicio, Duration duracion) {
		this.ubicacion = ubicacion;
		this.tema = tema;
		this.fecha = fecha;
		this.inicio = inicio;
		this.duracion = duracion;
		this.Personas = new ArrayList<>();
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return inicio;
	}

	public void setHoraInicio(LocalTime inicio) {
		this.inicio = inicio;
	}

	public ArrayList<Persona> getPersonas() {
		return Personas;
	}
	
	public LocalTime getHoraFin() {
		return this.getHoraInicio().plus(duracion);
	}
	
	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		Personas = personas;
	}
	
	public void addPersonas(Persona x) {
		if(!this.Personas.contains(x)) {
			this.Personas.add(x);
			System.out.println("Persona agregada con exito.");
		}
		else
			System.out.println("La persona ya ha sido agregada a la reunion anteriormente.");
	}
	
	
}

