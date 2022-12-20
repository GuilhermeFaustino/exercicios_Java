package academy.company.app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
			System.out.println("___________________________\nDivinaLoja\n"
					 + "___________________________\n"
					+ "1 - Vendas.\n"
					+ "2 - Cadastro dos Produtos\n" 
					+ "3 - Estoque dos Produtos.\n"
					+ "4 - Busca Produtos.\n"
					+ "5 - Pagamentos.\n"
					+ "6 - Historico de vendas\n"
					+ "7 - Caixa.\n"
					+ "0 - Sair Vendas");		
			sc.next();
		}while(op != 0);		
		sc.close();
	}

}
