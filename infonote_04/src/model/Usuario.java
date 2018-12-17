package model;

public class Usuario {

	int matricula;
	private String login;
	private String senha;
	private String nome;
	private String email;
	private String telefone;


	private int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

public Usuario() {
	
}

public Usuario(int matricula, String login, String senha, String nome, String email, String telefone) {
	super();
	this.matricula = matricula;
	this.login = login;
	this.senha = senha;
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	
}
public void mostar() {

System.out.println("\n\nUsuário\n");
System.out.println("matricula : " + this. matricula);
System.out.println("login : " + this.login);
System.out.println("senha : " + this.senha);
System.out.println("email : " + this.email);
System.out.println("telefone : "+ this.telefone);
}
}
