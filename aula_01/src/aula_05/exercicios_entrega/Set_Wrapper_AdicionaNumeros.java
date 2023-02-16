package aula_05.exercicios_entrega;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

public class Set_Wrapper_AdicionaNumeros {

	public static void main(String[] args) {
		
		
		/* 
		 	 Exercício: adiciona Inteiros na Collection Set

		 [x] Solicita entrada de 10 números Inteiros;
		 [x] Exibe todos os elementos da Collection Set, usando Classe Iterator. 
		 
		 */

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();
		int valor;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + ("º número"));
			valor = leia.nextInt();
			numeros.add(valor);
		}

		Iterator<Integer> iNumeros = numeros.iterator();
		System.out.println("\nLista de dados: \n");
		
		while (iNumeros.hasNext())
			System.out.println(iNumeros.next());
		
		/*
		 * Digite o 1º número 
		 * 2
		 * Digite o 2º número 
		 * 5
		 * Digite o 3º número 
		 * 1 
		 * Digite o 4º número 
		 * 3
		 * Digite o 5º número 
		 * 4
		 * Digite o 6º número 
		 * 9
		 * Digite o 7º número 
		 * 7
		 * Digite o 8º número 
		 * 8
		 * Digite o 9º número 
		 * 10
		 * Digite o 10º número 
		 * 6
		 * 
		 * Lista de dados: 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 */
		
	}
}
