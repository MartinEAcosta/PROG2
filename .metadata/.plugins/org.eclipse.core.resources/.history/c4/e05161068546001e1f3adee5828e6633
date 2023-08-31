package TP2.Establecimiento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cancha {
	
		private String tipo;
		private String nombre;
		
		private ArrayList<Cancha> Canchas;
		
		
		public Cancha(String tipo,String nombre) {
			this.tipo = tipo;
			this.nombre = nombre;
			this.Canchas = new ArrayList<>();
		}
		

		public void getCanchas() {
			for(Cancha c : Canchas) {
				System.out.println(c.toString());
			}
		}
		
		public void addCancha(Cancha nueva) {
			if(!this.Canchas.contains(nueva)) {
				this.Canchas.add(nueva);
			}
			else {
				System.out.println("El turno que estas intentando agregar esta ocupado.");
			}
		}
		
		public void removeCancha(Cancha existente) {
			if(this.Canchas.contains(existente)) {
				this.Canchas.remove(existente);
			}
			else {
				System.out.println("El turno que estas intentado remover no existe.");
			}
		}

		
		
		
}
