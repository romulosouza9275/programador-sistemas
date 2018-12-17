package model;

class Endereco {
	private String estado;
	private String cep;
	private String logradouro;
	private String numero;
	private String comprimento;
	private String bairro;
	private String cidade;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Endereco(String estado, String cep, String logradouro, String numero, String comprimento, String bairro,
			String cidade) {
		super();
		this.estado = estado;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.comprimento = comprimento;
		this.bairro = bairro;
		this.cidade = cidade;
	}


}
