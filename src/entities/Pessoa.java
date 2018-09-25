package entities;

public class Pessoa {
	
	private String nome;
	private Double rendaPessoa;
	private Integer sitPessoa;
	private Endereco endereco;
	
	public Pessoa() {
	}


	public Pessoa(String nome, Double rendaPessoa, Integer sitPessoa, Endereco endereco) {
		this.nome = nome;
		this.rendaPessoa = rendaPessoa;
		this.sitPessoa = sitPessoa;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaPessoa() {
		return rendaPessoa;
	}


	public void setRendaPessoa(Double rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}


	public Integer getSitPessoa() {
		return sitPessoa;
	}


	public void setSitPessoa(Integer sitPessoa) {
		this.sitPessoa = sitPessoa;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	

}
