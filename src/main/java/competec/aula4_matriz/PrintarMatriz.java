package competec.aula4_matriz;

public class PrintarMatriz {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] [] tabela = {{4, 6}, {1, 7}};

        for(int i = 0; i<2; i++); {
            for(int j = 0; j<2; j++); {
                System.out.print(tabela[i][j]+"");
            }
            System.out.println("");
        }

        // Usando dois loops (aninhados), printe todos os números dentro da matriz
        // Desafio adicional: deixe os números printados do formato de uma matriz
    }
}
