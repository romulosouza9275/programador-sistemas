package controller;

public class mostrarMenu {
	public void mostrarMenu() {
		System.out.println("==================================================");
		System.out.println("InfoNote - Se n�o � Info n�o vendemos." +
		DateFormat.getDateInstance(DateFormat.SHORT).format(new Date())
		+ " " +
		DateFormat.getTimeInstance().format(new Date()));
		if (logado == true){
		System.out.println("Seja bem vindo, " + cliente.getNomeInvertido());
		}

}
