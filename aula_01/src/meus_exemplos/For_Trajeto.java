package meus_exemplos;

public class For_Trajeto {

	public static void main(String[] args) {
		/*
		For: João de 6 anos
		Quando preciso que João faça alguma coisa, incluo mais detalhes para que ele entenda 
		de forma clara e para que o resultado seja aquilo que espero. 
		Ele está dando suas primeiras pedaladas de bicicleta e agora vai tentar sozinho, então explico
		o caminho que ele irá fazer. Digo de onde ele vai começar, até onde ele pode ir, e como ele vai contar.

		Minha orientação para João: 
		João vai começar o trajeto da casa 1, vai até a casa 5, contando casa por casa (uma a uma). 
		Quando passar da casa 5 quero que ele me dê um tchauzinho e volte. 

		O trajeto que João fez:
*/
				int casa;
				
				for (casa = 1; casa <= 5; ++ casa) {
				    System.out.println("João passa pela casa " + casa);		   
				} 
				
				System.out.println("Tchauzinho do João");
				System.out.println("João volta");

				/*
				 * Esperado:
				 * João passa pela casa 1
				 * João passa pela casa 2
				 * João passa pela casa 3
				 * João passa pela casa 4
				 * João passa pela casa 5
				 * Tchauzinho do João
				 * João volta
				 */
	}
}
