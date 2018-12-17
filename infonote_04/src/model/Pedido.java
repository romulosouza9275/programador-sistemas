package model;

public class Pedido {
String situacao;
int numero;
 String dataEmissao;
 String formaDePagamento;
double valortotal;
 public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getDataEmissao() {
	return dataEmissao;
}
public void setDataEmissao(String dataEmissao) {
	this.dataEmissao = dataEmissao;
}
public String getFormaDePagamento() {
	return formaDePagamento;
}
public void setFormaDePagamento(String formaDePagamento) {
	this.formaDePagamento = formaDePagamento;
}
public double getValortotal() {
	return valortotal;
}
public void setValortotal(double valortotal) {
	this.valortotal = valortotal;
}
public String getSituacao() {
	return situacao;
}
public void setSituacao(String situacao) {
	this.situacao = situacao;
}
public Pedido() {
	super();
	this.situacao = situacao;
	this.numero = numero;
	this.dataEmissao = dataEmissao;
	this.formaDePagamento = formaDePagamento;
	this.valortotal = valortotal;
}
System.out.println(" situacao: " + this.situacao);
System.out.println("numero : " + this.numero);
System.out.println("dataEmissao : " + this.dataEmissao);
System.out.println("formaDePagamento : " + this.formaDePagamento);
System.out.println("valortotal : "+ this.valortotal);

}
