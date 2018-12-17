package model;

public class Pedido {
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
String situacao;
}
