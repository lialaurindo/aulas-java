package aula_02.exercicios_entrega;

import java.util.Scanner;

public class Switch_QuantidadeValorTotal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		/*
		 * Input código do produto; 
		 * Input quantidade desejada do produto; 
		 * Realizar quantidade desejada * preço unitário do produto; 
		 * Mostrar nome do produto e valor total;
		 */
		
//Itens do Cardápio
		String produto1 = "Cachorro Quente", produto2 = "X-Salada", produto3 = "X-Bacon", 
		produto4 = "Bauru", produto5 = "Refrigerante", produto6 = "Suco de laranja";

//Preços por Item
		double precoProduto1 = 10.00, precoProduto2 = 15.00, precoProduto3 = 18.00,
		precoProduto4 = 12.00, precoProduto5 = 08.00, precoProduto6 = 13.00;

//Variaveis Cálculo do Valor Total
		int codigoProduto, quantidadeProduto;

		System.out.println("--------------- CARDÁPIO ---------------\n");
		System.out.println("1-\t" + (produto1) + " ..... R$" + (precoProduto1));
		System.out.println("2-\t" + (produto2) + " .............R$" + (precoProduto2));
		System.out.println("3-\t" + (produto3) + " ............. R$" + (precoProduto3));
		System.out.println("4-\t" + (produto4) + " ............... R$" + (precoProduto4));
		System.out.println("5-\t" + (produto5) + " ........ R$" + (precoProduto5));
		System.out.println("6-\t" + (produto6) + "  .... R$" + (precoProduto6) + "\n");

		System.out.println("Digite o número corresponte ao produto do Cardápio: ");
		codigoProduto = leia.nextInt();
		System.out.println("Digite a quantidade desejada deste produto: ");
		quantidadeProduto = leia.nextInt();

		switch (codigoProduto) {

		case 1:
			System.out.println("Produto selecionado: " + (produto1) + 
					"\nValor Total: " + (quantidadeProduto * precoProduto1));
			break;

		case 2:
			System.out.println("Produto selecionado: " + (produto2) 
			+ "\nValor Total: " + (quantidadeProduto * precoProduto2));
			break;

		case 3:
			System.out.println("Produto selecionado: " + (produto3) 
			+ "\nValor Total: " + (quantidadeProduto * precoProduto3));
			break;

		case 4:
			System.out.println("Produto selecionado: " + (produto4)
			+ "\nValor Total: " + (quantidadeProduto * precoProduto4));
			break;

		case 5:
			System.out.println("Produto selecionado: " + (produto5) 
			+ "\nValor Total: " + (quantidadeProduto * precoProduto5));
			break;
		case 6:
			System.out.println("Produto selecionado: " + (produto6) 
			+ "\nValor Total: " + (quantidadeProduto * precoProduto6));
			break;
		default:
			System.out.println("Produto não está cardápio!");

		}

		leia.close();

	}

}
