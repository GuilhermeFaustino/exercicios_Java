
public class Calculadora {	
		
		public double valor;
		public double valor1;		
		public double resultado;
		
		String menu = "Esolha o Operador: \n"
				+ "Somar + \n"
				+ "Divisao / \n"
				+ "Subtracao - \n"
				+ "Multiplicacao * \n ";
				
		
		private void somar() {
			 resultado = this.valor +  this.valor1;
		}
		
		private void multiplicar() {
			 resultado = this.valor *  this.valor1;
		}
		private void subtrair() {
			resultado = this.valor -  this.valor1;
		}
		private void dividir() {
			resultado = this.valor /  this.valor1;			
		}
		public void calcular() {	
			
			switch(menu) {
				case  "+" :
					this.somar();
					break;
				case  "-" :
					this.subtrair();
					break;
				case  "/" :
					this.dividir();
					break;
				case  "*" :
					this.multiplicar();
					break;	
				 default:
				       System.out.println("Escolha Um Operador Correto");	
			}
			
		}
		
		
	

}
