package model;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	
	public void setnome(String nome) {
		this.nome= nome;
	}
	public String getNome() {
		return nome;
	}
	
	public String getsexo() {
		return sexo;
	}
	public void setsexo() {
	
    }
	public void setSexo(String sexo ) {
	this.sexo = sexo;
}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
