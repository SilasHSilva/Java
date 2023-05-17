package aula7_construtores;

import java.util.Scanner;

public class TesteAluno {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		Aluno a1 = new Aluno();
		System.out.println("Matrícula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Curso: " + a1.getCurso());
		System.out.println("Status " + a1.isStatus());
		System.out.println("Média " + a1.getMediaGeral());
		
		System.out.println("");
		
		Aluno a2 = new Aluno(123, "Java");
		System.out.println("Matrícula: " + a2.getMatricula());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Curso: " + a2.getCurso());
		System.out.println("Status " + a2.isStatus());
		System.out.println("Média " + a2.getMediaGeral());
		
		System.out.println("");
		
		Aluno a3 = new Aluno(321,"João","ADS",true);
		System.out.println("Matrícula: " + a3.getMatricula());
		System.out.println("Nome: " + a3.getNome());
		System.out.println("Curso: " + a3.getCurso());
		System.out.println("Status " + a3.isStatus());
		System.out.println("Média " + a3.getMediaGeral());
		System.out.println("Média alterada: ");
		
		System.out.println("N1: ");
		float n1 = input.nextFloat();
		System.out.println("N2: ");
		float n2 = input.nextFloat();
		System.out.println("N3: ");
		float n3 = input.nextFloat();
		
		float calcMedia = a3.calcularMedia(n1, n2, n3);
		a3.setMediaGeral(calcMedia);
		System.out.println("Média: " + a3.getMediaGeral());
		System.out.println("Média: %.2f " + a3.getMediaGeral());
		
		/*
		 * printf()
		 * - float ou double - %.(numero de casas decimais)f
		 * - String - %s
		 * - char - %c
		 * - int - %d (decimal
		 */
	}

}
