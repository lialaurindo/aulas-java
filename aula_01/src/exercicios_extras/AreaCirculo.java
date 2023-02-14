package exercicios_extras;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		//BEECROWD 1002
		
		/*
		 *  Cacular area de uma circunferência dado número do raio.
		 *  Area = π . raio2. 
		 *  Considera π = 3.14159
		 *  Efetua cálculo de raio ao quadrado e retorna valor da area.
		 *  
		 */
		Scanner leia = new Scanner(System.in);

		double raio = leia.nextDouble();
		double n = 3.14159;
		double area = n*(Math.pow(raio, 2));
		
		System.out.printf("A=%.4f",(area),"\n");
		
		/*
		 * Esperado: 
		 * 2,00
		 * A=12,5664
		 * 
		 *100,64
		 *A=31819,3103
		 * 
		 * 150,00
		 * A=70685,7750
		 */

		
		
	}

}
