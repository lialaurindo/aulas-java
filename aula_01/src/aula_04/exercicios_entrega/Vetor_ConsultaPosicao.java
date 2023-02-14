package aula_04.exercicios_entrega;

import java.util.Scanner;

public class Vetor_ConsultaPosicao {

	public static void main(String[] args) {

		/*
		 * Consulta posição de um número no Vetor
		 * 
		 * Input de número; 
		 * realiza procura pela posição desse número no vetor; 
		 * retorna número consultado e posição; 
		 * caso o número não apareça no vetor, exibe mensagem de erro.
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int consultaNumero;

		System.out.println("Qual número quer localizar no vetor? ");
		consultaNumero = leia.nextInt();

		for (int indice = 0; indice < vetor.length; indice ++) {
			if (consultaNumero == vetor[indice]) {
				System.out.printf("O número %d está localicado na posição %d", consultaNumero, indice );
				break;
			} if (vetor.length - 1 != consultaNumero) {
					System.out.println("O número " + consultaNumero +  " não foi encontrado!");
					break;
				}

			} 
		
		leia.close();
		
		/*
		 * Esperado: 
		 * Qual número quer localizar no vetor? 7
		 * O número 7 está localicado na posição 6
		 * 
		 * Qual número quer localizar no vetor? 40
		 * O número 40 não foi encontrado!
		 * 
		 */
		
		}	
	}
