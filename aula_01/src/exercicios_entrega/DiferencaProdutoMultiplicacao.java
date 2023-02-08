package exercicios_entrega;

import java.util.Scanner;

public class DiferencaProdutoMultiplicacao {
	
	public static void main(String[] args) {
		
//Cálculo com input pelo terminal
		
        Scanner leia = new Scanner(System.in);
        		
		int numero1; int numero2; int numero3; int numero4;
		
        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = leia.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        numero2 = leia.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        numero3 = leia.nextInt();
        System.out.println("Digite o quarto número inteiro: ");
        numero4 = leia.nextInt();       
		System.out.println("A diferença entre os produtos das multiplicações é de: " + ((numero1*numero2)-(numero3*numero4)));
		
/*Esperado:

Digite o primeiro número inteiro: 
5
Digite o segundo número inteiro: 
6
Digite o terceiro número inteiro: 
7
Digite o quarto número inteiro: 
8
A diferença entre os produtos das multiplicações é de: -26

 */
		
		
/* Cálculo com valores fixos 
		
		int numero1 = 5;
		int numero2 = 6;
		int numero3 = 7;
		int numero4 = 8;
		
		int primeiraMultiplicacao = numero1 * numero2;
		int segundaMultiplicacao = numero3 * numero4;
		int diferencaResultadosMultiplicacao = primeiraMultiplicacao - segundaMultiplicacao;

		System.out.printf("A diferença da primeira multiplicação para a segunda multiplicação é: " + diferencaResultadosMultiplicacao);
*/
	}

}
