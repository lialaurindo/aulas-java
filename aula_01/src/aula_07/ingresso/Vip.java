package aula_07.ingresso;

import java.sql.Date;

public class Vip extends Ingresso{
	
	private Date dataValidade;
	
	public Vip(String nomeEstabelecimento, String dataIngresso, String tituloFilme, String tipoIngresso,
			String assentoSala, String salaFilme, String horarioFilme, Integer codigoIngresso, Double valorIngresso) {
		super(nomeEstabelecimento, dataIngresso, tituloFilme, tipoIngresso, assentoSala, salaFilme, horarioFilme,
				codigoIngresso, valorIngresso);
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	
}
