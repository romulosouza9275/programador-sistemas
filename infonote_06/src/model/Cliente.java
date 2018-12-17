package model;

public class Cliente extends Usuario {
	private String codigoCliente;
	private String nome;
	private String email;
	private String telefone;
	private Endereco[] enderecos = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10];

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
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

	public Endereco[] getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}

public void setPedidos(Pedido[] pedidos) {
	this.pedidos = pedidos;

public Cliente(String login, String senha,int tipo, String codigoCliente,String nome, String email, String telefone, Endereco endereco) {
Super(login, senha, tipo);
this.codigoCliente = codigoCliente;
this.nome = nome;
this.email = email;
this.telefone = telefone;
//insere na posi��o zero do vetor o endere�o residencial
inserirEndereco(endereco);

	private void inserirEndereco(Endereco endereco) {
// TODO Auto-generated method stub

	}

private void Super(String login, String senha, int tipo) 
	
// TODO Auto-generated method stub

	public boolean inserirpedido(Pedido pedido) {
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = pedido;
				return true;
			}
		}
		return false;
	}
System.out.println(cliente);)
@override
public String toString() {
final String ENTER = "\n";
String retValue ="";

retValue ="Informa��es sobre o cliente:"+ ENTER + super.toString()+
super.toString()+
"C�digo do cliente:"+ ENTER +
"Nome: "+ nome + ENTER +
"E-mail: "+ email+ ENTER +
"Telefone:"+ telefone + ENTER + 
"Endereco: "+ enderecos[0];

return retValue;


}

}

}
