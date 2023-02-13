package aula_03.exercicios_aula;

import java.util.Scanner;

public class For_Tabuada {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			int numero, contador;  
			
			System.out.println("Digite o número para gerar a lista da Tabuada: ");
			numero = leia.nextInt();

			for (contador = 1; contador <= 10; contador++) {
			    System.out.println(numero + " x " + contador + " = " + numero * contador);

			}
		}
		
	}
}
