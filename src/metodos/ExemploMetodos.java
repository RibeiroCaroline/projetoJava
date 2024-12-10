package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		falar("Bom dia!");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem();
		
	}
	
	
	// Definição do Método Somar - Método Com Retorno e Com Parametro
	public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
		
	}
	
	// Definição do Método Falar - Método Sem Retorno e Com Parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}
	

}
