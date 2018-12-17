package model;

public class Notebook {
	private int numeronote;

	public int getNumeronote() {
		return numeronote;
	}

	public void setNumeronote(int numeronote) {
		this.numeronote = numeronote;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;
	public Object getPrecoUnitario;

	public void mostar() {

		
		System.out.println(" modelo : " + this.modelo);
		System.out.println("descricao : " + this.descricao);
		System.out.println("estoque : " + this.estoque );
		System.out.println("precoUnitario : " + this.precoUnitario);
		System.out.println("figura : "+ this.figura);
		System.out.println("dataCadastro : "+ this.dataCadastro);

}
