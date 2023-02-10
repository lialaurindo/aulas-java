package aula_02.exercicios_aula;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double n1, n2;

		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();

		System.out.println("O número " + n1 + "elevado ao número " + n2 + "é igual a " + Math.pow(n1, n2));
		System.out.println("A Raíz quadrada do número " + n1 + "é igual a " + Math.sqrt(n1));

		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++ n1);

		System.out.println("Pré Incremento");
		System.out.println(n2);
		System.out.println(n2 ++);

		System.out.println(n1 = n1 + n2);
		System.out.println(n1 += n2);

		System.out.println("O número " + n1 + "somando ao número " + n2 + "é igual a " + (n1 + n2));
		System.out.println("O número " + n1 + "subtraido ao número " + n2 + "é igual a " + (n1 - n2));
		System.out.println("O número " + n1 + "multiplicado ao número " + n2 + "é igual a " + (n1 * n2));


		if (n2 > 0) //aqui exclui os números negativos
		if (n2 != 0) //aqui elimina o zero da operação

		//se fossem duas ações, precisaria abrir {}

		System.out.println("O número " + n1 + "dividido ao número " + n2 + "é igual a " + (n1 / n2));
		else
		System.out.println("Não é possível dividir um número por zero");

		leia.close();

	}
}
