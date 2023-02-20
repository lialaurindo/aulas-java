package aula_01.exercicios_aula;

import java.text.DecimalFormat;

public class Variaveis {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
				
		int numero = 10;
        String nome = "Lia Laurindo";
        double area = 45.639874521;

        System.out.println("O nome da participante é: " + nome);
        System.out.println("O nome da participante é: " + numero);
        System.out.printf("O número é: %f", area);
        System.out.printf("O número é: %3f", area);
        System.out.printf("O número é: %.2f\n", area);
        System.out.printf("O número é: " + df.format(area));
	}

}
