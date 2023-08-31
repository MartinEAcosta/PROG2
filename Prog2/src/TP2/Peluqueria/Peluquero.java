package TP2.Peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Peluquero {

	private String nombre;
	private int edad;
	private boolean ocupado;
	
	private ArrayList<Turno> Turnos;
	
	public Peluquero(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
	
}
