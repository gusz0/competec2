package competec.aula2_loops;

import java.util.Scanner;

public class Desafio22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int num = scanner.nextInt();

		for (int impar = 0; impar <= num; impar++) {
			if (impar%2 != 0) {
				System.out.println(impar);
			}


	}
}
