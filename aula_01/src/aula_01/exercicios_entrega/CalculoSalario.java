package exercicios_entrega;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float salario; float abono; float novoSalario;
		
		System.out.println("Digite o valor do salário: ");
        salario = leia.nextFloat();
		System.out.println("Digite o valor do Abono: ");
        abono = leia.nextFloat();
        System.out.printf("Você receberá o valor de : %.2f", (salario + abono));

/* Esperado: 
Digite o valor do salário: 
10000,00
Digite o valor do Abono: 
1000,00
Você receberá o valor de : 11000,00

 */
		
/* Cálculo com valores fixos 
		
		float salario = 10000.00f;
		float abono = 1000.00f;
		float novoSalario = 11000.00f;

		System.out.println("Seu salario é de: " + (salario) + "\nVocê receberá Abono de: " + (abono) + "\nReceberá no total: " + (novoSalario));
*/
	}

}
