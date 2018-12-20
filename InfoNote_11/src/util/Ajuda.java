package util;

public class Ajuda {
	import java.io.BufferedReader;
	import java.io.FileReader;
	public class Ajuda {
	private String texto;
	public Ajuda(String nomeArquivo) throws Exception {
	// Abre o arquivo
	BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));
	// Variável para armazenar as linhas de texto do arquivo
	String linha = "";
	do {
	// Faz a leitura da linha do arquivo
	linha = in.readLine();
	// Caso não tenha terminado as linhas vai armazenando
	if (linha != null) {
	texto += linha + "\n";
	}
	} while (linha != null);
	}
	public String getTexto() {
	return texto;
	
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
		}
	}
	}

