package contoller;

import model.ContatoDao;
import model.Teclado;

public class ControleDeContatos {

	private static final int CADASTRAR_MENSAGEM = 1;
	private static final int VISUALIZAR_MENSAGENS = 2;
	private static final int APAGAR_MENSAGEM = 4;
	private static final int SAIR = 5;

	public static void main(String[] args) {
		ControleDeContatos cdc = new ControleDeContatos();
		int opcao = SAIR;
		do {
			cdc.mostrarMenu();
			opcao = Teclado.lerINt("Digite sua opção: ");

			switch (opcao) {
			case CADASTRAR_MENSAGEM:
				cdc.cadastrarMensagem();
				break;
			default:
				System.out.println("opção inválida!");
			}
			Teclado.LerTexto("Pressione uma tecla para continuar...");
		} while (opcao != SAIR);
	}

public void mostrarMenu() {
	System.out.println("============================================");
	System.out.println("          Cadastro de Mensagens             ");
	System.out.println("============================================");
	System.out.println("1 - Cadastrar Mensagem");
	System.out.println("2 - Mostrar Mensagens");
	System.out.println("3 - Apagar Mensgem ");
	System.out.println("4 - Atualizar Mensagem");
	System.out.println("5 - Sair");
	
	public void cadastrarMensagem() {
	System.out.println("==============================================");
	System.out.println("           Cadastro de Mensagens              ");
	System.out.println("==============================================");
	String nome     = Teclado.LerTexto("Nome: ");
	String email    = Teclado.LerTexto("E-mail:");
	String mensagem = Teclado.LerTexto("Mensagem:");
	
	contato contato = ContatoDao.inserir(nome, email, mensagem);
	
	System.out.println(contato);
}


	}
}
