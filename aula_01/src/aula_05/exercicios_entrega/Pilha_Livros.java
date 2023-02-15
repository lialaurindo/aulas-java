package aula_05.exercicios_entrega;

import java.util.Scanner;
import java.util.Stack;

public class Pilha_Livros {

	public static void main(String[] args) {

		 /*
		 		Exercício: organizar a retirada de livros em uma pilha.
		 [x] Conter um Menu que aceite as opções 0, 1, 2 e 3, sendo: 
		 [x] 1: Deve solicitar o nome do livro. 
		 [x] 2: Listar todos os livros da pilha 
		 [x] 3: Retirar um livro da pilha 
		 [x] 0: O programa deve ser finalizado. 
		 [x] Se tentar retirar livro em pilha vazia, validar e informar que a pilha está vazia
		 .
		 */
		
			Stack<String> pilhaLivros = new Stack<String>();

			Scanner leia = new Scanner(System.in);

			int opcao;
			String livro;

			do {
				System.out.println("_________GERENCIADOR DE LIVROS________\n");
				System.out.println("1 - Adicionar livro na pilha");
				System.out.println("2 - Exibir todos os livros da pilha");
				System.out.println("3 - Retirar ultimo livro");
				System.out.println("0 - Sair do sistema");
				System.out.println("Digite o número da opção desejada: ");
				opcao = leia.nextInt();

				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do livro: ");
					leia.skip("\\R?");
					livro = leia.nextLine();
					pilhaLivros.add(livro);
					System.out.println("Cadastro concluído: \n" + livro + ", foi adicionado. :)\n");
					break;

				case 2:
					System.out.println("Todos os livros desta pilha: ");
					if (pilhaLivros.isEmpty())
						System.out.println("Não há livros na pilha! :/\n");
					else
						pilhaLivros.forEach(System.out::println);
					break;

				case 3:
					if (pilhaLivros.isEmpty())
						System.out.println("Não há livros na pilha!\n");
					else
						System.out.println(
								"O livro: " + pilhaLivros.pop() + " foi retirado da pilha.\nLivros restantes: ");
					pilhaLivros.forEach(System.out::println);
				default:
					if (opcao > 4)
						System.out.println("Opção inválida!\n");
				}

			} while (opcao != 0);
			System.out.println("Sistema finalizado!");

			leia.close();
	
		/*
		 * Esperado: 
		 * _________GERENCIADOR DE LIVROS________
		 * 1 - Adicionar livro na pilha
		 * 2 - Exibir todos os livros da pilha
		 * 3 - Retirar ultimo livro
		 * 0 - Sair do sistema
		 * Digite o número da opção desejada: 
		 * 1
		 * Digite o nome do livro: 
		 * O Auto da Compadecida
		 * Cadastro concluído: 
		 * O Auto da Compadecida, foi adicionado. :)
		 *
		 * 1
		 * Digite o nome do livro: 
		 * O Alquimista 
		 * Cadastro concluído: 
		 * O Alquimista , foi adicionado. :)
		 * 
		 * 1
		 * Digite o nome do livro: 
		 * Um Estudo em Vermelho
		 * Cadastro concluído: 
		 * Um Estudo em Vermelho, foi adicionado. :)
		 * 
		 * 2
		 * Todos os livros desta pilha: 
		 * O Auto da Compadecida
		 * O Alquimista 
		 * Um Estudo em Vermelho
		 * 
		 * 3
		 * O livro: Um Estudo em Vermelho foi retirado da pilha.
		 * Livros restantes: 
		 * O Auto da Compadecida
		 * O Alquimista 
		 * 
		 * 0
		 * Sistema finalizado!
		 */		
		
	} 
}

