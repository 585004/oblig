package no.hvl.dat100;

import java.util.Scanner;

public class oppgave6 {

	public static void main(String[] args) {
		// lage et program som leser inn et heltall n>0, deretter
		// beregner verdien n!.

		Scanner scanner = new Scanner(System.in);

		System.out.println(" Skriv et heltall: ");

		int nr = scanner.nextInt();
		int i, fact = 1;

		for (i = 1; i <= nr; i++) {

			fact = fact * i;
		}
		System.out.println("Fakultet av " + nr + " er: " + fact);

	}

}
