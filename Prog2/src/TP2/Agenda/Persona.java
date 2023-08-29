package TP2.Agenda;

public class Persona {

	private String nombre;
	private String mail;
	private int nro;
	
	public Persona(String nombre, String mail, int nro) {
		this.nombre = nombre;
		this.mail = mail;
		this.nro = nro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
	
}
