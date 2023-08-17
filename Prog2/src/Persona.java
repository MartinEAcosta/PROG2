//consulta no hay forma de declarar una variable edad que directamente tome el valor de getEdad, asi no la creo cada vez que la necesite

import java.time.LocalDate;
import java.time.Period;

//	ATRIBUTOS
public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fnac;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;
	
	private static int mayoriaEdad = 18;
	private static int aptoVotar = 16;
	
	//	CONSTRUCTORES
	public Persona(String nombre, String apellido, LocalDate fnac, int dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnac = fnac;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	// CONSTRUCTOR DNI
	public Persona(int dni) {
		this("N","N",LocalDate.of(2000,1,1),dni,"F",1,1);
	}
	// CONSTRUCTOR DNI NOMBRE APELLIDO
	public Persona(String nombre, String apellido, int dni) {
		this(nombre,apellido,LocalDate.of(2000, 1, 1),dni,"F",1,1);
	}
	//CONSTRUCTOR DNI NOMBRE APELLIDO FNAC
	
	public Persona (String nombre,String apellido, int dni, LocalDate fnac) {
		this(nombre,apellido,fnac,dni,"F",1,1);
	}
	
	
	// METODOS
	public String getInfoPersona() {
		return "Nombre:" + nombre + "," + " Apellido: " + apellido + "," + " Sexo: " + sexo + ", DNI: " + dni + ", Nacio: " + fnac + " Altura: " + altura + " Peso: " + peso;
	}
	
	public LocalDate getFnac() {
		return fnac;
	}
	
	public boolean esMayor() {
		int edad = getEdad();
		if(edad >= mayoriaEdad)
			return true;
		else
			return false;
	}
	
	public boolean puedeVotar() {
		int edad = getEdad();
		if(edad >= aptoVotar)
			return true;
		else
			return false;
	}
	public double getPeso(){
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getIMC(){
		double imc = peso/(altura*altura);
		return imc;
	}
	
	public int getEdad() {
		Period calculoEdad = Period.between(fnac, LocalDate.now());
		int edad = calculoEdad.getYears();
		return edad;
	}
	
	public boolean estaEnForma() {
		double imc = this.getIMC();
		if((imc>=18.5) && (imc<=25)) 
			return true;
		else
			return false;
	}
	
	public boolean cumpleAños() {
		Period cumple = Period.between(fnac, LocalDate.now());
		if((cumple.getDays() == 0) && (cumple.getMonths() == 0))
			return true;
		else
			return false;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}