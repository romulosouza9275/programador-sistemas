package controller;

public class Notebook {
	@Override
	public String toString(){
	final String ENTER = "\n";
	String retValue = "";
	Locale local = new Locale("pt", "BR");
	retValue = "Informa��es sobre Notebook:" + ENTER +
	"N�mero de S�rie do Notebook: " + serialNote + ENTER +
	"Modelo: " + modelo + ENTER +
	"Descricao: " + descricao + ENTER +
	"Estoque: " + estoque + ENTER +
	"Pre�o Unitario: " +
	NumberFormat.getCurrencyInstance(local).format(this.precoUnitario) +
	ENTER +
	"Figura: " + figura + ENTER +
	"Data de cadastro: " + dataCadastro;
	return retValue;
	}

}
