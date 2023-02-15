package aula_05.exercicios_aula;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_DoWhile_ManipulaNotas {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();

		Scanner leia = new Scanner(System.in);

		//Manipulação de uma lista de notas
		
		
		int opcao = 0;
		double nota = 0;
		
		
		do {

			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar todas as notas");
			System.out.println("3 - Buscar uma nota");
			System.out.println("4 - Remover uma nota");
			System.out.println("6 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
				
			case 2:
				System.out.println("Listar todas as notas");
				if (notas.isEmpty())
					System.out.println("Base de dados vazia!");
				else 
					notas.forEach(System.out::println);
				break;
				
			case 3:
				System.out.println("Procurar uma nota");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				System.out.println("O índice da nota é: " + notas.indexOf(nota));		
				break;
				
				case 4:
					System.out.println("Remover uma nota");	
					System.out.println("Digite a nota: ");	
					nota = leia.nextDouble();
					notas.remove(nota); //passo a nota
//					notas.remove(notas.indexOf(nota)); // Outra opção: passo o indice da nota
					
				default:
						if (opcao > 6)
							System.out.println("Opção inválida!");	
						}

		} while (opcao != 6);

		
		/*
		 * Esperado:
		 * 1 - Cadastrar nota
		 * 2 - Listar todas as notas
		 * 3 - Buscar uma nota
		 * 4 - Remover uma nota
		 * 6 - Sair
		 * Digite a opção desejada: 
		 * 1
		 * Digite uma nota entre 1 e 10
		 * 5
		 * 
		 * 1 - Cadastrar nota
		 * 2 - Listar todas as notas
		 * 3 - Buscar uma nota
		 * 4 - Remover uma nota
		 * 6 - Sair
		 * Digite a opção desejada: 
		 * 2
		 * Listar todas as notas
		 * 5.0
		 * 
		 * 1 - Cadastrar nota
		 * 2 - Listar todas as notas
		 * 3 - Buscar uma nota
		 * 4 - Remover uma nota
		 * 6 - Sair
		 * Digite a opção desejada: 
		 * 3
		 * Procurar uma nota
		 * Digite a nota: 
		 * 5
		 * A nota 5.0 existe? true
		 * O índice da nota é: 0


		 */
		

	}

}
