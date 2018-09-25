package entities;

public class PessoaJuridica extends Pessoa{
	
	private long cnpj;

	public PessoaJuridica(long cnpj, String nome, Double rendaPessoa, Integer sitPessoa, Endereco endereco) {
		super();
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	
}	
