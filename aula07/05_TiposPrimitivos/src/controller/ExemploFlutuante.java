package controller;

public class ExemploFlutuante {
	public static void main (String[] args) {
		double salario, aumento, novoSalario;
		salario = 2000.00 ;
		aumento= 0.15;
		novoSalario = salario + (aumento* salario);
		System.out.println("novo Sal�rio R$" +
				novoSalario);


	}
	
}

