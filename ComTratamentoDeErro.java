package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		try {
			double a = Teclado.lerDouble("Digite o Numerador: ");
			double b = Teclado.lerDouble("Digite o Denominador");
			double c = a / b;
			System.out.println("resultado da divis�o de a por b: " + c);
		} catch (NumberFormatException nfe) {
			System.out.println("Caracter inv�lido! ");

//Este tratamento abaixo s� funciona pra vers�es anteriores ao Java 6
		} catch (ArithmeticException nfe) {
			System.out.println("Caracter Invalido");
		}

	}

}
