package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		DiaSemana dia;

		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

		dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

		System.out.println();
	}

}
