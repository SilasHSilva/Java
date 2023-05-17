package arrayObjetos;

import java.util.Scanner;

public class GerenciadorContatos {
	
	private Contato[] agenda; //declarando o array
	private Scanner input;
	
	//construtor
	public GerenciadorContatos(int tamanho) {
		System.out.println("Lista Criada: " + tamanho + " elementos");
		System.out.println("=======================================");
		agenda = new Contato[tamanho]; // instanciando a lista de contatos
	}
	
	public Contato criarContato() {
		System.out.println("*-* Criando um contato *-*");
		System.out.println("=======================================");
		input = new Scanner(System.in);
		
		// entrada usuario
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Telefone: ");
		String telefone = input.next();
		
		Contato c = new Contato(nome, telefone); // cria um objeto para criar contato com as variaveis de nome e telefone
		return c;
	}
	
	public void adicionarContatos() {
		System.out.println("*-* Adicionando contatos na lista *-*");
		System.out.println("=======================================");
		
		for(int i=0; i<agenda.length; i++) {
			//adicionando o Contato no vetor agenda
			agenda[i] = criarContato();
		}

	}
	
	public void mostrarContatos() {
		System.out.println("*-* Mostrar os contatos da lista *-*");
		System.out.println("=======================================");
		
		for(int i=0; i<agenda.length; i++) {
			
			System.out.println(agenda[i].toString());
			
			//System.out.println("Nome: " + agenda[i].getNome());
			//System.out.println("Telefone: " + agenda[i].getTelefone());
			//System.out.println("-----------------------------------");
		}
	}
	
	//TO DO
	// Criar um metodo para buscar um contato
	// Criar um metodo para apagar um contato
}
