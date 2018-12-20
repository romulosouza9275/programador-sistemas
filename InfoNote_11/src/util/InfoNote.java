package util;

public class InfoNote {
	public class InfoNote {
		Cliente cliente; // não esquecer de dar o import neste objeto.
		Notebook notebooks[] = new Notebook[10];
		Pedido pedido;
		boolean logado = false; // indica se o usuário está logado.
		private static final int LOGIN = 1;
		private static final int CADASTRAR_USUARIO = 2;
		private static final int BUSCAR_NOTEBOOK = 3;
		private static final int INSERIR_NOTEBOOK = 4;
		private static final int REMOVER_NOTEBOOK = 5;
		private static final int VER_CARRINHO = 6;
		private static final int EFETUAR_COMPRA = 7;
		private static final int AJUDA = 8;
		private static final int SAIR = 9;

		public static void main(String[] args) {
			InfoNote info = new InfoNote();
			int opcao = SAIR;
			do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção: ");
			switch (opcao) {
			case LOGIN:
			info.efetuarLogin();
			break;
			case CADASTRAR_USUARIO:
			info.cadastrarUsuario();
			break;
			case BUSCAR_NOTEBOOK:
			info.buscarNotebook();
			break;
			case INSERIR_NOTEBOOK:
			info.manterCarrinho();
			break;
			case REMOVER_NOTEBOOK:
			info.manterCarrinho();
			break;
			case VER_CARRINHO:
			info.manterCarrinho();
			break;
			case EFETUAR_COMPRA:
			if (!info.logado) {
			System.out.println("Efetue login para efetuar compra.");
			break;
			} else {
			info.efetuarCompra();
			break;
			}
			case SAIR:
			System.out.println("Saída do Sistema");
			break;
			default:
			System.out.println("Opção inválida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
			} while (opcao != SAIR);
			
			public InfoNote() throws Exception {
				// Cria objeto de configurações
				config = new Configurador();
				Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));
				// Cria o objeto Ajuda
				ajuda = new Ajuda(config.getArquivoAjuda());
				
				public static void main(String[] args) throws Exception {
	
					public void ajuda(){
						System.out.println(ajuda.getTexto());
						
					case AJUDA:
						info.ajuda();
						break;

						System.out.println("1 - Login");
						System.out.println("2 - Cadastrar Cliente");
						System.out.println("3 - Buscar notebook");
						System.out.println("4 - Inserir Notebook no carrinho");
						System.out.println("5 - Remover Notebook no carrinho");
						System.out.println("6 - ver Carrinho");
						System.out.println("7 - Efetuar Compra");
						System.out.println("8 - Ajuda");
						System.out.println("9 - Sair");		
						
						}
				}
}
