package aula_03.exercicios_entrega;

import java.util.Scanner;

public class DoWhile_SomaPositivos {

	public static void main(String[] args) {
		
		/*
		 * Input número 
		 * Para o contador se o número for 0
		 * Mostra a soma dos números de entrada que foram positivos
		 */

		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int somaPositivos = 0;
		
		do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            if (numero > 0) {
                somaPositivos += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + somaPositivos);
        
        leia.close();
        
        /*
         * Esperado: 
         * 
         * Digite um número: 2
         * Digite um número: 7
         * Digite um número: -31
         * Digite um número: 4
         * Digite um número: -11
         * Digite um número: 6
         * Digite um número: 9
         * Digite um número: -25
         * Digite um número: 8
         * Digite um número: 0
         * A soma dos números positivos é: 36

         */
        
        }
    }
