package controller;

import model.Pessoa;

public class Cadastro  {
	public static void main(String [] args) {
	Pessoa pessoa = new Pessoa ();
	
	pessoa .setnome("leandro Ferra");
	pessoa.setIdade(28);
	pessoa.setSexo("Masculino");
	
	System.out.println("Nome: "+pessoa.getNome());
	System.out.println("Idade: "+pessoa.getIdade());
	System.out.println("Sexo: " +pessoa.getsexo());
	}	
}
	

