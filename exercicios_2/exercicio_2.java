package exercicios_2;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();

	}

}
