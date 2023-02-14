package aula_04.exercicios_aula;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor_Numeros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {1,2,3,4,5};
		
		float[] vetorFloat = new float[5];
		
		//mostra números e posição no vetor
		for(int contador = 0; contador < vetorInteiros.length; contador ++)
			System.out.println("posição " + contador + " = " + vetorInteiros[contador]);

		//atribui novos valores para o vetor
		for(int indice = 0; indice < vetorFloat.length; indice ++) {
			System.out.println("Digite um valor para a posição [" + indice +"]");
			vetorFloat[indice] = leia.nextFloat();
		}
		
		//aplica ordem crescente para os números do vetor
		Arrays.sort(vetorFloat);
		//mostra os números tratados pela ordem crescente
		for(var numero : vetorFloat)
			System.out.println(numero);
				
		leia.close();

	}
}
