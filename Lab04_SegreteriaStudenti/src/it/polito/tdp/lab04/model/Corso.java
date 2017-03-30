package it.polito.tdp.lab04.model;

public class Corso {
	private String codice;
	private int crediti;
	private String nome;
	private int periodoDidattico;
	
	public Corso(String codice, int crediti, String nome, int periodoDidattico) {
		super();
		this.codice = codice;
		this.crediti = crediti;
		this.nome = nome;
		this.periodoDidattico = periodoDidattico;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the crediti
	 */
	public int getCrediti() {
		return crediti;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the periodoDidattico
	 */
	public int getPeriodoDidattico() {
		return periodoDidattico;
	}

	
}
