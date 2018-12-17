package model;

public class ItemDepedido {
	int qtde;
double subtotal;

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
	
		public ItemDepedido() {
		System.out.println("qtde : " + this.qtde);
		System.out.println("subtotal : " + this.subtotal);
		
		
	}

}
