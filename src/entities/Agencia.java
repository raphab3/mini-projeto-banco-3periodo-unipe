package entities;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private long numAgencia;
	private List<Conta> contas = new ArrayList<Conta>();

	public Agencia(long numAgencia) {
		this.numAgencia = numAgencia;
	}
	
	
	public void cadastrarConta(Conta c) {
		contas.add(c);
	}


	public long getNumAgencia() {
		return numAgencia;
	}


	public void setNumAgencia(long numAgencia) {
		this.numAgencia = numAgencia;
	}


	public List<Conta> getContas() {
		return contas;
	}


	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	

	
	
	
}
