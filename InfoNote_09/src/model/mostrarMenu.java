package model;

public class mostrarMenu {
	private boolean logado;
	private Object cliente;

	public void mostrarMenu() {
		System.out.println("==================================================");
		System.out.println(" InfoNote - Se n�o � Info n�o vendemos. ");
		if (logado == true){
		System.out.println("Seja bem vindo, " + cliente.getNomeInvertido());
		}
		System.out.println("==================================================");

}
