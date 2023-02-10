package aula_02.exercicios_entrega;

import java.util.Scanner;

public class If_ImparPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		

		if (numero % 2 == 0 && numero > 0)
			System.out.println("O Número " + numero + " é par e positivo!");

		else if (numero % 2 == 0 && numero < 0)
			System.out.println("O Número " + numero + " é par e negativo!");
		
		else if (numero % 2 != 0 && numero > 0)
			System.out.println("O Número " + numero + " é impar e positivo!");
		
		else if (numero % 2 != 0 && numero < 0)
			System.out.println("O Número " + numero + " é impar e negativo!");
		
		leia.close();
		
		/*
		 * Esperado: 
		 * 
		 * Digite um número inteiro: 2
		 * O Número 2 é par e positivo!
		 * 
		 * Digite um número inteiro: -3
		 * O Número -3 é impar e negativo!
		 * 
		 * Digite um número inteiro: -2
		 * O Número -2 é par e negativo!
		 * 
		 * Digite um número inteiro: 3
		 * O Número 3 é impar e positivo!

		 */		
	}
}
