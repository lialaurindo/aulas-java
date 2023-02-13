package meus_exemplos;

import java.util.Scanner;

public class While_SignosZoadiaco {

	public static void main(String[] args) {
		
		
		//Descobrir o signo de uma pessoa com base no mês e dia de nascimento
		//Input Mês de Nascimento
		//Input Dia de Nascimento
		//Retorna Signo 
		//Pergunta se deseja realizar nova consulta

		try (Scanner leia = new Scanner(System.in)) {
			String signo1 = "Capricórnio", signo2 = "Aquário", signo3 = "Peixes", signo4 = "Áries", 
					signo5 = "Touro", signo6 = "Gemeos", signo7 = "Cancêr", signo8 = "Leao", 
					signo9 = "Virgem", signo10 = "Libra", signo11 = "Escorpiao", signo12 = "Sagitario";

			String nome, continua = "s";
			int mesNascimento, diaNascimento;

			System.out.println("Qual é o seu nome?");
			nome = leia.nextLine();

			System.out.println(nome + ", qual é o mês do seu nascimento? (número de 1 a 12)");
			mesNascimento = leia.nextInt();

			System.out.println("E o dia do seu nascimento?");
			diaNascimento = leia.nextInt();

			while (!continua.equals("n")) {

				if (mesNascimento == 1 && diaNascimento <= 20 || mesNascimento == 12 && diaNascimento >= 22) {
					System.out.println(nome + ", seu signo é " + signo1);
					
				}

				else if (mesNascimento == 2 && diaNascimento <= 18 || mesNascimento == 1 && diaNascimento >=21) {
					System.out.println("Seu signo é " + signo2);
					
				}

				else if (mesNascimento == 3 && diaNascimento <= 20 || mesNascimento == 2 && diaNascimento >=19) {
					System.out.println("Seu signo é " + signo3);
					
				}

				else if (mesNascimento == 4 && diaNascimento <= 20 || mesNascimento ==3 && diaNascimento >=21) {
					System.out.println("Seu signo é " + signo4);
					
				}

				else if (mesNascimento == 5 && diaNascimento <= 20 || mesNascimento == 4 && diaNascimento >=21) {
					System.out.println("Seu signo é " + signo5);
					
				}

				else if (mesNascimento == 6 && diaNascimento <= 20 || mesNascimento == 5 && diaNascimento >=21) {
					System.out.println("Seu signo é " + signo6);
					
				}

				else if (mesNascimento == 7 && diaNascimento <= 22 || mesNascimento == 6 && diaNascimento >=21) {
					System.out.println("Seu signo é " + signo7);
					
				}

				else if (mesNascimento == 8 && diaNascimento <= 22) {
					System.out.println("Seu signo é " + signo8);
					
				}

				else if (mesNascimento == 9 && diaNascimento <= 22) {
					System.out.println("Seu signo é " + signo9);
					
				}

				else if (mesNascimento == 10 && diaNascimento <= 22) {
					System.out.println("Seu signo é " + signo10);
					
				}

				else if (mesNascimento == 11 && diaNascimento <= 21) {
					System.out.println("Seu signo é " + signo11);
					
				}

				else if (mesNascimento == 12 && diaNascimento <= 21) {
					System.out.println("Seu signo é " + signo12);
					
				}
				

				System.out.println("\nDigite a letra s para realizar outra consulta ou a letra n para encerrar: ");
				continua = leia.next();

				System.out.println("__________Fim da Consulta____________");

			}
		}

	}

}
