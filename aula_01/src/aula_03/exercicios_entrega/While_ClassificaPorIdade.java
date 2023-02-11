package aula_03.exercicios_entrega;

import java.util.Scanner;

public class While_ClassificaPorIdade {

	public static void main(String[] args) {

		/*
		 * Input idade 
		 * Para o contador se idade for negativa e mostra relação pessoas x idade
		 * A relação é: quantidade de menores de 21 anos e quantidade de maiores de 50 anos.
		 */

		Scanner leia = new Scanner(System.in);

		int idade;

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		int menoresDe21Anos = 0;
		int maioresDe50Anos = 0;

		while (idade > 0) {
			if (idade < 21) {
				menoresDe21Anos++;
			}else if (idade > 50) {
				maioresDe50Anos++;
			}

			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menoresDe21Anos);
		System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50Anos);

		leia.close();
		
		/*
		 * Esperado: 
		 * 
		 * Digite uma idade: 80
		 * Digite uma idade: 15
		 * Digite uma idade: 20
		 * Digite uma idade: 13
		 * Digite uma idade: 5
		 * Digite uma idade: -1
		 * Total de pessoas menores de 21 anos: 4
		 * Total de pessoas maiores de 50 anos: 1
		 */
		
		
	}

}
