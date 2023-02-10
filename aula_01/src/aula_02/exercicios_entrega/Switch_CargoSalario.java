package aula_02.exercicios_entrega;

import java.util.Scanner;

public class Switch_CargoSalario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Input nome do colaborador
		 * Input código do cargo
		 * Input salario atual
		 * Realiza salario atual * percentual de reajuste relacionado ao cargo
		 * Mostra nome do colaborador
		 * Mostra cargo relacionado ao código do cargo
		 * Mostra salario atualizado com o reajuste realizado
		 * 
		 */
		
		String nomeColaborador; int codigoCargo; 
		double salarioAtual; double salarioReajustado;
		
//Cargos da Tabela
		String cargo1 = "Gerente", cargo2 = "Vendedor", cargo3 = "Supervisor", 
		cargo4 = "Motorista", cargo5 = "Estoquista", cargo6 = "Técnico de Ti";
		
//Reajustes por Cargo
		double reajusteCargo1 = 0.10, reajusteCargo2 = 0.07, reajusteCargo3 = 0.09, 
		reajusteCargo4 = 0.06, reajusteCargo5 = 0.05, reajusteCargo6 = 0.08;

//Pede Entradas para cálculo	
		System.out.println("Digite o nome do Colaborador: ");
		nomeColaborador = leia.nextLine();
		
		System.out.println("Digite o Código do Cargo de " + nomeColaborador);
		codigoCargo = leia.nextInt();
		
		System.out.println("Digite salário atual de " + nomeColaborador);
		salarioAtual = leia.nextFloat();

//Saída infos + Salário Reajustado
		
		switch (codigoCargo) {

		case 1:
			salarioReajustado = salarioAtual + (salarioAtual * reajusteCargo1);
			System.out.println("Colaborador: " + (nomeColaborador) + "\nCargo Atual: " + (cargo1) 
					+ "\nSalário Reajustado:: R$" + (salarioReajustado));
			break;

		case 2:
			salarioReajustado = salarioAtual + (salarioAtual * reajusteCargo2);
			System.out.println("Colaborador: " + (nomeColaborador) + "\nCargo Atual: " + (cargo2) 
					+ "\nSalário Reajustado:: R$" + (salarioReajustado));
			break;

		case 3:
			salarioReajustado = salarioAtual + (salarioAtual * reajusteCargo3);
			System.out.println("Colaborador: " + (nomeColaborador) + "\nCargo Atual: " + (cargo3) 
					+ "\nSalário Reajustado:: R$" + (salarioReajustado));
			break;

		case 4:
			salarioReajustado = salarioAtual + (salarioAtual * reajusteCargo4);
			System.out.println("Colaborador: " + (nomeColaborador) + "\nCargo Atual: " + (cargo4) 
					+ "\nSalário Reajustado:: R$" + (salarioReajustado));
			break;

		case 5:
			salarioReajustado = salarioAtual + (salarioAtual * reajusteCargo5);
			System.out.println("Colaborador: " + (nomeColaborador) + "\nCargo Atual: " + (cargo5) 
					+ "\nSalário Reajustado:: R$" + (salarioReajustado));
			break;
			
		case 6:
			salarioReajustado = salarioAtual + (salarioAtual * reajusteCargo6);
			System.out.println("Colaborador: " + (nomeColaborador) + "\nCargo Atual: " + (cargo6) 
					+ "\nSalário Reajustado:: R$" + (salarioReajustado));
			break;
			
		default:
			System.out.println("Informações não encontradas!");

		}	
	
		leia.close();
		
		/*
		 * Esperado: 
		 * Digite o nome do Colaborador: 
		 * Paulo Henrique
		 * Digite o Código do Cargo de Paulo Henrique
		 * 2
		 * Digite salário atual de Paulo Henrique
		 * 2500
		 * Colaborador: Paulo Henrique
		 * Cargo Atual: Vendedor
		 * Salário Reajustado:: R$2675.0
		 * 
		 */
		
		
	}
}
