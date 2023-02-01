package exercicios_1;

import java.util.Locale;
import java.util.Scanner;

public class ex_iniciante4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String numfunc = sc.next();
		int horas = sc.nextInt();
		double valorhora = sc.nextDouble();
		double salario = valorhora * horas;
		
		System.out.println("NUMBER = " + numfunc);
		System.out.printf("SALARY = U$ %.2f" , salario);
		
		
		sc.close();
	}

}
