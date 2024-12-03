package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {

		// Variaveis
		float Media;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite a Média: ");
		Media = leia.nextFloat();

		// Processamento
		if (Media >= 6) {
			// Saída
			System.out.println("Parabéns, você foi aprovado!");
		} else if(Media >= 5 ){
			// Saída
			System.out.println("Participante de Exame");
		}else {
			System.out.println("Infelizmente, você foi reprovado.");
		}

	}

}