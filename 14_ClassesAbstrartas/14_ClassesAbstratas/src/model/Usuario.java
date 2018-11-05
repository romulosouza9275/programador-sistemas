package model;

public abstract class Usuario {
	private String login;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String senha;
	private String tipo;
	public abstract void mostrar ();
}
/**
 * @param tipo the tipo to set
 */
  public void setTipo (int tipo) {
    this.tipo = tipo;
}
public Usuario() {
// TODO Auto-generated constructor stub
super();

}
public Usuario (String login, )