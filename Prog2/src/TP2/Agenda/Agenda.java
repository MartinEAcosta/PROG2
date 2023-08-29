package TP2.Agenda;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Reunion> Reuniones;
	
	public Agenda() {
		this.Reuniones = new ArrayList<>();
	}

	public ArrayList<Reunion> getReuniones() {
		return Reuniones;
	}

	public void setReuniones(ArrayList<Reunion> reuniones) {
		Reuniones = reuniones;
	}
	
	public void addReunion(Reunion reunionNueva) throws Exception {
		if(this.Reuniones.contains(reunionNueva)) {
			throw new Exception("Ya has programado esta reunion");
		}
		for(Reunion r : Reuniones) {
			if(reunionNueva.getFecha().isEqual(r.getFecha())) {
				if(reunionNueva.getHoraInicio().isAfter(r.getHoraInicio()) && (reunionNueva.getHoraInicio().isBefore(r.getHoraFin()))) {
					throw new Exception("Superposicion de horarios"); 
				}
				else if(reunionNueva.getHoraInicio().equals(r.getHoraInicio())) {
					throw new Exception("Superposicion de horarios"); 
				}
			}
		}
		Reuniones.add(reunionNueva);	
	}
}
