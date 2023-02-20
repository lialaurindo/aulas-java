package aula_02.exercicios_entrega;

import java.util.Scanner;

public class If_DoadorSangue {

	public static void main(String[] args) {
		
		/* 
		 * Valida se a pessoa está apta ou não para doar sangue;
		 * Input nome;
		 * Input idade;
		 * Input true ou false para primeira doação;
		 * valida idade: 
		 * ter entre 18 e 69 anos e se for entre 60 e 69, não pode ser a 
		 * primeira doação;
		 * retorna se está apto ou não para doar sangue.
		 */
		
		Scanner leia = new Scanner(System.in);

		int idade; 
		String nome; 
		boolean primeira;

		System.out.println("Digite o Nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Olá, " + nome + ". Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação? ");
		primeira = leia.nextBoolean();

		if (idade >= 60 && idade <= 69) {
			if (primeira)
				System.out.println("Não está apto para doar!");
			else
				System.out.println(nome + ", está apto para doar!");
		} else if (idade < 18 || idade > 69)
			System.out.println(nome + ", não está apto para doar!");
		else
			System.out.println(nome + ", está apto para doar!");
		
		/*
		 * Esperado: 
		 * Digite o Nome: Maria 
		 * Olá, Maria . Digite sua idade: 29
		 * Primeira doação? true
		 * Está apto para doar!
		 * --
		 * Digite o Nome: Maria
		 * Olá, Maria. Digite sua idade: 61
		 * Primeira doação? true
		 * Não está apto para doar!
		 * --
		 * Digite o Nome: Maria
		 * Olá, Maria. Digite sua idade: 17
		 * Primeira doação? true
		 * Não está apto para doar!
		 */

	}

}
