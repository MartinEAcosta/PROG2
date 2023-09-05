package TP4.AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
	
	private Timbre timbre;
	private ArrayList<Sensor> Sensores;
	
	private int numSensores;
	
	public Alarma() {
		this.Sensores = new ArrayList<>();
		this.numSensores = Sensores.size();
		this.timbre = new Timbre();
		}
	
	public void addSensor(Sensor nuevo) {
		if(!this.Sensores.contains(nuevo)) {
			this.Sensores.add(nuevo);
		}
		else {
			System.out.println("La zona que quieres añadir ya se encuentra.");
		}
	}
	
	public void removeSensor(Sensor existente) {
		if(this.Sensores.contains(existente)) {
			this.Sensores.remove(existente);
		}
		else {
			System.out.println("La zona que quieres remover no existe.");
		}
	}
	
	public int getNumSensores() {
		return numSensores;
	}
	
	public void comprobar() {
		for(int i = 0; i<Sensores.size();i++) {
			if(this.Sensores.get(i).isActivo()) {
				System.out.println("Hay movimiento, zona: " + this.Sensores.get(i).getNombreZona());
				this.timbre.hacerSonar();
			}
			else {
				System.out.println("Zona bajo control: " + this.Sensores.get(i).getNombreZona());
			}
		}
	}
}
