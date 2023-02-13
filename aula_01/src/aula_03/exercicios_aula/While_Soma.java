package aula_03.exercicios_aula;

import java.util.Scanner;

public class While_Soma {

	public static void main(String[] args) {

		/*
		 * Input primeiro número; Input segundo número; Realiza e mostra a soma dos dois
		 * números informados; Pergunta se deseja somar novamente (s/n); Input de 's'
		 * realiza novamente a operação; Input de 'n' finaliza a operação;
		 */

		// aqui no while sou mais direto, já coloco minha condição limitante;
		// nossa condicional para a repetição da operação se dá pela variavel 'continua'
		// continua já se inicia com a string 's' | String continua = "s";
		// logo a condição para realizar o lopp é: pare quando a condição for a negação
		// de 'continua', ou seja, quando for exatamente igual a 'n'.

		String continua = "s";
		int numero1, numero2, resultado;

			try (Scanner leia = new Scanner(System.in)) {
				while (!continua.equals("n")) {

					System.out.println("Digite o primeiro valor: ");
					numero1 = leia.nextInt();

					System.out.println("Digite o segundo valor: ");
					numero2 = leia.nextInt();

					resultado = numero1 + numero2;

					System.out.println("O resultado da soma é: " + resultado);

					System.out.println("\n_________________MENU_______________");
					System.out.println("\nDeseja novamente somar dois valores?");
					System.out.println("\nDigite s para sim OU digite n para não: ");
					continua = leia.next();
					System.out.println("__________FIM DA OPERAÇÃO____________");

				}
			}

			/*
			 * Esperado: 
			 * Digite o primeiro valor: 5 
			 * Digite o segundo valor: 5 
			 * O resultado da soma é: 10 
			 * _________________MENU_______________ 
			 * Deseja novamente somar dois valores? 
			 * Digite s para sim OU digite n para não: n 
			 * __________FIM DA OPERAÇÃO____________
			 * 
			 */

		}
	}
