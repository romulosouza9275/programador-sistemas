package model;

public class Contato {

private int id;
private String nome;
private String email;
private String mensagem;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getMensagem() {
	return mensagem;
}
public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}



public Contato(int id, String nome,String email,String mensagem) {
super();
this.id = id;
this.nome = nome;
this.email = email;
this.mensagem = mensagem;

}


@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

public Contato(String nome, String email, String mensagem) {
super();
this.nome = nome;
this.email = email;
this.mensagem = mensagem;

}

public String toString1() {
final String ENTER = "\n";
String retValue = "";

retValue ="Mensagem Enviada Com Sucesso:"+ ENTER +
"Nome: " + nome + ENTER +
"E-mail: "+ email +ENTER +
"Mensagem: "+ mensagem ;

return retValue;

}
}
