package aula_07.curso;

public class CursoEAD {
	
	
	/*
	 * Defina pelo menos 5 Atributos relevantes ao Curso EAD;
	 * Método Construtor com parâmetros;
	 * Métodos Get e Set para todos os Atributos da Classe Curso;
	 * Método visualizar;
	 * 
	 */

	private String categoria;
	private String nomeCurso;
	private String duracao;
	private String gradeCurricular;
	private String descricao;
	private Double mensalidade;

	public CursoEAD(String categoria, String nomeCurso, String duracao, String gradeCurricular, String descricao,
			double mensalidade) {

		this.categoria = categoria;
		this.nomeCurso = nomeCurso;
		this.duracao = duracao;
		this.gradeCurricular = gradeCurricular;
		this.descricao = descricao;
		this.mensalidade = mensalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getGradeCurricular() {
		return gradeCurricular;
	}

	public void setGradeCurricular(String gradeCurricular) {
		this.gradeCurricular = gradeCurricular;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public void visualizar() {
		System.out.println("________________________________________________________________________");
		System.out.println("                             Cursos UNISCP                              ");
		System.out.println("========================================================================\n");

		System.out.println(this.categoria);
		System.out.println("Curso: " + this.nomeCurso);
		System.out.println("Duracao: " + this.duracao);
		System.out.println("Mensalidade: " + this.mensalidade + "\n"
				+ "________________________________________________________________________");
		System.out.println("Grade Curricular:\n" + this.gradeCurricular + "\n");
		System.out.println(this.descricao);
		
		System.out.println("                        © 2023 UNISCP • Dúvidas? Envie para: 11 9999-9999");

	}

}
