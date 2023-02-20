package exercicios_entrega;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
//Cálculo com input pelo terminal
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto; float adicionalNoturno; float horasExtras; float descontos;

        System.out.println("Digite seu Salário Bruto: ");
        salarioBruto = leia.nextFloat();
        
        System.out.println("Digite o valor do Adicional Noturno: ");
        adicionalNoturno = leia.nextFloat();
        
        System.out.println("Digite o valor da Hora Extra: ");
        horasExtras = leia.nextFloat();
        
        System.out.println("Digite o valor dos Descontos: ");
        descontos = leia.nextFloat();  

        System.out.printf("Seu salário líquido é de: %.2f", (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos));

        
/*Esperado: 
	    Digite seu Salário Bruto: 
		2000,00
		Digite o valor do Adicional Noturno: 
		500,00
		Digite o valor das Horas Extras: 
		100,00
		Digite o valor dos Descontos: 
		200,00
		Seu salário líquido é de: 2800,00
*/

		
/* Cálculo de salário com valores fixos:
		
		float salarioBruto = 2000.00f;
		float adicionalNoturno = 500.00f;;
		float horasExtras = 100.00f;
		float descontos = 200.00f;
		
		float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;
		
//		System.out.printf("Seu salário líquido é de: %.2f", salarioLiquido);
*/
	}

}
