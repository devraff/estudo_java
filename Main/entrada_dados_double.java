package Main;

import java.util.Locale;
import java.util.Scanner;

public class entrada_dados_double {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f", x);
		
		sc.close();
	}
}
