package it.edu.iisvolta;

import java.util.ArrayList;

public class Campionato {
	private String nome;
	private ArrayList<Squadra> elencoSquadre;
	private ArrayList<Partita> elencoPartite;
	
	public Campionato(String nome) {
		super();
		this.nome = nome;
		//quando si crea il campionato le due liste sono vuote
		elencoSquadre=new ArrayList<Squadra>();	
		elencoPartite=new ArrayList<Partita>();		
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Squadra> getElencoSquadre() {
		return elencoSquadre;
	}

	public ArrayList<Partita> getElencoPartite() {
		return elencoPartite;
	}
	
	public void generaCalendario() {
		for(Squadra s1: elencoSquadre)
			for(Squadra s2: elencoSquadre) 
				if (s1!=s2) 				
					elencoPartite.add(new Partita(s1,s2));	
				
	}
	
	
	
	

}
