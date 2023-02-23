package aula_07.ingresso;

public class MeiaEntrada extends Ingresso{
	
	private Long numeroCarteirinha;
	
	public MeiaEntrada(String nomeEstabelecimento, String dataIngresso, String tituloFilme, String tipoIngresso,
			String assentoSala, String salaFilme, String horarioFilme, Integer codigoIngresso, Double valorIngresso) {
		super(nomeEstabelecimento, dataIngresso, tituloFilme, tipoIngresso, assentoSala, salaFilme, horarioFilme,
				codigoIngresso, valorIngresso);	
	}

	public Long getNumeroCarteirinha() {
		return numeroCarteirinha;
	}

	public void setNumeroCarteirinha(Long numeroCarteirinha) {
		this.numeroCarteirinha = numeroCarteirinha;
	}

}
