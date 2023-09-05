package TP3.ContactosCelu;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
	
	private int numero;
	private String nombre;
	private String apellido;
	private LocalDate fechanac;
	private String direccion;
	private String mail;
	private String ciudad;
	
	public Contacto(int numero,String nombre, String apellido, LocalDate fechanac, String direccion, String mail, String ciudad) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.direccion = direccion;
		this.mail = mail;
		this.ciudad = ciudad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = periodo.between(this.fechanac, hoy);
		return periodo.getYears();
	}
	
	
}
