package Aula6;

import java.util.Scanner;

public class TesteConversor {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Conversor cv = new Conversor();
		double celsius, fahrenheit;
		
		System.out.println("*-* Conversor *-* ");
		System.out.println("1 -  Celsius para Fahrenheit");
		System.out.println("2 - Fahrenheit para Celsius");
		System.out.println("3 - ...");
		System.out.println("Digite a opção");
		int op = input.nextInt();
		
		if(op == 1 ) {
			System.out.println("Celsius: ");
			celsius = input.nextDouble();
			fahrenheit = cv.celsiusParaFahrenheit(celsius);
			System.out.println(celsius + " graus Celsius é equivalente á "
					+ fahrenheit + " fahrenheit");
		}
		
		else if(op == 2) {
			System.out.println("Fahrenheit: ");
			fahrenheit = input.nextDouble();
			celsius = cv.FahrenheitParaCelsius(fahrenheit);
			System.out.println(fahrenheit + " graus fahrenheit é equivalente á "
					+ celsius + " celsius");
			
			System.out.printf("%.2f graus fahrenheit "
					+ "é equivalente á %.2f \n", celsius, fahrenheit);
		}
		
		else {
			System.out.println("Opção invalida!");
		}
		
	}
}

// and - &&
// or - ||