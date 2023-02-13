package exercicios_extras;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		//BEECROWD 1003
		/*
		 * recebe numero para A
		 * recebe numero para B
		 * soma A + B
		 * Exibe resultado da soma
		 */
		
		// Não aceitou incluindo o
		//System.out.println na variaveis A e B
		
		Scanner leia = new Scanner(System.in);
		
		
		int A = leia.nextInt();
		int B = leia.nextInt();
		int SOMA = A + B;
	
		System.out.println("SOMA = " + SOMA);

		leia.close();
		
		/* 
		 * Esperado: 
		 * 30
		 * 10
		 * SOMA = 40
		 * 
		 * -30
		 * 10
		 * SOMA = -20
		 * 
		 * 0
		 * 0
		 * SOMA = 0
		 */
	}
}
