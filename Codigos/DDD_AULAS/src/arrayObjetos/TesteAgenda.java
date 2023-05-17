package arrayObjetos;

public class TesteAgenda {
	
	public static void main(String[] args) {

		GerenciadorContatos gc = new GerenciadorContatos(5);
		gc.adicionarContatos();
		gc.mostrarContatos();
	}

}