import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Estacionamento {

	Vaga[] vaga = new Vaga[4];

	ArrayList<Vaga> historico = new ArrayList<Vaga>();

	public void addCarro(int posicao, Vaga carro) {
		if (vaga[posicao] == null) {
			vaga[posicao] = carro;
		} else {
			System.out.println("vaga ocupada");
		}
	}

	/** Listar Vagas do estacionamento **/
	public void listarVagas() {
		System.out.println("___________________________");
		System.out.println(" --------Vagas-------------");
		for (int i = 0; i < vaga.length; i++) {
			if (vaga[i] == null) {
				System.out.println("vaga Livre - " + i + " ");
			} else {
				System.out.println("vaga Ocupada, Condutor: " + vaga[i].getNome() + ", Modelo: " + vaga[i].getModelo()
						+ ", Placa: " + vaga[i].getPlaca() + " .");
				continue;
			}

		}

	}

	/** Remover Carro do estacionamento **/
	public void removeCarro(String placa) {
		for (int i = 0; i < vaga.length; i++) {
			if (!(vaga[i] == null)) {
				if (vaga[i].getPlaca().equals(placa)) {
					vaga[i].setHoraSaida();
					historico.add(vaga[i]);
					System.out.println("Carro de Placa: " + vaga[i].getPlaca());
					vaga[i] = null;
					System.out.println("Carro Retirado do Estacionamento.\n\n");
				}
			}
		}

	}

	/**/
	public void exibirHistorico() {
		System.out.println("Carros que Ja estiveram no estacionamento\n");
		for (Vaga temp : historico) {
			if (temp == null) {
				System.out.println("Nehum Carro foi retirado do " + "estacionento ou Estacioanemnto Vazio");
			}
			System.out.println(temp);
		}
	}

	/** Buscas de vaga **/
	public void buscarCarro(String placa) {
		String retornoCarro = "";
		for (int i = 0; i < vaga.length; i++) {
			if (vaga[i] != null) {
				if (vaga[i].getPlaca().equals(placa)) {
					retornoCarro = ("Seu carro está na posição: " + i + ", Nome: " + vaga[i].getNome() + ", Placa: " + vaga[i].getPlaca());
					break;
				}
			} else {
				retornoCarro = ("Placa não existe, favor verificar.");
				continue;
			}
		}
		System.out.println(retornoCarro);
	}

	public void vagasOcupadas() {
		System.out.println("vagas Ocupadas\n");
		for (int i = 0; i < vaga.length; i++) {
			if (!(vaga[i] == null)) {
				System.out.println("Vaga Ocupada: " + i);
			} else {
				System.out.println("Vaga Livres: " + i);
			}
		}
	}

	public void vagasDesocupadas() {
		System.out.println("Vagas Vazias\n");
		for (int i = 0; i < vaga.length; i++) {
			if (!(vaga[i] == null)) {
				// System.out.println("Vaga Ocupada: " + i);
			} else {
				System.out.println("Vaga livre: " + i + "");
			}
		}
	}

	public void data() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date) + "\n");
	}

	public void calcValorEstacionemnto(String placa) {

		for (Vaga temp : historico) {
			double valorHora = 10;
			if (temp.getPlaca().equals(placa)) {
				System.out.println(placa);
				DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
				String horaEntrada = formatterHora.format(temp.getHoraEntrada());
				System.out.println("Hora da Entrada: " + horaEntrada);
				String horaSaida = formatterHora.format(temp.getHoraSaida());
				System.out.println("Hora da Saida: " + horaSaida + "\n");

				Long tempo = Duration.between(temp.getHoraEntrada(), temp.getHoraSaida()).toMinutes();

				if (!temp.getPlaca().equals(placa)) {
					System.out.println("Nehum Carro Saiu");
				} else {
					if (tempo <= 1) {
						System.out
								.println("Obrigado volte sempre!. Liberado tempo ultilizado: " + tempo + ", Minutos\n");
					} else if (tempo > 1 || tempo <= 2) {
						double valorFinal = valorHora;
						System.out.println(
								"O Valor a pagar: R$ " + valorFinal + ", tempo ultilizado: " + tempo + ", Minutos\n");
						temp.setValor(valorFinal);
					}

				}
			}
		}

	}

	public void caixa() {
		double somaDaArray = 0;
		for (Vaga temp : historico) {
			System.out.println("Valores do carros, Valor " + temp.getValor() + ", Nome: " + temp.getNome() + ", Placa: "
					+ temp.getPlaca());
			somaDaArray += temp.getValor();
		}
		System.out.println("Total do Caixa: " + somaDaArray);

	}

}
