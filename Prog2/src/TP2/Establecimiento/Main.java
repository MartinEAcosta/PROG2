package TP2.Establecimiento;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario martin = new Usuario ("martin","contraseña");
		Usuario pedrito = new Usuario ("pedrito","contraseña");
		Cancha c1 = new Cancha("Futbol","F5-C1");
		Cancha c2 = new Cancha ("Paddle", "PD-C1");
		
		Turno adm = new Turno(martin,"f",c1,LocalDate.of(2023, 8, 29),LocalTime.of(18, 0));
		Turno adm3 = new Turno(pedrito,"p",c2,LocalDate.of(2023, 8, 29),LocalTime.of(18, 30));
		c1.addTurno(adm);
		c2.addTurno(adm3);
		

		System.out.println(c1);
		
	}

}
