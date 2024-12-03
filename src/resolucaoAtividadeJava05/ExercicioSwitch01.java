package resolucaoAtividadeJava05;

import java.util.Scanner;

public class ExercicioSwitch01 {

	public static void main(String[] args) {
		
		//Variaveis
		
	
		int produto; 
		int quantidade;
				
		Scanner leia = new Scanner(System.in); //Colocar a estrutura leia

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\nDigite 1 se você quiser comprar: Cachorro Quente (R$10,00)");
		System.out.println("Digite 2 se você quiser comprar: X-Salada        (R$15,00)");
		System.out.println("Digite 3 se você quiser comprar: X-Bacon         (R$18,00)");
		System.out.println("Digite 4 se você quiser comprar: Bauru           (R$12,00)");
		System.out.println("Digite 5 se você quiser comprar: Refrigerante    (R$ 8,00)");
		System.out.println("Digite 6 se você quiser comprar: Suco de Laranja (R$13,00)");
		
		//Entrada de Dados
		System.out.println("\nDigite o número do produto que você deseja comprar: ");
		produto = leia.nextInt();
		
		System.out.println("\nQuantas unidades deste produto você quer comprar?");
		quantidade = leia.nextInt();
		
		// Processamento e saída de dados
		
		switch (produto) {
		case 1:
			System.out.println("\nProduto: Cachorro-Quente / Valor Total: " +10.00*quantidade);
			break;
		case 2:
			System.out.println("\nProduto: X-Salada / Valor Total: " +15.00*quantidade);
			break;
		case 3:
			System.out.println("\nProduto: X-Bacon / Valor Total: " +18.00*quantidade);
			break;
		case 4:
			System.out.println("\nProduto: Bauru / Valor Total: " +12.00*quantidade);
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante / Valor Total: " +8.00*quantidade);
			break;
		case 6:
			System.out.println("\nProduto: Suco de Laranja / Valor Total: " +13.00*quantidade);
			break;
		default:  		
			System.out.println("Opção inválida");
		}
		System.out.println("\nPedido Finalizado");

	}

	}
