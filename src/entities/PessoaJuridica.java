package entities;

public class PessoaJuridica extends Pessoa{
	
	private long cnpj;

	public PessoaJuridica(String nome, Double rendaPessoa, Integer sitPessoa, Endereco endereco, long cnpj) {
		super(nome, rendaPessoa, sitPessoa, endereco);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	
	
	
}	
