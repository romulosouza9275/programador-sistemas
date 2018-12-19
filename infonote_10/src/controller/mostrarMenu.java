package controller;

public class mostrarMenu {
	public void mostrarMenu() {
		System.out.println("==================================================");
		System.out.println("InfoNote - Se não é Info não vendemos." +
		DateFormat.getDateInstance(DateFormat.SHORT).format(new Date())
		+ " " +
		DateFormat.getTimeInstance().format(new Date()));
		if (logado == true){
		System.out.println("Seja bem vindo, " + cliente.getNomeInvertido());
		}

}
