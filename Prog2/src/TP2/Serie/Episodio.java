package TP2.Serie;

public class Episodio {
	
	private String titulo;
	private String descripcion;
	private boolean visto;
	private int calificacion;
	
	public Episodio(String titulo) {
		this.titulo = titulo;
		this.descripcion = "...";
		this.visto = false;
		this.calificacion = -1;
	}
	
	public Episodio() {
		
	}
	
	
	public void setCalificacion(int calificacion) {
		if(calificacion >= 0 && calificacion <= 5) {
			this.calificacion = calificacion;
			this.setVisto(true);
		}
		else
			System.out.println("El valor ingresado como calificacion no es correcto, no se ha actualizado el valor.");
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public boolean getVisto() {
		return visto;
	}


	public void setVisto(boolean visto) {
		this.visto = visto;
	}


	public int getCalificacion() {
		return calificacion;
	}
}
