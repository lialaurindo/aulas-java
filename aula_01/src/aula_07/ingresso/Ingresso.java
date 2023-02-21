package aula_07.ingresso;

public class Ingresso {

	/*
	 * Defina pelo menos 5 Atributos relevantes ao Ingresso de um evento; Método
	 * Construtor com parâmetros; Métodos Get e Set para todos os Atributos da
	 * Classe Ingresso; Método visualizar;
	 * 
	 */

	private String nomeEstabelecimento;
	private String dataIngresso;
	private String tituloFilme;
	private String tipoIngresso;
	private String assentoSala;
	private String salaFilme;
	private String horarioFilme;
	private Integer codigoIngresso;
	private Double valorIngresso;

	public Ingresso(String nomeEstabelecimento, String dataIngresso, String tituloFilme, String tipoIngresso,
			String assentoSala, String salaFilme, String horarioFilme, Integer codigoIngresso, Double valorIngresso) {

		this.nomeEstabelecimento = nomeEstabelecimento;
		this.dataIngresso = dataIngresso;
		this.tituloFilme = tituloFilme;
		this.tipoIngresso = tipoIngresso;
		this.assentoSala = assentoSala;
		this.salaFilme = salaFilme;
		this.horarioFilme = horarioFilme;
		this.codigoIngresso = codigoIngresso;
		this.valorIngresso = valorIngresso;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getTituloFilme() {
		return tituloFilme;
	}

	public void setTituloFilme(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}

	public String getAssentoSala() {
		return assentoSala;
	}

	public void setAssentoSala(String assentoSala) {
		this.assentoSala = assentoSala;
	}

	public String getSalaFilme() {
		return salaFilme;
	}

	public void setSalaFilme(String salaFilme) {
		this.salaFilme = salaFilme;
	}

	public String getHorarioFilme() {
		return horarioFilme;
	}

	public void setHorarioFilme(String horarioFilme) {
		this.horarioFilme = horarioFilme;
	}

	public Integer getCodigoIngresso() {
		return codigoIngresso;
	}

	public void setCodigoIngresso(Integer codigoIngresso) {
		this.codigoIngresso = codigoIngresso;
	}

	public Double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(Double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public void visualizar() {

		System.out.println(this.nomeEstabelecimento + "\n" + this.dataIngresso +  " | Cod. Ingresso: " + this.codigoIngresso 
				+ "\n" + this.tituloFilme + "\n" + this.tipoIngresso + "\n" + "Lugar: " + this.assentoSala + "\n" + this.salaFilme 
				+ "\n" + this.horarioFilme + "\n" + "Valor Ingresso: " + this.valorIngresso + "\n");
	}

}
