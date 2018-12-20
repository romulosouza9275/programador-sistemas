package util;

public class Configurador {
	import java.io.FileInputStream;
	import java.util.Properties;
	public class Configurador {
	private String idioma;
	private String regiao;
	private String arquivoAjuda;
	public Configurador() throws Exception{
	//Abre o Arquivo de Propriedades
	FileInputStream arq = new FileInputStream("config.ini");
	//Cria um Objeto para armezenar as propriedades
	Properties prop = new Properties();
	//Carrega o conteúdo do arquivo de propriedades
	prop.load(arq);
	//Fecha o arquivo de propriedades
	arq.close();
	//Carrega as respectivas propriedades e cada atributo
	idioma = prop.getProperty("idioma");
	regiao = prop.getProperty("regiao");
	arquivoAjuda = prop.getProperty("ajuda");
	}
	public String getIdioma() {
	return idioma;
	
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
	
	public String getRegiao() {
	return regiao;
	}
	public String getArquivoAjuda() {
	return arquivoAjuda;
	}
	}
}
