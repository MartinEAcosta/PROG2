package TP4.AlarmaSensorial;

public class Main {

	public static void main(String[] args) {

	Alarma casa = new Alarma();
	Sensor Cocina = new Sensor("Puerta Cocina");
	Sensor living = new Sensor("Puerta living");
	
	casa.addSensor(Cocina);
	casa.addSensor(living);
	living.setActivo(true);
	casa.comprobar();
	}
}	
