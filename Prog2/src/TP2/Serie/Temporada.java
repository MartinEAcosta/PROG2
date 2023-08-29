package TP2.Serie;

import java.util.ArrayList;

public class Temporada {

	private int numero;
	private ArrayList<Episodio> episodios;
	
	public Temporada(int numero) {
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void addEpisodio(Episodio e) {
		this.episodios.add(e);
	}
	
	public int getEpisodiosVistos() {
		int contador = 0;
		for(int i = 0; i < episodios.size(); i++) {
			Episodio e = this.episodios.get(i);
			if(e.getVisto()) {
				contador++;
			}
		}
		return contador;
	}
	
	public int getPromedioCalificiacion() {
		int suma = 0;
		int cant = 0;
		for(int i = 0; i < episodios.size(); i++) {
			suma += this.episodios.get(i).getCalificacion();
			cant++;
		}
		return suma/cant;
	}
	
	public boolean vioTodos() {
		return this.episodios.size() == this.getEpisodiosVistos();
	}
	
}
