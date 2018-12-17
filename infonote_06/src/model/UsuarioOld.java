package model;

public class UsuarioOld {

	int matricula;
	private String login;
	private String senha;
	private String nome;
	private String email;
	private String telefone;
	private Endereco Enderecos [] = new Endereco [10];
	private Pedido pedidos[] = new Pedido[10];

	public Endereco[] getEnderecos() {
		return Enderecos;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}

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

public UsuarioOld() {
	
}

public UsuarioOld(int matricula, String login, String senha, String nome, String email, String telefone) {
	super();
	this.matricula = matricula;
	this.login = login;
	this.senha = senha;
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	

public void mostar() {

System.out.println("\n\nUsuário\n");
System.out.println("matricula : " + this. matricula);
System.out.println("login : " + this.login);
System.out.println("senha : " + this.senha);
System.out.println("email : " + this.email);
System.out.println("telefone : "+ this.telefone);

//inserir o pedidio do vetor
public bollean inserirPedido(Pedido pedido) {
for (int i = 0; i < pedido.lenght; i++) { 
if (Enderecos[i] == null) {
Enderecos[i] = end; 
return true;
   }
    return false;
    }
}
//inserir o endereco no vetor
public Boolean inserirEndereco (boolean end) {
boolean[] enderecos;
for(int i= 0; i < enderecos.length; i++) {
if (enderecos[i == null) {
enderecos[i] =end;
return true;
}
return false;

System.out.println(cliente);)
@override
public String toString() {
final String ENTER = "\n";
String retValue ="";

retValue ="Informações sobre o usuario:"+ ENTER + super.toString()+
super.toString()+
"Código do usuario:"+ ENTER +
"Nome: "+ nome + ENTER +
"E-mail: "+ email+ ENTER +
"Telefone:"+ telefone + ENTER + 
"Endereco: "+ enderecos[0];

return retValue;



}
}
}






