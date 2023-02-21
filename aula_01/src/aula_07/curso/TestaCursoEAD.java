package aula_07.curso;

public class TestaCursoEAD {

	public static void main(String[] args) {
		
		/*
		 * Instanciar 2 Objetos da Classe Curso;
		 * Utilizar o Método visualizar() para exibir dados dos 2 Objetos Instanciados.
		 */

		CursoEAD cursoTecnologia = new CursoEAD("Tecnologia", "Análise e Desenvolvimento de Sistemas", "3 anos", 
				"\n- Segurança da Informação        |  - Linguagens de Programação\n"
				+ "- Análise Orientada a Objetos    |  - Redes de Computadores\n"
				+ "- Estrutura de Dados             |  - Programação em Banco de Dados\n"
				+ "- Programação Estruturada        |  - Programação Orientada a Objetos", 
				"O Analista de Sistemas é o profissional que analisa, projeta,\n"
				+ "documenta, especifica, testa, implanta e cuida da manutenção\n"
				+ "de sistemas computacionais e softwares.\n", 
				500.00f);

		CursoEAD cursoNegocios = new CursoEAD("Gestão e Negócios", "Gestão Financeira", "3 anos", 
				"\n- Crédito, Cobrança e Risco      |  - Análise de Custos\n"
				+ "- Auditoria e Controladoria      |  - Matemática Financeira\n"
				+ "- Métodos Quantitativos          |  - Planejamento Tributário\n"
				+ "- Mercado de Capitais            |  - Microeconomia", 
				"O gestor financeiro pode trabalhar como gerente, analista,\n"
				+ "supervisor e até diretor em empresas de todos os portes, no comércio,\n"
				+ "na indústria, no terceiro setor ou mesmo como empreendedor ou consultor.\n", 
				500.00f);

		cursoTecnologia.visualizar();
		cursoNegocios.visualizar();

	}
}
