import java.text.DateFormat;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);			
		Estacionamento esta = new Estacionamento();		
        int escolha;
        esta.data();
        
  do {
	        Vaga vaga = new Vaga();	 
			System.out.println("  Escolha uma Op��o  ");
			System.out.println("-------------------------");
			System.out.println("01 - Entrada de Veiculo ?");
			System.out.println("02 - Saida de Veiculo ?");
			System.out.println("03 - Buscar Veiculo ?");
			System.out.println("04 - Mostar vagas Livres ?");
			System.out.println("05 - Mostar Ocupadas ?");
			System.out.println("06 - Exibir historico.");
			System.out.println("07 - Calcular Valor.");
			System.out.println("08 - Caixa.");
			System.out.println("09 - Sair");
			System.out.println("-------------------------");
			escolha = sc.nextInt();		
		switch(escolha){			
			case 1:
				System.out.print("CPF: ");	
				sc.nextLine();
			    vaga.setCpf(sc.nextLine());
			    
			    System.out.print("Nome: ");
			    vaga.setNome(sc.nextLine());
			    
			    System.out.print("Placa: ");
			    vaga.setPlaca(sc.nextLine());
			    
			    System.out.print("Modelo: ");
			    vaga.setModelo(sc.nextLine());
			    
			    System.out.print("Cor: ");
			    vaga.setCor(sc.nextLine());
			    
			    esta.listarVagas();
			    vaga.setHoraEntrada();
			    
			    System.out.print("Escolha o numero da vaga: ");
			    esta.addCarro(sc.nextInt(), vaga);
			    
			    esta.listarVagas();			    
				break;
			case 2:		
				System.out.println("Digite a placa do Veiculo");
				sc.nextLine();
				vaga.setHoraSaida();
				vaga.setValor(escolha);
			    esta.removeCarro(sc.nextLine());
				break;	
			case 3:		
				System.out.println("Placa do Veiculo");
				sc.nextLine();
			    esta.buscarCarro(sc.nextLine());
				break;
			case 4:
				esta.vagasDesocupadas();
				break;
			case 5:
				esta.vagasOcupadas();				
				break;
			case 6:
				vaga.setHoraSaida();
				esta.exibirHistorico();
				break;
			case 7:
				System.out.println("Placa:");
				sc.nextLine();
				esta.calcValorEstacionemnto(sc.nextLine());
				break;			
			case 8:
				esta.caixa();	
				break;
			case 9:
				System.out.println("Obrigado Volte sempre! ...");	
				break;
			default:
		}	
		
   }while(true);
	}
	
	
}





















