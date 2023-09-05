package TP3.SisEncuestas;


public class Encuesta {

	private String nombre;
	private int dni;
	private Empleado xEmpleado;
	private String sectorDestinado;
	
	public Encuesta(String nombre,int dni,Empleado xEmpleado, String sectorDestinado) {
		this.nombre = nombre;
		this.dni = dni;
		this.xEmpleado = xEmpleado;
		this.sectorDestinado = sectorDestinado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}

	public Empleado getxEmpleado() {
		return xEmpleado;
	}

	public String getSectorDestinado() {
		return sectorDestinado;
	}	
	
}
