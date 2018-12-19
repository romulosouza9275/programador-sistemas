package controller;

public class Notebook {
	@Override
	public String toString(){
	final String ENTER = "\n";
	String retValue = "";
	Locale local = new Locale("pt", "BR");
	retValue = "Informações sobre Notebook:" + ENTER +
	"Número de Série do Notebook: " + serialNote + ENTER +
	"Modelo: " + modelo + ENTER +
	"Descricao: " + descricao + ENTER +
	"Estoque: " + estoque + ENTER +
	"Preço Unitario: " +
	NumberFormat.getCurrencyInstance(local).format(this.precoUnitario) +
	ENTER +
	"Figura: " + figura + ENTER +
	"Data de cadastro: " + dataCadastro;
	return retValue;
	}

}
