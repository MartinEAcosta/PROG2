package TP3.JgPersonajes;

import java.util.ArrayList;

public class Juego {

	private ArrayList<Personaje> Personajes;
	
	
	public Juego() {
		this.Personajes = new ArrayList<>();
	}
	
	public void addPersonaje(Personaje nuevo) {
		if(!this.Personajes.contains(nuevo)) {
			this.Personajes.add(nuevo);
		}
		else {
			System.out.println("El personajes que estas intentando añadir ya se encuentra.");
		}
	}
	
	public void removePersonaje(Personaje existente) {
		if(this.Personajes.contains(existente)) {
			this.Personajes.remove(existente);
		}
		else {
			System.out.println("El personaje que estas intentando remover no existe.");
		}
	}
	
	public void enfrentar(Personaje p1, Personaje p2) {
		if(!p1.equals(p2)) {
			System.out.println("Que comience la batalla.");
			System.out.println(p1.getNombreSuperHeroe() + " VS " + p2.getNombreSuperHeroe());
			jugar(p1,p2);
		}
	}
	
	public void jugar(Personaje p1, Personaje p2) {
		String caracteristica = obtenerCaracteristicaAleatoria();
		
		int valorP1 = p1.getValorCaracteristica(caracteristica);
		int valorP2 = p2.getValorCaracteristica(caracteristica);
		
		if(valorP1 > valorP2) {
			System.out.println(p1.getNombreSuperHeroe()+ " Es el ganador.");
		}
		else if (valorP1 == valorP2) {
			jugar(p1,p2);
		}
		else {
			System.out.println(p2.getNombreSuperHeroe()+ " Es el ganador.");
		}
	}

	public String obtenerCaracteristicaAleatoria() {
		String [] caracteristicas = {"visionNoc","velocidad","fuerza","peso"};
        int indiceCaracteristica = (int) (Math.random() * 4);
		return caracteristicas[indiceCaracteristica];
	}
	

}
