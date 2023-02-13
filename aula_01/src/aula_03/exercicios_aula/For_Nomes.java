package aula_03.exercicios_aula;

import java.util.Scanner;

public class For_Nomes {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			String nome;
			int contador;
//O que espero que esta operação faça:
// para este contador que se inicia em '1' | contador = 1
// preciso que realize a operação abaixo até que o contador seja menor que 4 | contador < 4
// o contador deve somar de 1 em 1 | contador ++
			
			System.out.println("Cite o nome de 3 mulheres que fizeram história na programação: ");
			
			for (contador = 1; contador < 4; contador ++) {
				
				//para todas as vezes que a condição acima for verdadeira, a operação abaixo se realiza;
				//como o contador tem condição de ser menor que 4, a operação só é executada 3 vezes.
				
				System.out.println("\nDigite o " + contador + "º nome: ");
				nome = leia.nextLine();
				
				System.out.println("O " + contador + "º nome é: " + nome);

			}
		}
	} 
}

/*
 * Esperado: 
 * Cite o nome de 3 mulheres que fizeram história na programação: 
 * Digite o 1º nome: Ada Lovelace
 * O 1º nome é: Ada Lovelace
 * Digite o 2º nome: Grace Hopper
 * O 2º nome é: Grace Hopper
 * Digite o 3º nome: Mary Kenneth Keller
 *  3º nome é: Mary Kenneth Keller

 */

/*
Estamos aplicando o loop ao invés de realizarmos a operação assim: 

String nome1, nome2, nome3;
Scanner leia = new Scanner(System.in);

System.out.println("Digite o 1º nome: ");
nome1 = leia.nextLine();
System.out.println("O 1º nome é: " + nome1);

System.out.println("\nDigite o 2º nome: ");
nome2 = leia.nextLine();
System.out.println("O 2º nome é: "  + nome2);

System.out.println("\nDigite o 3º nome: ");
nome3 = leia.nextLine();
System.out.println("O 3º nome é: "  + nome3);

leia.close();

//neste modo o código fica bem extenso e seria trabalhoso se tivessemos que incluir muitos nomes.
 * 
 */