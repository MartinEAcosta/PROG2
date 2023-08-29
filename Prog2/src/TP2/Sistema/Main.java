package TP2.Sistema;

public class Main {

	public static void main(String[] args) {
		
		Ciudad tandil = new Ciudad("Tandil",100000,1);
		Ciudad aya = new Ciudad("aya",100000,1);
		Provincia bsas = new Provincia("bsas");
		Pais arg = new Pais("arg");
		
		arg.addProvincia(bsas);
		bsas.addCiudades(tandil);
		bsas.addCiudades(aya);
		bsas.gastaMasDeCuenta();
		System.out.println(bsas.mitadCiudades());
	}

}
