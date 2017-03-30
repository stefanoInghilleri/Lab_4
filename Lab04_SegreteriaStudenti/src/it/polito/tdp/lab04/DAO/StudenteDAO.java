package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {

	/*
	 * Ottengo tutti i corsi salvati nel Db
	 */
	public List<Studente> getTuttiGliStudenti() throws ClassNotFoundException {

		final String sql = "SELECT * FROM studente";

		List<Studente> studenti = new LinkedList<Studente>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				int matricola=rs.getInt("matricola");
				String cognome=rs.getString("cognome");
				String nome=rs.getString("nome");
				String codiceCorso=rs.getString("CDS");
				Studente s=new Studente(matricola, cognome, nome, codiceCorso);
				studenti.add(s);
			}

			return studenti;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

	

}
