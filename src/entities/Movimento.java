package entities;

public class Movimento {
	
	private Integer tipo;
	private String dataMovimentacao;
	private String horaMovementacao;
	private Double valMovementacao;
	
	public Movimento(Integer tipo, String dataMovimentacao, String horaMovementacao, Double valMovementacao) {
		this.tipo = tipo;
		this.dataMovimentacao = dataMovimentacao;
		this.horaMovementacao = horaMovementacao;
		this.valMovementacao = valMovementacao;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(String dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public String getHoraMovementacao() {
		return horaMovementacao;
	}

	public void setHoraMovementacao(String horaMovementacao) {
		this.horaMovementacao = horaMovementacao;
	}

	public Double getValMovementacao() {
		return valMovementacao;
	}

	public void setValMovementacao(Double valMovementacao) {
		this.valMovementacao = valMovementacao;
	}

	@Override
	public String toString() {
		return "Movimento [tipo=" + tipo + ", dataMovimentacao=" + dataMovimentacao + ", horaMovementacao="
				+ horaMovementacao + ", valMovementacao=" + valMovementacao + "]";
	}
	
	
	
}
