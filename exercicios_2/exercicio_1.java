package exercicios_2;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if ( n < 0 ) {
			System.out.println("Negativo");
		}

		else {
			System.out.println("Não negativo");
		}

		sc.close();
	}
}
