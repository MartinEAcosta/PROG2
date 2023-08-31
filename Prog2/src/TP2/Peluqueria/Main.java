package TP2.Peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		Cliente pp = new Cliente("Carlitos","Tevez");
		Peluquero yo = new Peluquero("Messi",22);
		Turno primer = new Turno(LocalDate.of(2023, 8, 31), LocalTime.of(10, 30), yo , pp);
		
		yo.addTurno(primer);
	}

}
