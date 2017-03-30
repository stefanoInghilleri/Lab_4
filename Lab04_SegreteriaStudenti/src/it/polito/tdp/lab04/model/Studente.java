package it.polito.tdp.lab04.model;

public class Studente {
	private int  matricola;
	private String cognome;
	private String nome;
	private String codiceCorso;
	
	public Studente(int matricola, String cognome, String nome, String codiceCorso) {
		super();
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.codiceCorso = codiceCorso;
	}

	/**
	 * @return the matricola
	 */
	public int getMatricola() {
		return matricola;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the codiceCorso
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}
	
}
