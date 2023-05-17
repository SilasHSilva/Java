package Vetor;

import java.util.Scanner;

public class Exemplo2Array {
	
	//1 - tamanho vetor
	public int tamanhoVetor() {
		Scanner input = new Scanner(System.in);
		System.out.println("*-* TAMANHO DO VETOR *-*");
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	}
	// 2 - Criar vetor
	public int[] criaVetor(int t) {
		System.out.println("*-* CRIA VETOR *-*");
		int[] vetor = new int[t];
		return vetor;
	}
	
	// 3 - Popular vetor
	public int[] popularVetor(int[] v) {
		System.out.println("*-* POPULA VETOR *-*");
		Scanner input= new Scanner(System.in);
		for(int i=0; i < v.length; i++) {
			System.out.printf("Vetor[%d]: \n", i);
			v[i] = input.nextInt();
		}
		return v;
	}
	// 4 - imprimir vetor
	
	public void imprimir(int[] v) {
		System.out.println("*-* IMPRIME VETOR *-*");
		for(int i=0; i < v.length; i++) {
			System.out.printf("vetor[%d]: %d \n", i, v[i]);
		}
	}
	public static void main(String[] args) {
		Exemplo2Array ea = new Exemplo2Array();
		int t = ea.tamanhoVetor();
		int [] v = ea.criaVetor(t);
		v = ea.popularVetor(v);
		ea.imprimir(v);
	}

}
