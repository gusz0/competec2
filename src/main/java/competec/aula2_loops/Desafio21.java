package competec.aula2_loops;

import java.util.Scanner;

public class Desafio21 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int num = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}


	}
}
