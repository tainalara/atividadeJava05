package resolucaoAtividadeJava05;

import java.util.Scanner;

public class ExercicioIf02 {

	public static void main(String[] args) {
		
		// Variáveis
		
		int num;
		String parImpar;
		String sinal;
		
		//Contruindo o Leia
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Dados
		
		System.out.println("Digite o número: ");
		num = leia.nextInt();
		
		//Processamentos
		
		//Processamento para descobrir se é Par ou Ímpar
		
		if (num %2 == 0) {
			parImpar = "Par";
				
		} else {
			parImpar ="Ímpar";
		}
		
		//Processamento para descobrir se é Positivo ou Negativo
		
		if (num > 0) {
			sinal ="Positivo!";			
		} else {
			sinal ="Negativo!";
		}
		
		//Saída de Dados 
		
		System.out.println("O Número " + num + " é " + parImpar + " e " + sinal);


	}

}
