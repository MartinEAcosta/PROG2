package TP2.Serie;

public class Main {

	public static void main(String[] args) {
		Episodio e1 = new Episodio("1");
		Episodio e2 = new Episodio("2");
		Episodio e3 = new Episodio("3");
		Temporada t1 = new Temporada(1);
		
		t1.addEpisodio(e1);
		t1.addEpisodio(e2);
		t1.addEpisodio(e3);
		
		e1.setCalificacion(5);
		e2.setCalificacion(4);
		
		
		System.out.println(t1.vioTodos());
	}

}
