import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// Al crear el objeto a se le pasa por parametro el numero dni 
		// Busca en los constructores los que coincidan con la cantidad de parametros y lo imprime
		Persona a = new Persona(5);
		Persona b = new Persona("Joan","Pradels",45);
		Persona c = new Persona("Martin","Acosta",5,LocalDate.of(2014, 8, 17));
		System.out.println(a.getInfoPersona());
		System.out.println(b.getInfoPersona());
		System.out.println(c.esMayor());
	}

}
