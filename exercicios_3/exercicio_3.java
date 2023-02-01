package exercicios_3;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		
		while(combustivel <= 4) {
			if (combustivel == 1) {
				Alcool += 1;
				
			}
			
			else if (combustivel == 2) {
				Gasolina += 1;
			}
			
			else if (combustivel == 3) {
				Diesel += 1;
			
			}
			
			combustivel = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		
		sc.close();
	}

}
