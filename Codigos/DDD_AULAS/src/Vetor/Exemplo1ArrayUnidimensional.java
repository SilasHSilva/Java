package Vetor;

import java.util.Scanner;

public class Exemplo1ArrayUnidimensional {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[5];
		
		
		
		/* vetor[0] = 1;
		vetor[1] = 10;
		vetor[2] = 3;
		vetor[3] = 8;
		vetor[4] = 42;*/
		
		
		for(int i=0; i<5;i++) {
		System.out.printf("vetor[%d]: \n", i);
		vetor[i] = input.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.println(vetor[i]);
		}
	}

}
