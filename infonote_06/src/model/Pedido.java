package model;

public class Pedido<item, ItemDePedido> {
String situacao;
String numero;
String dataEmissao;
String formaDePagamento;
private Endereco enderecoEntrega;
private ItemDePedido itens [] = new ItemDePedido[10];
}
public void setEnderecoEntrega(Endereco enderecoEntrega) {
	this.enderecoEntrega = enderecoEntrega;
}
public void setEnderecoEntrega1(Endereco enderecoEntrega) {
	this.enderecoEntrega = enderecoEntrega;
}
public Endereco getEnderecoEntrega1() {
	return enderecoEntrega;
}
public ItemDePedido[] getItens() {
	return itens;
}
public Endereco getEnderecoEntrega() {
	return enderecoEntrega;
}
public ItemDePedido[] getItens1() {
	return itens;
}
double valortotal;

}
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
public Pedido(String numeroPedido, String dataEmissão, String formaDePagamento,double valorTotal, String situacao, Endereco enderecoEntrega) {
	super();
	this.numero = numeroPedido;
	this.dataEmissao = dataEmissao;
	this.formaDePagamento = formaDePagamento;
	this.valortotal = valortotal;;
	this.situacao = situacao;
	this.enderecoEntrega = enderecoEntrega;
}
System.out.println(" situacao: " + this.situacao);
System.out.println("numero : " + this.numero);
System.out.println("dataEmissao : " + this.dataEmissao);
System.out.println("formaDePagamento : " + this.formaDePagamento);
System.out.println("valortotal : "+ this.valortotal);

public boolean inserir
public int lenght; void item(item de pedido item) {
for(int i = 0;i < itens.legnth; i++) {
if(itens[i] ==item; 
return true;

          }
     }
}
return to false;


}

@Override
public String toString() {
final String ENTER ="\n";
String retValue = "";

String numeroPedido;
String ;
retValue = "informações sobre Pedido:"+ ENTER +
"Número do Pedido:" + numeroPedido + ENTER +
"Data de Emissão:"  +   + ENTER +
"Forma de pagamento:" + ENTER +
"Valor Total:" + valortotal + ENTER +
"Situação:" + situacao + ENTER + 
"Endereço de Entrega:"+ENTER+
"Itens:";
for(int i = 0; i< itens.length; i++) {
retValue += itens[i] + ENTER;
}
return retValue;
}
}