package Main;

import java.util.Locale;
import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			Double C = sc.nextDouble();
			Double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Faharenheit: %.1f%n", F);
			System.out.printf("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp == 's');

		sc.close();
	}

}
