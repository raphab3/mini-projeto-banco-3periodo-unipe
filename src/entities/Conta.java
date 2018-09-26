package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
	
	private long numeroConta;
	private String dataAbertura;
	private String dataEncerramento;
	private Integer situacao;
	
	private String senha;
	private Double saldo;
	
	private List<Movimento> movimentos = new ArrayList<>();
	
	private Pessoa p = new Pessoa();

	public Conta(long numeroConta, String dataAbertura, String dataEncerramento, Integer situacao, String senha,
			Double saldo, Pessoa p) {
		this.numeroConta = numeroConta;
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
		this.situacao = situacao;
		this.senha = senha;
		this.saldo = saldo;
		this.p = p;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(String dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
	
	
//	Metodos
	
	public void movimentar(int tipo, String dataMovimentacao, String horaMovimentacao,  double valor) {
		Movimento mov = new Movimento(tipo, "10/09/2018", "13:20", valor);
		movimentos.add(mov);
	}
	
	public void sacar(double valor) {
		int tipo = 1;
		if(valor <= saldo) {
			this.saldo -= valor;
			movimentar(tipo, new Date().toString(), "10:00h", valor);
		}
		else {
			System.out.println("O valor desejado eh superior ao seu saldo");
		}
		
		
	}
	
	public void depositar(double valor) {
		int tipo = 2;
		this.saldo += valor;
		movimentar(tipo, new Date().toString(), "12:00h", valor);
	}
	
	public void transferir(double valor, Conta conta1, Conta conta2) {
		int tipo = 3;
				
		if(valor <= this.saldo) {
			conta1.setSaldo(saldo - valor); ;
			conta1.movimentar(tipo, new Date().toString(), "7:00h", valor);
			conta2.setSaldo(saldo +  valor);
			conta2.movimentar(tipo, new Date().toString(), "22:00h", valor);
			
		}
		else {
			System.out.println("O valor desejado eh superior ao seu saldo");
		}
	}
	

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", dataAbertura=" + dataAbertura + ", dataEncerramento="
				+ dataEncerramento + ", situacao=" + situacao + ", senha=" + senha + ", saldo=" + String.format("%.2f", saldo)
				+ ", movimentos=" + movimentos + "]";
	}
	
	
	
	
}
