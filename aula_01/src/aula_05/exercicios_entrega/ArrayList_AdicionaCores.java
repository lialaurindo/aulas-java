package aula_05.exercicios_entrega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_AdicionaCores {

	public static void main(String[] args) {
		
		
		/* 
		 Exercício: organização de lista com Strings 

		 [x] Solicita entrada de 5 nomes de cores 
		 [x] Inclui as cores de entrada na Arraylist individualmente
		 [x] Exibição1:  todas as cores adicionadas. 
		 [x] Exibição2: todas as cores adicionadas ordenadas em ordem crescente (A-Z)

		 */
		
		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		String cor;

		System.out.println("Você deve digitar o nome de 5 cores: \n");

		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Digite a cor nº " + contador);
			leia.skip("\\R?");
			cor = leia.nextLine();
			cores.add(cor);

		}

		System.out.println("\nLista de todas as cores digitadas: ");
		cores.forEach(System.out::println);

		System.out.println("\nLista ordenada (A-Z): ");
		Collections.sort(cores);
		cores.forEach(System.out::println);
		
		/*
		 * Esperado:
		 * Você deve digitar o nome de 5 cores: 
		 * Digite a cor nº 1
		 * Azul
		 * Digite a cor nº 2
		 * Verde
		 * Digite a cor nº 3
		 * Amarelo
		 * Digite a cor nº 4
		 * Branco
		 * Digite a cor nº 5
		 * Laranja
		 * 
		 * Lista de todas as cores digitadas: 
		 * Azul
		 * Verde
		 * Amarelo
		 * Branco
		 * Laranja
		 * 
		 * Lista ordenada (A-Z): 
		 * Amarelo
		 * Azul
		 * Branco
		 * Laranja
		 * Verde
		 */


	}
}
