package model;

public class conexao {
	private String url;// Local do Banco de Dados.
	private String driver;// Classe Java do Framework que foi baixado na web.
	private String login;// Login do usuário no SGBD.
	private String senha;// Senha do usuário no SGBD.
	private Object This;


public  conexao(String url, String driver, String login,String senha) {
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
}
}

