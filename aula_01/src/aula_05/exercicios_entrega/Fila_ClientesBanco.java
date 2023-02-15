package aula_05.exercicios_entrega;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_ClientesBanco {

	public static void main(String[] args) {

			/*
		    Organizar a ordem de chegada dos Clientes de um Banco. 
		    - O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
			2: Listar todos os Clientes na fila
			3: Chamar (retirar) uma pessoa da fila 
			0: O programa deve ser finalizado.
			- Caso a fila esteja vazia, o programa deverá informar
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
				System.out.println("Cadastro concluído: " + cliente + ", agora está cadastrado na fila!\n");
				break;
				
			case 2:
				System.out.println("Clientes por ordem de chegada: ");
				if (filaBanco.isEmpty())
					System.out.println("Não há clientes cadastrados nesta fila.\n");
				else 
					filaBanco.forEach(System.out::println);
				break;
				
				case 3:
					if (filaBanco.isEmpty())
						System.out.println("Não há clientes cadastrados nesta fila\n");
					else 
					System.out.println("Chegou sua vez, " + filaBanco.poll() + "\nDirija-se ao guichê 1\n");	

				default:
						if (opcao > 3)
							System.out.println("Opção inválida!");	
						}

		} while (opcao != 0);
		System.out.println("Sistema finalizado!");
		
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
		 * Não há clientes cadastrados nesta fila
		 * 
		 * 1
		 * Digite o nome do cliente: 
		 * João
		 * Cadastro concluído: João, agora está cadastrado na fila!
		 * 
		 * 1
		 * Digite o nome do cliente: 
		 * Maria
		 * Cadastro concluído: Maria, agora está cadastrado na fila!
		 * 
		 * 1
		 * Digite o nome do cliente: 
		 * Ana
		 * Cadastro concluído: Ana, agora está cadastrado na fila!
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
