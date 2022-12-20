import java.time.LocalDateTime;

public class Vaga {
	
	private String cpf;
	private String nome;
	private String posicao;	
	private String modelo;
	private String placa;
	private String cor;
	private double valor;
	
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;	

	public Vaga() {
		
	}
	
	public Vaga (String posicao) {
		this.posicao = posicao;		
	}	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valorFinal) {
		this.valor = valorFinal;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public LocalDateTime setHoraEntrada() {
		return this.horaEntrada = horaEntrada.now();
	}

	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida() {
		this.horaSaida = horaSaida.now();
	}
	
	@Override
	public String toString() {
		return " Nome: " + nome + ", CPF: " + cpf + ", Modelo " + modelo + ", e placa: "
				+ placa + ", cor: " + cor + ".";
	}


	


}
