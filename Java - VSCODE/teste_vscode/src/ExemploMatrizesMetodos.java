
import java.util.Scanner;

public class ExemploMatrizesMetodos {

	// Método que define o tamanho da matriz
	public int[] tamanhoMatriz() { // método
		System.out.println("*- Tamanho da Matriz -*"); // print na tela para melhor entendimento do processo
		Scanner input = new Scanner(System.in); // instanciando o objeto de entrada dos dados
		int[] vetor = new int[2]; // instanciando uma lista chamada "vetor"
		System.out.println("Linhas: "); // print na tela para indicar que sera digitado a quantidade de linhas dessa
										// matriz
		vetor[0] = input.nextInt(); // usuario insere os dados através do input na lista "vetor"
		System.out.println("Colunas: "); // print na tela para indicar que sera digitado a quantidade de colunas dessa
											// matriz
		vetor[1] = input.nextInt(); // usuario insere os dados através do input na lista "vetor"
		return vetor; // retorna o resultado da quantidade de linhas e colunas para a lista "vetor"
	}

	// Método para criar uma matriz
	public int[][] criarMatriz(int[] vetor) {
		System.out.println("*- Criando a Matriz...");
		Scanner input = new Scanner(System.in);

		// instanciando a matriz
		int[][] matriz = new int[vetor[0]][vetor[1]];

		// percorrendo a matriz e populando
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d]: \n", i, j);
				matriz[i][j] = input.nextInt();
			}
		}
		return matriz;
	}

	public void imprimirMatriz(int[][] matriz) {
		System.out.println("*- Imprimindo a matriz...");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d] = %d \n", i, j, matriz[i][j]);
			}
		}
	}

	// ====================================================
	// TO DO 20/4/23

	public int somatorioMatriz(int[][] matriz) {
		System.out.println("*- Somatório dos elementos da matriz -*");
		int soma = 0;

		// percorrendo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma = soma + matriz[i][j]; // soma+= matriz[i][j];
			}
		}
		return soma;
	}

	public int obterNumero() {
		System.out.println("*- Obter um número -*");
		Scanner input = new Scanner(System.in);
		System.out.println("Número: ");
		int n = input.nextInt();
		return n;
	}

	// verificar ocorrências
	public int verificarOcorrencias(int n, int[][] matriz) {
		System.out.println("*- Verificar Ocorrências -*");
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (n == matriz[i][j]) {
					cont++; // cont = cont+1 ou cont+=1;
				}
			}
		}
		return cont;
	}

	// ====================================================

	// Programa principal
	public static void main(String[] args) {
		ExemploMatrizesMetodos emm = new ExemploMatrizesMetodos();
		int[] v = emm.tamanhoMatriz();
		int[][] m = emm.criarMatriz(v);
		emm.imprimirMatriz(m);
		int soma = emm.somatorioMatriz(m);
		System.out.println("Soma: " + soma);
		int n = emm.obterNumero();
		int cont = emm.verificarOcorrencias(n, m);
		System.out.println("Ocorrências: " + cont);
	}
}