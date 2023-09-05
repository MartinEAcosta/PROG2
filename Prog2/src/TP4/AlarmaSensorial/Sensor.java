package TP4.AlarmaSensorial;

public class Sensor {
	
	private String nombreZona;
	private boolean activo;
	
	public Sensor(String nombreZona) {
		this.nombreZona = nombreZona;
		this.activo = false;
	}

	public String getNombreZona() {
		return nombreZona;
	}

	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
