package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.*;

public class Model {
	CorsoDAO corsoDAO;
	
	public Model(){
		corsoDAO=new CorsoDAO();
	}
	public List<Corso> getTuttiICorsi() throws ClassNotFoundException {
		return corsoDAO.getTuttiICorsi();
	}
		
	
}
