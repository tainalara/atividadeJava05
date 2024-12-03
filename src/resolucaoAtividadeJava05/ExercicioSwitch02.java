package resolucaoAtividadeJava05;

import java.util.Scanner;

public class ExercicioSwitch02 {

	public static void main(String[] args) {

		// Variaveis

		String nome;
		int cargo;
		float salario;

		Scanner leia = new Scanner(System.in); // Colocar a estrutura leia

		// Entrada de Dados
		
		System.out.println("Qual é o seu nome?");
		nome = leia.nextLine();

		System.out.println("\n# ## ### #### #########   Cargos na Empresa  ########## #### ### ## #");
		System.out.println("\nCaso você seja GERENTE       digite o número 1");
		System.out.println("Caso você seja VENDEDORA     digite o número 2");
		System.out.println("Caso você seja SUPERVISORA   digite o número 3");
		System.out.println("Caso você seja MOTORISTA     digite o número 4");
		System.out.println("Caso você seja ESTOQUISTA    digite o número 5");
		System.out.println("Caso você seja TÉCNICA EM TI digite o número 6");

		System.out.println("\nDigite o número correspondente ao seu cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("\nDigite o valor do seu salário R$: ");
		salario = leia.nextFloat();

		// Processamento e saída de dados

		switch (cargo) {
		case 1:
			System.out.println("\nNome da colaboradora: " + nome + "\nCargo: Gerente \nSalário: R$" + salario*1.1);
			break;
		case 2:
			System.out.println("\nNome da colaboradora: " + nome + "\nCargo: Vendedora \nSalário: R$" + salario*1.07);
			break;
		case 3:
			System.out.println("\nNome da colaboradora: " + nome + "\nCargo: Supervisora \nSalário: R$" + salario*1.09);
			break;
		case 4:
			System.out.println("\nNome da colaboradora: " + nome + "\nCargo: Motorista \nSalário: R$" + salario*1.06);
			break;
		case 5:
			System.out.println("\nNome da colaboradora: " + nome + "\nCargo: Estoquista \nSalário: R$" + salario*1.05);
			break;
		case 6:
			System.out.println("\nNome da colaboradora" + nome + "\nCargo: Técnica em TI \nSalário: R$" + salario*1.08);
			break;
		default:
			System.out.println("Opção inválida");
		}
		System.out.println("\nPesquisa Finalizada");

	}

}
