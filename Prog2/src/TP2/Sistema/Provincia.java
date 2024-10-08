package TP2.Sistema;

import java.util.ArrayList;

public class Provincia {

	private String nombre;
	private int gastoPublico;
	private int recaudado;
	private ArrayList<Ciudad> Ciudades;
	
	private static int divisor = 100000;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.Ciudades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ciudad> getCiudades() {
		return Ciudades;
	}
	
	public void addCiudades(Ciudad c) {
		if(!this.Ciudades.contains(c))
			Ciudades.add(c);
	}
	
	public void setCiudades(ArrayList<Ciudad> ciudades) {
		Ciudades = ciudades;
	}
	
	public boolean tieneDeficit(Ciudad estaTiene) {
		if(estaTiene.getGastoPublico() > estaTiene.getRecaudado()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getCantidadCiudades() {
		return Ciudades.size();
	}
	
	public void gastaMasDeCuenta() {
		for(Ciudad c : Ciudades) {
			if(tieneDeficit(c)) { 
				System.out.println(c.getNombre() + " tiene deficit.");
			}
		}
	}
	
	public int getRecaudadoProvincia() {
		recaudado = 0;
		for(Ciudad c : Ciudades) {
			recaudado+= c.getRecaudado();
		}
		return recaudado;
	}
	
	public int getGastoPublicoProvincia() {
		gastoPublico = 0;
		for(Ciudad c : Ciudades) {
			gastoPublico += c.getGastoPublico(); 
		}
		return gastoPublico;
	}
	
	public boolean mitadCiudades() {
		int contador = 0;
		int cantidad = getCantidadCiudades();
		for(Ciudad c : Ciudades) {
			if(c.getHabitantes()> divisor) {
				if(tieneDeficit(c)) {
					contador++;
				}
			}
			else
				cantidad--;
		}
		return (cantidad/2) < contador;
	}
}
