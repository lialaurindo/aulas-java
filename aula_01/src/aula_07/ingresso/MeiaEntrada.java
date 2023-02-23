package aula_07.ingresso;

public class MeiaEntrada extends Ingresso{
	
	private Integer numeroCarteirinha;

	public MeiaEntrada(String nomeEstabelecimento, String dataIngresso, String tituloFilme, String tipoIngresso,
			String assentoSala, String salaFilme, String horarioFilme, Integer codigoIngresso, Double valorIngresso,
			Integer numeroCarteirinha) {
		super(nomeEstabelecimento, dataIngresso, tituloFilme, tipoIngresso, assentoSala, salaFilme, horarioFilme,
				codigoIngresso, valorIngresso);
		this.numeroCarteirinha = numeroCarteirinha;
	}

	public Integer getNumeroCarteirinha() {
		return numeroCarteirinha;
	}

	public void setNumeroCarteirinha(Integer numeroCarteirinha) {
		this.numeroCarteirinha = numeroCarteirinha;
	}
	
	public void visualizar() {
		
		super.visualizar();
		System.out.println("Carteira Estudante nº: " + this.numeroCarteirinha);
	}
}
