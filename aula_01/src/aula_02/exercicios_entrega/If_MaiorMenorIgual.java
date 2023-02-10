package aula_02.exercicios_entrega;

import java.util.Scanner;

public class If_MaiorMenorIgual {

	public static void main(String[] args) {

		/*
		 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C. Imprima na
		 * tela se a soma de A + B é maior, menor ou igual a C.
		 */

		Scanner leia = new Scanner(System.in);

		int a, b, c;

		System.out.println("Digite um valor inteiro para a: ");
		a = leia.nextInt();

		System.out.println("Digite um valor inteiro para b: ");
		b = leia.nextInt();

		System.out.println("Digite um valor inteiro para c: ");
		c = leia.nextInt();

		int soma = a + b;

		if (soma > c)
			System.out.println("O resultado de a + b é maior do que c");

		else if (soma < c)
			System.out.println("O resultado de a + b é menor do que c");

		else if (soma == c)
			System.out.println("O resultado de a + b é igual a c");

		leia.close();

		/*
		 * Esperado: 
		 * Digite um valor inteiro para a: 2 
		 * Digite um valor inteiro para b: 4
		 * Digite um valor inteiro para c: 5 
		 * O resultado de a + b é maior do que c
		 * 
		 * Digite um valor inteiro para a: 2
		 * Digite um valor inteiro para b: 2
		 * Digite um valor inteiro para c: 5
		 * O resultado de a + b é menor do que c
		 * 
		 * Digite um valor inteiro para a: 2
		 * Digite um valor inteiro para b: 2
		 * Digite um valor inteiro para c: 4
		 * O resultado de a + b é igual a c
		 */
	}
}
