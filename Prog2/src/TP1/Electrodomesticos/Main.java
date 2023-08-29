package TP1.Electrodomesticos;

public class Main {

	public static void main(String[] args) {
		Electrodomestico lavarropas = new Electrodomestico();
		
		lavarropas.setConsumo(33);
		System.out.println(lavarropas.getConsumo());
		System.out.println(lavarropas.calcularBalance());
	}

}
