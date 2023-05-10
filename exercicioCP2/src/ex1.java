import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();

        //adicionando elementos no ArrayList (carros) - método add()
        carros.add("BMW");
        carros.add("Celta");
        carros.add("Audi");
        carros.add("Uno");
        carros.add("Kwid");

        //imprime todos os elementos do ArrayList (lista)
        System.out.println(carros);

        //acesso de UM elemento do ArrayList - método get()
        System.out.println(carros.get(4));

        //alterando um elemento do ArrayList
        carros.set(0,"Fusca");
        System.out.println(carros);
        carros.set(2,"Corsa");
        System.out.println(carros);

        //removendo um elemento do ArrayList - método remove()
        carros.remove(0);
        System.out.println(carros);

        //Apagando TODOS os elementos do ArrayList() - método clear()
        //carros.clear();
        //System.out.println(carros);

        //Obtendo o tamanho do ArrayList - método size()
        System.out.println("Tamanho: " + carros.size());

        //Percorrendo o ArrayList com For "tradicional"
        for(int i=0; i<carros.size(); i++){
            System.out.printf("%d - %s\n", i+1, carros.get(i));
        }
        //Percorrendo o ArrayList com foreach
        int i = 1;
        for (String carro : carros) {
            System.out.printf("%d - %s\n", i, carro);
            i++;
        }

        //obtendo o indice através do objeto da ArrayList
        System.out.println(carros.indexOf("Kwid"));

        //Descobrindo se existe algum elemento dentro da ArrayList
        System.out.println(carros.contains("Ferrari"));

        System.out.println("========================================");

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(-7);
        numeros.add(10);
        numeros.add(30);
        numeros.add(200);
        numeros.add(2000);

        System.out.println(numeros);

        for(Integer num : numeros){
            System.out.println("Número: " + num);
        }

        //Ordenando um ArrayList - método sort()
        Collections.sort(numeros);
        System.out.println(numeros);

        Collections.sort(carros);
        System.out.println(carros);


    }

}

