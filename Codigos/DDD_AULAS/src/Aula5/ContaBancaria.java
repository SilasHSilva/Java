package Aula5;

public class ContaBancaria{
	
	//atributos
	private String titular;
	private String nConta;
	private String agencia;
	private double saldo;
	
	//=============================================================================
	//métodos acessores e modificadores
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	/**
	 * @return the conta
	 */
	public String getnConta() {
		return nConta;
	}
	/**
	 * @param conta the conta to set
	 */
	public void setnConta(String conta) {
		nConta = conta;
	}
	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//==========================================================
	// métodos operacionais
	public void depositar (double valor) {
		saldo = saldo + valor; //ou (saldo += valor);
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor; //ou (saldo -= valor);
	}
	
	public void verificarSaldo() {
		//System.out.println("Saldo: " + saldo);
		System.out.println("Saldo: " + getSaldo());
	}
	
	
}