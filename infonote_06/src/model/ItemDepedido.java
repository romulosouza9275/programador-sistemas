package model;

public class ItemDepedido {
	int qtde;
double subtotal;
private Notebook notebook;
public Notebook getNotebook1() {
	return notebook;
}
public Notebook getNotebook() {
	return notebook;
}
public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public ItemDepedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	
		public ItemDepedido(int i, Notebook aux, double d) {
		System.out.println("qtde : " + this.qtde);
		System.out.println("subtotal : " + this.subtotal);


		
	}

}
