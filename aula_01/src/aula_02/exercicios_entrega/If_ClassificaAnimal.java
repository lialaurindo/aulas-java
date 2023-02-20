package aula_02.exercicios_entrega;

import java.util.Scanner;

public class If_ClassificaAnimal {

	public static void main(String[] args) {
		
		/*
		 * Retorna animal de acordo com o input de 3 caracteristicas;
		 * input caracteristica 1, 2 e 3;
		 * valida caracteristicas por Strings;
		 * retorna animal
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		String animal01, animal02, animal03;

		System.out.println("Digite o 1º animal");
		leia.skip("\\R?");
		animal01 = leia.nextLine();

		System.out.println("Digite o 2º animal");
		leia.skip("\\R?");
		animal02 = leia.nextLine();

		System.out.println("Digite o 3º animal");
		leia.skip("\\R?");
		animal03 = leia.nextLine();

		if (animal01.equals("vertebrado")) {
			if (animal02.equals("ave")) {
				if (animal03.equals("carnivoro"))
					System.out.println("águia");
				else
					System.out.println("pomba");
			} else {
				if (animal03.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (animal02.equals("inseto")) {
				if (animal03.equals("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (animal03.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
		}
		
		/*
		 * Esperado: 
		 * Digite o 1º animal
		 * vertebrado
		 * Digite o 2º animal
		 * mamífero
		 * Digite o 3º animal
		 * onívoro
		 * vaca

		 */
			leia.close();
	}

}
