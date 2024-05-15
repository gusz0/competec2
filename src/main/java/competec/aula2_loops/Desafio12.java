package competec.aula2_loops;

import java.util.Scanner;

public class Desafio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String senha = "12345"; // esta é a senha correta
        String tentativa = "";
        boolean senhaCorreta = false;
		// faça o loop que lê as tentativas de senhas e verifica se elas estão corretas.
		while (!senhaCorreta) {
            System.out.println("Digite a senha:");
            tentativa = scanner.nextLine();
		

		if (tentativa.equals(senha)) {
			senhaCorreta = true;
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
		}
		
	}
}
