package aula_07.ingresso;

import java.sql.Date;

public class Vip extends Ingresso{
	
	private String dataValidade;
	
	public Vip(String nomeEstabelecimento, String dataIngresso, String tituloFilme, String tipoIngresso,
			String assentoSala, String salaFilme, String horarioFilme, Integer codigoIngresso, Double valorIngresso,
			String dataValidade) {
		super(nomeEstabelecimento, dataIngresso, tituloFilme, tipoIngresso, assentoSala, salaFilme, horarioFilme,
				codigoIngresso, valorIngresso);
		this.dataValidade = dataValidade;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public void visualizar() {
		
		super.visualizar();
		System.out.println("Número de rodas: " + this.dataValidade);
	}
	
}
