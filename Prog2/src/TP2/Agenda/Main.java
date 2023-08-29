package TP2.Agenda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reunion a = new Reunion("Tandil", "Juntada a estudiar prog",LocalDate.of(2023,Month.AUGUST, 25), LocalTime.of(20,30),Duration.ofHours(1));
		Reunion c = new Reunion("Taendil", "Juntada a estudiar prog",LocalDate.of(2023,Month.AUGUST, 25), LocalTime.of(20,30),Duration.ofMinutes(120));
		Persona Juan = new Persona("Juan","juan@gmail.com", 2);
		Agenda miAgenda = new Agenda();
		a.addPersonas(Juan);
		c.addPersonas(Juan);
		miAgenda.addReunion(a);
		miAgenda.addReunion(c);
		System.out.println(miAgenda.getReuniones());
		
	}

}
