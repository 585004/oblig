package no.hvl.dat100;

import java.util.Scanner;

public class oppgave4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" Skriv bruttointekten = ");
		double Bruttointekt = scanner.nextDouble();

		final double Sats0 = 0;

		final double Sats1 = 0.0093;

		final double Sats2 = 0.0241;

		final double Sats3 = 0.1152;

		final double Sats4 = 0.1452;

		double Skatt1 = 0;

		if (Bruttointekt <= 164100) {

			double Trinnskatt = 0;

			System.out.println(" Trinnskatt = kr 0");

		}

		else if (Bruttointekt <= 230951 && Bruttointekt >= 164101) {

			Skatt1 = Sats1 * Bruttointekt;

			System.out.println(" Trinnskatt = kr " + Skatt1);

		}

		else if (Bruttointekt <= 580650 && Bruttointekt >= 230951) {

			Skatt1 = Sats2 * Bruttointekt;

			System.out.println(" Trinnskatt = kr " + Skatt1);

		}

		else if (Bruttointekt <= 934050 && Bruttointekt >= 580651) {

			Skatt1 = Sats3 * Bruttointekt;

			System.out.println(" Trinnskatt = kr " + Skatt1);

		} else if (Bruttointekt >= 934051) {

			Skatt1 = Sats4 * Bruttointekt;

			System.out.println(" Trinnskatt = kr " + Skatt1);

		}

	}
}