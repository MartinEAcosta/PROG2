package Clase2908;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColeccionDinamica cd = new ColeccionDinamica(110);
		
		for(int i = 0; i< 10 ;i++) {
			cd.addElemento("Elemento: " + i);
		}
		cd.removeElemento(0);
		cd.setElemento(2, "el2");
		cd.addElemento(2, "el222");
		
		for(int i = 0; i< cd.getSize() ;i++) {
			System.out.println(cd.getElemento(i));
		}
		
		
		cd.removeElemento("el2");
		
		for(int i = 0; i< cd.getSize() ;i++) {
			System.out.println(cd.getElemento(i));
		}
		
	}

}
