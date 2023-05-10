package Aula4;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.setN1(10);
		calc.setN2(20);
		double res = calc.add(calc.getN1(), calc.getN2());
		System.out.println("Resultado: " + res);
	}

}
