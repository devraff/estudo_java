package exercicios_1;

import java.util.Locale;
import java.util.Scanner;

public class ex_iniciante6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double atriangulo = A * C / 2;
		double acirculo = pi * Math.pow(C, 2);
		double atrapezio = C * (A + B) / 2;
		double aquadrado = Math.pow(B, 2);
		double aretangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", atriangulo);
		System.out.printf("CIRCULO: %.3f%n", acirculo);
		System.out.printf("TRAPEZIO: %.3f%n", atrapezio);
		System.out.printf("QUADRADO: %.3f%n", aquadrado);
		System.out.printf("RETANGULO: %.3f%n", aretangulo);

		
		sc.close();
	}

}
