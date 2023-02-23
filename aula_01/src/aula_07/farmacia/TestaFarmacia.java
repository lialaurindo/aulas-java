package aula_07.farmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);

		ArrayList<Farmacia> farmacia = new ArrayList<Farmacia>();

		long id;
		String nome, nomeComercial, fabricante, foto, opcao, principioAtivo, fragrancia;
		float preco;
		int tipo;

		do {

			System.out.println("\nId: ");
			id = leia.nextLong();

			System.out.println("\nNome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();

			System.out.println("\nNome Comercial: ");
			nomeComercial = leia.nextLine();

			System.out.println("\nFabricante: ");
			fabricante = leia.nextLine();

			System.out.println("\nFoto: ");
			foto = leia.nextLine();

			System.out.println("\nPreÃ§o: ");
			preco = leia.nextFloat();

			System.out.println("\nPreÃ§o: ");
			tipo = leia.nextInt();

			switch (tipo) {
			case 1 -> {

				System.out.println("\nPrincipio Ativo: ");
				leia.skip("\\R");
				principioAtivo = leia.nextLine();

				Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco, tipo, principioAtivo);
				farmacia.add(m1);
			}
			case 2 -> {

				System.out.println("\nFragrância: ");
				leia.skip("\\R");
				fragrancia = leia.nextLine();

				Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco, tipo, fragrancia);
				farmacia.add(p1);
			}

			}

			System.out.println("\nDeseja continuar? ");
			leia.skip("\\R?");
			opcao = leia.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var produto : farmacia) {
			produto.reajuste(0.10f);
			produto.visualizar();
		}

		// Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", "-",
		// 20.0f);
		// f1.visualizar();
		// f2.visualizar();

		leia.close();

	}

}
