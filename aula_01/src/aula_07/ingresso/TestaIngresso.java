package aula_07.ingresso;

public class TestaIngresso {

	public static void main(String[] args) {

		/*
		 * Instanciar 2 Objetos da Classe Ingresso;
		 * Utilizar o Método visualizar() para exibir dados dos 2 Objetos Instanciados.
		 */		
		
		Ingresso ingressoCliente1 = new Ingresso ("ESPAÇO ITAÚ", "14-02-2019", "Minha Fama de Mau", 
				"Meia-Entrada", "H 5", "Sala 05", "19h00", 80590, 16.00);
		
		Ingresso ingressoCliente2 = new Ingresso ("ESPAÇO ITAÚ", "14-02-2019", "Minha Fama de Mau", 
				"Meia-Entrada", "H 6", "Sala 05", "19h00", 80591, 16.00);
		
		ingressoCliente1.visualizar();
		ingressoCliente2.visualizar();
		

	}

}
