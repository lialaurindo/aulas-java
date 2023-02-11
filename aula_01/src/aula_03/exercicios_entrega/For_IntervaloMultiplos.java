package aula_03.exercicios_entrega;

import java.util.Scanner;

public class For_IntervaloMultiplos {

	public static void main(String[] args) {

		/*
		 * input inicio do intervalo 
		 * input fim do intervalo
		 * validação numero inicial menor que o numero final
		 * contador com validação de multiplos (3 e 5)
		 * mostra lista do intervalo e mensagem que é multiplo de 3 e 5
		 */

		Scanner leia = new Scanner(System.in);

		int inicioIntervalo, fimIntervalo;

		System.out.println("Digite o primeiro número do intervalo: ");
		inicioIntervalo = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		fimIntervalo = leia.nextInt();

		if (inicioIntervalo > fimIntervalo) {
			System.out.println("Intervalo Inválido! Primeiro número maior que o último.");
		} else {
			System.out.println("No intervalo entre " + inicioIntervalo + " e " + fimIntervalo + ":");
		}

		for (int numero = inicioIntervalo; numero <= fimIntervalo; numero++) {
			if (numero % 3 == 0 && numero % 5 == 0) {
				System.out.println(numero + " é multiplo de 3 e 5");
			}
		}

		leia.close();
		
		/*
		 * Esperado:
		 * 
		 * Digite o primeiro número do intervalo: 10
		 * Digite o último número do intervalo: 100
		 * No intervalo entre 10 e 100:
		 * 15 é multiplo de 3 e 5
		 * 30 é multiplo de 3 e 5
		 * 45 é multiplo de 3 e 5
		 * 60 é multiplo de 3 e 5
		 * 75 é multiplo de 3 e 5
		 * 90 é multiplo de 3 e 5
		 *

		 * Digite o primeiro número do intervalo: 100
		 * Digite o último número do intervalo: 10
		 * Intervalo Inválido! Primeiro número maior que o último.
		*/
	}
}
