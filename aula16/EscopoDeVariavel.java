package controller;

public class EscopoDeVariavel {
	static int x = 1; // vari�vel global

	public static void main(String[] args) {
		int x = 5;
		System.out.println("x no inicio de main() �" + x);
		metodoA();
		metodoB();
	}

	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA � " + x);
		x = x + 1;
		System.out.println("Variavel local x antes de sair metodoA � " + x);
	}

	public static void metodoB() {
		System.out.println("Vari�vel x ao entrar no metodoB �" + x + "global");
		x = x * 10;
		System.out.println("variavel x antes de sair do metodoB � " + x);

	}
}