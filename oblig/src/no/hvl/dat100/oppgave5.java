package no.hvl.dat100;

import java.util.Scanner;

public class oppgave5 {

	public static void main(String[] args) {

		// skriver et program som leser in poengsumet til en elev
		// og regne ut karakter.

		for (int i = 0; i < 10; i++)

		{

			Scanner scanner = new Scanner(System.in);

			boolean valid = true;
			double Poengsum = 0;

			while (valid) {

				System.out.println(" skriv poengsum:  ");
				Poengsum = (int) scanner.nextDouble();

				if (Poengsum >= 90 && Poengsum <= 100) {

					System.out.println("karakter A");
				} else if (Poengsum >= 80 && Poengsum <= 89) {

					System.out.println("karakter B");

				} else if (Poengsum >= 60 && Poengsum <= 79) {

					System.out.println("karakter c");

				} else if (Poengsum >= 50 && Poengsum <= 59) {

					System.out.println(" karakter D");

				} else if (Poengsum >= 40 && Poengsum <= 49) {
					System.out.println(" karakter E");

				} else if (Poengsum >= 0 && Poengsum <= 39) {
					System.out.println(" karakter F");

				}

				if (Poengsum > 100 && Poengsum < 0) {

					valid = false;

					System.out.println("ugylig poengsum");
					scanner.hasNextBoolean();
				}

			}

		}
	}
}