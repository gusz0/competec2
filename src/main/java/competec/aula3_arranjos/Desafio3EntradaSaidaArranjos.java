import java.util.Scanner;

// package competec.aula3_arranjos;

public class Desafio3EntradaSaidaArranjos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Coletar tamanho arranjo
		System.out.println("Digite o tamanho do arranjo:");
		int tamanho = scanner.nextInt();

		int arranjo [] = new int [tamanho];
		// Preencher arranjo
		System.out.println("Preencher arranjo:");
		for (int iterador = 0; iterador < tamanho; iterador++) {
			arranjo[iterador] = scanner.nextInt();
		}
		// Impremir arranjo

		/*
		 * Desafio extra:
		 * Crie outro arranjo e inverta a ordem dos valores do primeiro arranjo.
		 */

	}

}
