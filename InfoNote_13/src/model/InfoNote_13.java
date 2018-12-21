package model;

public class InfoNote_13 {
	private String url;
	private String driver;
	private String login;
	private String senha;
	
	
		
			try{

				arquivoAjuda = prop.getProperty("ajuda");
			} catch (IOException ioe) {
			System.out.println("Arquivo Config.ini não encontrado.");
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
				
				url = prop.getProperty("url");
				driver = prop.getProperty("driver");
				login = prop.getProperty("login");
				senha = prop.getProperty("senha");
				
				
			}
				public String getIdioma() {
					return idioma;
				}
				public String getRegiao() {
					return regiao;
				}
				public String getArquivoAjuda() {
					return arquivoAjuda;
					


						private String url;// Local do Banco de Dados.
						private String driver;// Classe Java do Framework que foi baixado na web.
						private String login;// Login do usuário no SGBD.
						private String senha;// Senha do usuário no SGBD.
						private Object This;


					public conexao(String url, String driver, String login,String senha) {
						try {

							This.url = url;
							This.driver = driver;
							this.login = login;
							this.senha = senha;
							class.forName(driver);
							//registro da Classe de driver na conexão através de JDBC.

						} catch (ClassNotException e ) {
							System.out.println(e.getMessage());

					}
					return con;

					}
					public String getDriver() {
						return driver;
					}
					public String getSenha() {
						return senha;
						
						public metodo inserir() {}
						public static Usuario inserir(String login, String senha, int tipo) {
							Usuario usuario = null;
							UsuarioDAO userDAO = new UsuarioDAO();
							try {
							// Criação do insert
							String sql = "insert into usuario (login, senha, tipo) values (?,?,?)";
							// Obter a conexão com o banco de dados
							Conexao conex = new Conexao(userDAO.url, userDAO.driver,
							userDAO.login, userDAO.senha);
							// Abrir a conexão
							Connection con = conex.obterConexao();
							// Preparar o comando para ser executado
							PreparedStatement comando = con.prepareStatement(sql);
							comando.setString(1, login);
							comando.setString(2, senha);
							comando.setInt(3, tipo);
							// Comando executado
							comando.executeUpdate();
							} catch (Exception e) {
							System.out.println(e.getMessage());
							}
							return usuario;
							
							}

						
					}
					


					
				
			
			
	}


