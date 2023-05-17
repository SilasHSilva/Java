package matriz;

public class ExemploMatrizesTeste {

	public static void main(String[] args) {
		
		ExemploMatrizes em = new ExemploMatrizes();
		int[] v = em.tamanhoMatriz();
		int[][] m = em.criarMatriz(v);
		em.imprimirMatriz(m);

	}

}
