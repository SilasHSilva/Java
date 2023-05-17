package Aula3;

public class Conta {
	
	//definindo os atributos
	String titular;
	String numConta;
	String agencia;
	double saldo;
	
	//métodos acessores e modificadores (getters and setters)
	
	//Atributo (Titular)
	public void setTitular(String titular) {
		this.titular = titular; // o "This" é pra deixar claro que está utilizando o atributo e não o método
	}
	public String getTitular() {
		return titular;
	}
	
	
	
	//Atributo (numConta)
	public void setNumConta(String nc) {
		numConta = nc;
	}
	public String getNumConta() {
		return numConta;
	}
	
	
	
	//Atributo (Agencia)
	public void setAgencia(String a) {
		agencia = a;	
	}
		public String getAgencia() {
			return agencia;
		}
	
		
	
	//Atributo (Saldo)
	public void setSaldo(double S) {
		saldo = S;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	//Vamos testar o nosso código - método main() 
	public static void main(String[] args) {
		Conta c1 = new Conta(); //criando um objeto da classe Conta
		c1.setTitular("Victor");
		c1.setNumConta("123-4");
		c1.setAgencia("00-x");
		c1.setSaldo(1500.00);
		
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Conta: " + c1.getNumConta());
		System.out.println("Agencia: " + c1.getAgencia());
		System.out.println("Saldo: " + c1.getSaldo());
		
		System.out.println("");
		
		//Não é adequado acessar um atributo diretamente
		Conta c2 = new Conta();
		c2.titular = "Caique";
		c2.numConta = "155423-4";
		c2.agencia = "550-x";
		c2.saldo = 2500.00;
		System.out.println("Titular: " + c2.titular);
		System.out.println("Conta: " + c2.numConta);
		System.out.println("Agencia: " + c2.agencia);
		System.out.println("Saldo: " + c2.saldo);
		
	}
}