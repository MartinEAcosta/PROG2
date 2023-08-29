 package TP2.Sistema;

import java.util.ArrayList;

public class Pais {

	private String nombre;
	private ArrayList<Provincia> Provincias;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		this.Provincias = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addProvincia(Provincia p) {
		Provincias.add(p);
	}
	public ArrayList<Provincia> getProvincias() {
		return Provincias;
	}

	public void setProvincias(ArrayList<Provincia> provincias) {
		Provincias = provincias;
	}
	
	public void chequeoProvincia() {
		for(Provincia p : Provincias) {
			if(p.mitadCiudades()) {
				System.out.println(p.getNombre()); 
			}
		}
	}
}
