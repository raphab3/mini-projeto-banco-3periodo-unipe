package entities;

public class PessoaFisica extends Pessoa{
	
	private long cpf;
	private long rg;
	
	public PessoaFisica(long cpf, long rg, String nome, Double rendaPessoa, Integer sitPessoa, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	
	
	
	
}
