package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a seguencia que deseja: ");
		int fn = sc.nextInt();
		
		int fi = 1;
		int cont = 2;
		
		for(int i= 1; i <= fn; i++) {			
			cont = cont + fi;
			fi = cont - fi;
		 System.out.print("" + fi + ", ");
		}
		sc.close();
	}

}
