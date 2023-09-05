package TP3.ContactosCelu;

import java.util.ArrayList;

public class Celular {
	
	private ArrayList<Contacto> Contactos;
	
	public Celular() {
		this.Contactos = new ArrayList<>();
	}
	
	public int getCantidad() {
		return this.Contactos.size();
	}
	
	public int getCantidadRepetido() {
		int contador = 0;
		for(int i = 0; i < Contactos.size();i++) {
			for(int j = i+1; j < Contactos.size();j++) {
				if(Contactos.get(i).getNombre().equals(Contactos.get(j).getNombre()) && 
					Contactos.get(i).getApellido().equals(Contactos.get(j).getApellido()) && 
					Contactos.get(i).getNumero() == Contactos.get(j).getNumero()) { 
						contador++;
				}
			}
		}
		return contador;
	}
	
	public void getRepetidos() {
		for(int i = 0; i < Contactos.size();i++) {
			for(int j = i+1; j < Contactos.size();j++) {
				if(Contactos.get(i).getNombre().equals(Contactos.get(j).getNombre()) && 
					Contactos.get(i).getApellido().equals(Contactos.get(j).getApellido()) && 
					Contactos.get(i).getNumero() == Contactos.get(j).getNumero()) { 
					System.out.println(Contactos.get(i).getNombre() + Contactos.get(i).getApellido() + Contactos.get(i).getNumero());
					
				}
			}
		}
	}
	
	public int getPromedioEdad() {
		int contador = 0;
		int sumEdad = 0;
		for(Contacto c : Contactos) {
			sumEdad += c.getEdad();
			contador++;
		}
		return sumEdad/contador;
	}
	
	public void addContacto(Contacto nuevo) {
		this.Contactos.add(nuevo);
	}
	
	public void removeContacto(Contacto existente) {
		if(this.Contactos.contains(existente)) {
			this.Contactos.remove(existente);
		}
		else {
			System.out.println("El contacto que quieres eliminar no existe.");
		}
	}
	
	public void getAll() {
		for(Contacto c :Contactos) {
			System.out.println("------------");
			System.out.println(c.getNombre());
			System.out.println(c.getApellido());
			System.out.println(c.getNumero());
			System.out.println(c.getEdad());
			System.out.println(c.getCiudad());
			System.out.println("------------");
		}
	}
}
