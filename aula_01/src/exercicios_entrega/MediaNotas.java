package exercicios_entrega;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
//Cálculo com input pelo terminal
		
		Scanner leia = new Scanner(System.in);
		
		float nota1; float nota2; float nota3; float nota4;
		
		System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
        nota3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
        nota4 = leia.nextFloat();
        
		System.out.printf("Sua média final é %.1f", ((nota1 + nota2 + nota3 + nota4) / 4));		
		
/*Esperado:
 
Digite a primeira nota: 
10
Digite a segunda nota: 
8
Digite a terceira nota: 
7
Digite a quarta nota: 
7,5
Sua média final é 8,1

 */
		

/* Cálculo com valores fixos:
 * 		
		float nota1 = 10.0f;
		float nota2 = 8.0f;
		float nota3 = 7.0f;
		float nota4 = 7.5f;
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Sua média final é %.1f", media);
*/
	}

}
