package TP3.SisEncuestas;

import java.util.ArrayList;

public class Empleado {

	private String nombre;
	private int sueldo;
	
	private ArrayList<Encuesta> EncuestasRealizadasPorEl;
	
	private static int idEmpleado=0;
	private static final double plus = 200;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldo = 5000;
		idEmpleado++;
		EncuestasRealizadasPorEl= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Encuesta> getEncuestas() {
		return EncuestasRealizadasPorEl;
	}

	public void setEncuestas(ArrayList<Encuesta> encuestas) {
		EncuestasRealizadasPorEl = encuestas;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void addEncuesta(Encuesta nueva) {
		if(!this.EncuestasRealizadasPorEl.contains(nueva)) {
			if(!hizoUna(nueva)) {
				this.EncuestasRealizadasPorEl.add(nueva);
			}
			else {
				System.out.println("El usuario que estas intentando añadir ya respondio una encuesta.");
			}
		}
		else {
			System.out.println("La encuesta que quieres añadir ya se encuentra.");
		}
	}
	
	public boolean hizoUna(Encuesta x) {
		for(Encuesta e : EncuestasRealizadasPorEl) {
			if(e.getDni() == x.getDni()){
				return true;
			}
		}
		return false;
	}
	
	public void removeEncuesta(Encuesta existente) {
		if(this.EncuestasRealizadasPorEl.contains(existente)) {
			this.EncuestasRealizadasPorEl.remove(existente);
		}
		else {
			System.out.println("La encuestas que quieres eliminar no existe.");
		}
	}

	public int getSueldo() {
		return sueldo+getPlus();
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public int getPlus() {
		if(this.getCantidadEncuestasRealizadas() > 0) {
			return (int) plus*getCantidadEncuestasRealizadas();
		}
		else {
			return 0;
		}
		
	}
	
	public int getCantidadEncuestasRealizadas() {
		return this.EncuestasRealizadasPorEl.size();
	}
	
	
}
