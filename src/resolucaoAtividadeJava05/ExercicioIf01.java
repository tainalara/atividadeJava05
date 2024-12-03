package resolucaoAtividadeJava05;

import java.util.Scanner;

public class ExercicioIf01 {

	public static void main(String[] args) {

		// Variaveis

		int numA;
		int numB;
		int numC;
		int somaAB;

		// Estrutura Leia

		Scanner leia = new Scanner(System.in);

		// Entrada de Dados

		System.out.println("Digite o número A: ");
		numA = leia.nextInt();

		System.out.println("Digite o número B: ");
		numB = leia.nextInt();

		System.out.println("Digite o número C: ");
		numC = leia.nextInt();

		// Processamento

		somaAB = numA + numB;

		if ((numA + numB) > numC) {

			System.out.println(numA + " + " + numB + " = " + somaAB + " > " + numC); // Saída de Dados
			System.out.println("\nA Soma de A + B é Maior do que C"); // Saída de Dados

		} else if ((numA + numB) < numC) {

			System.out.println(numA + " + " + numB + " = " + somaAB + " < " + numC); // Saída de Dados
			System.out.println("\nA Soma de A + B é Menor do que C"); // Saída de Dados
		
		} else  {

			System.out.println(numA + " + " + numB + " = " + somaAB + " = " + numC); // Saída de Dados
			System.out.println("\nA Soma de A + B é Igual a C"); // Saída de Dados
		}

	}

}
