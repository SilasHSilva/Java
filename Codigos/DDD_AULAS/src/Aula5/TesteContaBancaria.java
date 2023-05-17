package Aula5;

public class TesteContaBancaria {
	public static void main(String[] args) {
		
		//cria o objeto da classe conta
		ContaBancaria c1 = new ContaBancaria();
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Conta: " + c1.getnConta());
		c1.verificarSaldo();
		
		System.out.println("");
		
		//configurando os atributos
		c1.setTitular("Gabriel");
		c1.setAgencia("123-4");
		c1.setnConta("321-0");
		c1.depositar(1000);
		
		System.out.println("Objeto: " + c1);
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Conta: " + c1.getnConta());
		c1.verificarSaldo();
		
		System.out.println("");
		
		c1.depositar(500);
		c1.verificarSaldo();
		
		System.out.println("");
		c1.sacar(300);
		c1.verificarSaldo();
		
		
	}
	

}
