package Clase1708.p3;

public class Cubilete {
	
	//private int cantDados;
	// esto estaria señalando a un arreglo que dentro de cada pos habria un objeto, x lo tanto seria un arreglo de objetos
	private Dado[] dados;
	
	public Cubilete(int cantDados) {
		//instacio la longitud del arreglo de objetos
		//this.cantDados = cantDados;
		this.dados = new Dado[cantDados];
		
		for(int i = 0; i < cantDados; i++)
			dados[i] = new Dado();
	}
	
	public int tirar() {
		int total = 0;
		for(int i = 0; i < dados.length; i++) {
			//esto lo que haria es recorrer el arreglo de dados y tiraria, retorna valor, suma, pasa al siguiente dado y asi sucesivamente
			int valor = dados[i].tirar();
			total = total + valor;
		}
		return total;
	}
	
	
	
}
