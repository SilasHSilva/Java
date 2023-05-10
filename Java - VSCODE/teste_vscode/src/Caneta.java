import java.util.Scanner;

public class Caneta {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int valores[] = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o elemento [%d] da lista: ", i);
            valores[i] = input.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("No indice [%d] o elemento é:  " + valores[i] + "\n", i);

        }
    }
}
