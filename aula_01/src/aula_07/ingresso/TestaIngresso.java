package aula_07.ingresso;

public class TestaIngresso {

	public static void main(String[] args) {

		/*
		 * Instanciar 2 Objetos da Classe Ingresso;
		 * Utilizar o Método visualizar() para exibir dados dos 2 Objetos Instanciados.
		 */		
		
		Ingresso ingressoCliente1 = new Ingresso ("ESPAÇO ITAÚ", "24/02/2023", "Minha Fama de Mau", 
				"Meia-Entrada", "H 5", "Sala 05", "19h00", 80590, 32.00);
		
		Ingresso ingressoCliente2 = new Ingresso ("ESPAÇO ITAÚ", "24/02/2023", "Minha Fama de Mau", 
				"Meia-Entrada", "H 6", "Sala 05", "19h00", 80591, 32.00);
		
		
		Vip vipCliente3 = new Vip ("ESPAÇO ITAÚ", "24/02/2023", "Minha Fama de Mau", 
				"Meia-Entrada", "H 7", "Sala 05", "19h00", 80580, 00.00, "24/02/2023");
		
		Vip vipCliente4 = new Vip ("ESPAÇO ITAÚ", "24/02/2023", "Minha Fama de Mau", 
				"Meia-Entrada", "H 8", "Sala 05", "19h00", 80581, 00.00, "24/02/2023");
		
		
		MeiaEntrada meiaEntradaCliente5 = new MeiaEntrada ("ESPAÇO ITAÚ", "24/02/2023", "Minha Fama de Mau", 
				"Meia-Entrada", "I 5", "Sala 05", "19h00", 80570, 16.00, 963696);
		
		MeiaEntrada meiaEntradaCliente6 = new MeiaEntrada ("ESPAÇO ITAÚ", "24/02/2023", "Minha Fama de Mau", 
				"Meia-Entrada", "I 6", "Sala 05", "19h00", 80570, 16.00, 963697);
		
		
		ingressoCliente1.visualizar();
		ingressoCliente2.visualizar();
		vipCliente3.visualizar();
		vipCliente4.visualizar();
		meiaEntradaCliente5.visualizar();
		meiaEntradaCliente6.visualizar();
	}

}
