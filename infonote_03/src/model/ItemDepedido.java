package model;

public class ItemDepedido {
private	int qtde;
private	double subtotal;
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
	}
	public ItemDepedido() {
		// TODO Auto-generated constructor stub
	}

}
