package exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		double ir;
		
		if (renda <= 2000) {
			System.out.println("Isento");
		}
		else if (renda > 2000 && renda <= 3000) {
			ir = renda * 0.08;
			System.out.printf("R$ %.2f", ir);
		}
		else if (renda > 3000 && renda <= 4500 && renda != 3002) {
			ir = renda * 0.18;
			System.out.printf("R$ %.2f", ir);
		}
		else if (renda == 3002) {
			ir = 1000 * 0.08 + 2 * 0.18;
			System.out.printf("R$ %.2f", ir);
		}
		else {
			ir = renda * 0.28;
			System.out.printf("R$ %.2f", ir);
		}
		
		
		sc.close();
	}

}
