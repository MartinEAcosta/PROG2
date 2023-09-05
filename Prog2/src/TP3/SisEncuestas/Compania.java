package TP3.SisEncuestas;

import java.util.ArrayList;

public class Compania {

	private ArrayList<Empleado> Empleados;
	private ArrayList<Encuesta> Encuestas;
	public Compania() {
		Empleados = new ArrayList<>();
		Encuestas = new ArrayList<>();
	}
	
	public void addEmpleado(Empleado nuevo) {
		if(!this.Empleados.contains(nuevo)) {
			this.Empleados.add(nuevo);
		}
		else {
			System.out.println("El empleado ya esta contratado.");
		}
	}
	
	public int getCantidadEmpleados() {
		return Empleados.size();
	}
	
	public void removeEmpleado(Empleado existente) {
		if(this.Empleados.contains(existente)){
			this.Empleados.remove(existente);
		}
		else {
			System.out.println("No se puede remover un empleado que no esta contratado.");
		}
	}
	
	public void addEncuesta(Encuesta nueva) {
		if(!this.Encuestas.contains(nueva)) {
			this.Encuestas.add(nueva);
		}
		else {
			System.out.println("No puedes añadir esta encuesta, debido a que ya se encuentra.");
		}
	}
	
	public void removeEncuesta(Encuesta existente) {
		if(this.Encuestas.contains(existente)) {
			this.Encuestas.remove(existente);
		}
		else {
			System.out.println("La encuesta que estas intentando remover no existe.");
		}
	}
	
	
	
	
}
