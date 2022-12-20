import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();		
		
		
		System.out.println("Digite o primeiro Valor");
		calc.valor = sc.nextDouble();		
		
		System.out.println(calc.menu);
		calc.menu = sc.next();
		
		System.out.println("Digite o primeiro Valor");
		calc.valor1 = sc.nextDouble();		
		
		
		calc.calcular();
		
		System.out.println("O resultado do Calculo é," + calc.resultado);
		
		sc.close();
		
	}
}
