package model;

public class Usuario  {
	
	int tipo;
	private String login;
	private String senha;
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	
	
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int tipo, String login, String senha) {
		super();
		this.tipo = tipo;
		this.login = login;
		this.senha = senha;
	}
}

