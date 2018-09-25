package entities;

public class Endereco {
	
	private String rua;
	private long cep;
	private String bairro;
	private Integer numero;
	private String cidade;
	
	public Endereco() {
	}

	public Endereco(String rua, long cep, String bairro, Integer numero, String cidade) {
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
