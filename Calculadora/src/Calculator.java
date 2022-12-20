import java.util.Scanner;

import entites.Calc;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um numero: ");
		int number1 = sc.nextInt();		
		
		System.out.println("Digite o segundo numero: ");
		int number2 = sc.nextInt();
		
		double result = 0; 
		
		System.out.println("Escolha o Operador: '+', '-', '/', '*' ");
		String oper = sc.next();		
		if(oper.equals("+")) {
			result = Calc.somar(number1, number2);
			System.out.println("Resultado : " + result);
		}else if(oper.equals("-")){
			result = Calc.subtrair(number1, number2);
			System.out.println("Resultado : " + result);
		}else if(oper.equals("*")) {
			result = Calc.multiplicar(number1, number2);
			System.out.println("Resultado : " + result);
		}else if(oper.equals("/")){
			result = Calc.dividir(number1, number2);
			System.out.println("Resultado : " + result);			
		}else{
			System.out.println("Operador nao existe, fvaor tente novamente.");
		}		
		
		sc.close();
	}
	
	

}
