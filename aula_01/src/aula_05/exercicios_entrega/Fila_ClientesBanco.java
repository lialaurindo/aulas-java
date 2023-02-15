package aula_05.exercicios_entrega;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_ClientesBanco {

	public static void main(String[] args) {

			/*
		    	Exercício: organizar a ordem de chegada dos Clientes de um Banco. 
		    [x] O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
			[x] 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
			[x] 2: Listar todos os Clientes na fila
			[x] 3: Chamar (retirar) uma pessoa da fila 
			[x] 0: O programa deve ser finalizado.
			[x] Se fila vazia ao consultar ou remover cliente, deverá ser informado;
			
			*/
		
			Queue<String> filaBanco = new LinkedList<String>();

			Scanner leia = new Scanner(System.in);
			int opcao;
			String cliente;

			do {

				System.out.println("_________GERENCIAMENTO DE FILA________\n");
				System.out.println("1. Cadastro de cliente na fila");
				System.out.println("2. Exibir todos os clientes da fila");
				System.out.println("3. Chamar próximo cliente da fila");
				System.out.println("0. Sair do sistema");
				System.out.println("Digite o número da opção desejada: ");
				opcao = leia.nextInt();

				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();
					filaBanco.add(cliente);
					System.out.println("Cadastro concluído: " + cliente + ", agora está fila!\n");
					break;

				case 2:
					System.out.println("Clientes por ordem de chegada: ");
					if (filaBanco.isEmpty())
						System.out.println("Não há clientes nesta fila.\n");
					else
						filaBanco.forEach(System.out::println);
					break;

				case 3:
					if (filaBanco.isEmpty())
						System.out.println("Não há clientes nesta fila\n");
					else
						System.out.println("Chegou sua vez, " + filaBanco.poll() + "\nDirija-se ao guichê 1\n");

				default:
					if (opcao > 3)
						System.out.println("Opção inválida!");
				}

			} while (opcao != 0);
			System.out.println("Sistema finalizado!");
			
			leia.close();

		/*
		 * Esperado: 
		 * _________GERENCIAMENTO DE FILA________
		 * 1. Cadastro de cliente na fila
		 * 2. Exibir todos os clientes da fila
		 * 3. Chamar próximo cliente da fila
		 * 0. Sair do sistema
		 * Digite o número da opção desejada: 
		 * 
		 * 
		 * 3
		 * Não há clientes nesta fila
		 * 
		 * 1
		 * Digite o nome do cliente: 
		 * João
		 * Cadastro concluído: João, agora está na fila!
		 * 
		 * 1
		 * Digite o nome do cliente: 
		 * Maria
		 * Cadastro concluído: Maria, agora está na fila!
		 * 
		 * 1
		 * Digite o nome do cliente: 
		 * Ana
		 * Cadastro concluído: Ana, agora está na fila!
		 * 
		 * 2
		 * Clientes por ordem de chegada: 
		 * João
		 * Maria
		 * Ana
		 * 
		 * 3
		 * Chegou sua vez, João
		 * Dirija-se ao guichê 1
		 * 
		 * 0
		 * Sistema finalizado!
		 */
		
		
	}

}
