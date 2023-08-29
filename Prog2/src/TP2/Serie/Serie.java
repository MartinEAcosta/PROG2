package TP2.Serie;

import java.util.ArrayList;

public class Serie {
	
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	
	private ArrayList<Temporada> temporadas;
	
	public Serie() {
		this.temporadas = new ArrayList<>();
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTotalVistos() {
		int cant = 0;
		for(int i = 0; i < temporadas.size();i++) {
			cant += this.temporadas.get(i).getEpisodiosVistos();
		}
		return cant;
	}
	
	public boolean vioTodo() {
		boolean loVio = false;
		for (int i = 0; i < temporadas.size(); i++) {
			if (this.temporadas.get(i).vioTodos()) {
				loVio = this.temporadas.get(i).vioTodos();
			}
			loVio = this.temporadas.get(i).vioTodos();
		}
		return loVio;
	}
	
	public int promCalif() {
		int cant = 0;
		int promSerie = 0;
		for(int i = 0; i < temporadas.size();i++) {
			promSerie += this.temporadas.get(i).getPromedioCalificiacion();
			cant++;
		}
		return promSerie/cant;
	}
	
}
