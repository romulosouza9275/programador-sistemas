package contoller;

import util.Teclado;

public class ExemploEntrada {

	public static void main(String[] args) {
	// leitura de texto
	String nome;
	nome = Teclado.LerTexto("Digite seu nome: ");
	
	//Leitura de inteiro
	int idade;
	idade = Teclado.lerINt("digite sua idade: ");
	
	//Leitura de Ponto Flutuante
	double salario;
	salario = Teclado.lerDouble("Digite sua iadde: ");
	
	System.out.println("Nome informado : " + nome);
	System.out.println("Idade informada:" + idade);
	System.out.println("Salário informado : " + salario);
	
	}

}
